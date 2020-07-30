package com.ted.dao;

import com.ted.pojo.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> getAllCustomer();

    Customer getCusById(int id);

    int deleteCus(Integer[] id);

    int updateCus(Customer customer);

    int saveCus(Customer customer);

    List<Customer> getCusByPage(int page,int limit);

    int getCount();

    Customer getCusByName(String name);
}
