package com.ted.dao;

import com.ted.pojo.Application;

import java.util.List;

public interface IApplicationDao {
    List<Application> getAllApplication();

    int saveApplication(Application application);

    int deleteApplication(int id);

    int updateApplication(Application a);

    Application getAppById(int id);

    int getCount();

    List<Application> getAppByPage(int page, int limit);
}
