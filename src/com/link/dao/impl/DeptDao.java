package com.link.dao.impl;


import com.link.dao.IDeptDao;
import com.link.entity.Dept;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * 部门的dao
 *
 * @author link
 * @create 2017-04-01-9:19
 */
public class DeptDao implements IDeptDao {

    // IOC容器(依赖)注入SessionFactory对象
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Dept> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Dept").list();

    }

    @Override
    public Dept findById(int id) {
        return (Dept) sessionFactory.getCurrentSession()
                .get(Dept.class,id);
    }



}
