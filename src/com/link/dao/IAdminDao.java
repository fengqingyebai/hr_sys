package com.link.dao;


import com.link.entity.Admin;

/**
 * 管理员模块Dao接口
 *
 * @author link
 * @create 2017-04-01-8:29
 */
public interface IAdminDao {



    /**
     * 保存
     *
     * @param admin 管理员对象
     */
     void save(Admin admin);

    /**
     * 根据管理员信息查询
     * @param admin 管理员对象
     */
    Admin findByAdmin(Admin admin);

}
