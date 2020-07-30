package com.ted.service.impl;

import com.github.pagehelper.PageHelper;
import com.ted.dao.ICustomerDao;
import com.ted.pojo.Customer;
import com.ted.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private ICustomerDao icd;

    @Override
    public List<Customer> getAllCustomer() {
        return icd.getAllCustomer();
    }

    @Override
    public Customer getCusById(int id) {
        return icd.getCusById(id);
    }

    @Override
    public boolean deleteCus(Integer[] id) {
        return icd.deleteCus(id) > 0;
    }

    @Override
    public boolean updateCus(Customer customer) {
        return icd.updateCus(customer) > 0;
    }

    @Override
    public boolean saveCus(Customer customer) {
        return icd.saveCus(customer) > 0;
    }

    @Override
    public List<Customer> getCusByPage(int page, int limit) {
        PageHelper.startPage(page,limit);

        return icd.getAllCustomer();
    }

    @Override
    public int getCount() {
        return icd.getCount();
    }

    @Override
    public Customer getCusByName(String name){
       return icd.getCusByName(name);
    }

}
