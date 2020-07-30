package com.ted.controller;

import com.ted.pojo.Application;
import com.ted.pojo.Customer;
import com.ted.service.IApplicationService;
import com.ted.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ApplicationController {

    @Resource
    private IApplicationService ias ;
    @Resource
    private ICustomerService ics;

    @ResponseBody
    @GetMapping("/GetAppByPage")
    public Map<String ,Object> getCusByPage(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5" ) int limit) {
        Map<String ,Object> map = new HashMap<>();

        List<Application> list = ias.getAppByPage(page,limit);
        map.put("code",0);
        map.put("msg","");
        map.put("count",ias.getCount());
        map.put("data",list);

        return map;
    }

    @RequestMapping("/DeleteApp/{id}")
    @ResponseBody
    public String deleteCus(@PathVariable int id) {
        if (ias.deleteApplication(id)) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/NewApp")
    public ModelAndView newCus() {
        return new ModelAndView("newApp.jsp","application",new Application());
    }

    @PostMapping("/SaveApp")
    public ModelAndView saveApp(Application a ) {
        Customer c = ics.getCusByName(a.getCorpName());
        a.setCusId(c.getId());
        if (ias.saveApplication(a)) {
            return new ModelAndView("allApp.html");
        }
        return new ModelAndView("newApp.jsp","application",a);
    }

    @ResponseBody
    @RequestMapping("/GetAppById/{id}")
    public Application getAppById(@PathVariable int id) {
        return ias.getAppById(id);
    }

    @ResponseBody
    @PostMapping("/UpdateApp")
    public String updateApp(Application a) {
        if (ias.updateApplication(a)) {
            return "success";
        }

        return "failed";
    }
}
