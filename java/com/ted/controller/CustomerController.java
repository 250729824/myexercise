package com.ted.controller;

import com.ted.pojo.Customer;
import com.ted.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Resource
    private ICustomerService ics;

    @ResponseBody
    @GetMapping("/GetAllCustomer")
    public Map<String ,Object> getAllCustomer() {
        Map<String ,Object> map = new HashMap<>();

        List<Customer> list = ics.getAllCustomer();
        map.put("code",0);
        map.put("msg","");
        map.put("count",list.size());
        map.put("data",list);

        return map;
    }

    @ResponseBody
    @GetMapping("/GetCusByPage")
    public Map<String ,Object> getCusByPage(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "5" ) int limit) {
        Map<String ,Object> map = new HashMap<>();

        List<Customer> list = ics.getCusByPage(page,limit);
        map.put("code",0);
        map.put("msg","");
        map.put("count",ics.getCount());
        map.put("data",list);

        return map;
    }

    @RequestMapping("/DeleteCustomer")
    @ResponseBody
    public String deleteCus(@RequestParam Integer[] id) {
        if (ics.deleteCus(id)) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/NewCustomer")
    public ModelAndView newCus() {
        return new ModelAndView("newCus.jsp","customer",new Customer());
    }

    @PostMapping("/SaveCustomer")
    public ModelAndView saveCus(Customer customer) {
        if (ics.saveCus(customer)) {
            return new ModelAndView("allCus.html");
        }

        return new ModelAndView("newCus.jsp","customer",customer);
    }

    @ResponseBody
    @RequestMapping("/GetCusById/{id}")
    public Customer getCusById(@PathVariable int id) {
        return ics.getCusById(id);
    }

    @ResponseBody
    @PostMapping("/UpdateCus")
    public String updateCus(Customer customer) {
        if (ics.updateCus(customer)) {
            return "success";
        }

        return "failed";
    }
}
