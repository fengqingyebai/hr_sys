package com.link.service.impl;


import com.link.dao.IEmployeeDao;
import com.link.entity.Employee;
import com.link.service.IEmployeeService;

import java.util.List;

/**
 * 员工逻辑控制层实现
 *
 * @author link
 * @create 2017-04-01-12:59
 */
public class EmployeeService implements IEmployeeService {

    private IEmployeeDao employeeDao;

    public void setEmployeeDao(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void save(Employee emp) {
        employeeDao.save(emp);
    }

    @Override
    public void update(Employee emp) {
        employeeDao.update(emp);
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public List<Employee> getAll(String empName) {
        return employeeDao.getAll(empName);
    }

    @Override
    public void delete(int id) {
        employeeDao.delete(id);
    }

    @Override
    public void deleteMany(int[] ids) {
        if (ids != null && ids.length >0) {
          for (int id:ids) {
              delete(id);
          }
        }
    }
}
