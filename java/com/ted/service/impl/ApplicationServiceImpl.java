package com.ted.service.impl;

import com.github.pagehelper.PageHelper;
import com.ted.dao.IApplicationDao;
import com.ted.pojo.Application;
import com.ted.service.IApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplicationServiceImpl implements IApplicationService {

    @Resource
    private IApplicationDao iad;

    @Override
    public List<Application> getAllApplication() {
        return iad.getAllApplication();
    }

    @Override
    public boolean saveApplication(Application application) {
        return iad.saveApplication(application) > 0;
    }

    @Override
    public boolean deleteApplication(int id) {
        return iad.deleteApplication(id)> 0;
    }

    @Override
    public boolean updateApplication(Application a) {
        return iad.updateApplication(a)> 0;
    }

    @Override
    public Application getAppById(int id) {
        return iad.getAppById(id);
    }

    @Override
    public int getCount() {
        return iad.getCount();
    }

    @Override
    public List<Application> getAppByPage(int page, int limit) {
        PageHelper.startPage(page,limit);
        return iad.getAllApplication();
    }
}
