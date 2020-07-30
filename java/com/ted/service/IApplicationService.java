package com.ted.service;

import com.ted.pojo.Application;

import java.util.List;

public interface IApplicationService {

    List<Application> getAllApplication();

    boolean saveApplication(Application application);

    boolean deleteApplication(int id);

    boolean updateApplication(Application a);

    Application getAppById(int id);

    int getCount();

    List<Application> getAppByPage(int page, int limit);

}
