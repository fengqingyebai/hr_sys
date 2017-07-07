package com.link.dao.impl;


import com.link.dao.IAdminDao;
import com.link.entity.Admin;
import org.hibernate.SessionFactory;


/**
 * 管理员dao
 *
 * @author link
 * @create 2017-04-01-9:12
 */
public class AdminDao implements IAdminDao{

    // IOC容器(依赖)注入SessionFactory对象
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Admin admin) {

        sessionFactory.getCurrentSession().save(admin);

    }

    @Override
    public Admin findByAdmin(Admin admin) {

       return  (Admin) sessionFactory.getCurrentSession()//
                .createQuery("from Admin where adminName=? and pwd=?")//
                .setString(0, admin.getAdminName())//
                .setString(1, admin.getPwd())//
                .uniqueResult();

    }
}
