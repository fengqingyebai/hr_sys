package com.link.service.impl;


import com.link.dao.IAdminDao;
import com.link.entity.Admin;
import com.link.service.IAdminService;

/**
 * 管理员逻辑控制层实现
 *
 * @author link
 * @create 2017-04-01-12:57
 */
public class AdminService implements IAdminService {
    // 注入dao  【这里一定要用接口接收】
    private  IAdminDao adminDao; //JDK代理

    public void setAdminDao(IAdminDao adminDao) {
        this.adminDao = adminDao;
    }


    @Override
    public void resgister(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    public Admin login(Admin admin) {
        return adminDao.findByAdmin(admin);
    }
}
