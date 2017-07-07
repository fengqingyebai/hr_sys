package com.link.dao.impl;


import com.link.dao.IEmployeeDao;
import com.link.entity.Employee;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * 员工Dao实现类
 *
 * @author link
 * @create 2017-04-01-9:20
 */
public class EmployeeDao implements IEmployeeDao {

    // IOC容器(依赖)注入SessionFactory对象
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Employee emp) {
           sessionFactory.getCurrentSession().save(emp);
    }

    @Override
    public void update(Employee emp) {
        sessionFactory.getCurrentSession().update(emp);
    }


    @Override
    public void delete(int id) {

        sessionFactory.getCurrentSession()
                .createQuery("delete from Employee where id=?")
                .setParameter(0,id)
                .executeUpdate();
    }

    @Override
    public Employee findById(int id) {
        return (Employee) sessionFactory.getCurrentSession()
                .get(Employee.class,id);
    }

    @Override
    public List<Employee> getAll() {
        return  sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }

    @Override
    public List<Employee> getAll(String empName) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Employee where empName like ?")
                .setParameter(0,"%"+empName+"%")
                .list();
    }
}
