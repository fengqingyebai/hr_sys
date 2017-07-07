package com.link.service;

import com.link.entity.Admin;

/**
 * Created by link on 2017/4/1.
 */
public interface IAdminService {

    /**
     * 注册
     * @param admin
     */
    void resgister(Admin admin);

    /**
     * 登陆
     * @param admin
     * @return
     */
      Admin login(Admin admin);

}
