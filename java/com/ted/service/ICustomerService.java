package com.ted.service;

import com.ted.pojo.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();

    Customer getCusById(int id);

    boolean deleteCus(Integer[] id);

    boolean updateCus(Customer customer);

    boolean saveCus(Customer customer);

    List<Customer> getCusByPage(int page,int limit);

    int getCount();

    Customer getCusByName(String name);

}
