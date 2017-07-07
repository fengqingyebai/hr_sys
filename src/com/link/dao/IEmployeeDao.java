package com.link.dao;


import com.link.entity.Employee;

import java.util.List;

/**
 * 员工接口
 *
 * @author link
 * @create 2017-04-01-8:31
 */
public interface IEmployeeDao {

    /**
     * 保存员工
     * @param emp
     */
    void save(Employee emp);

    /**
     * 更新员工信息
     * @param emp
     */
    void update(Employee emp);

    /**
     * 删除指定员工
     * @param id
     */
    void delete(int id);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Employee findById(int id);

    /**
     *获取所有员工信息
     * @return 所有员工
     */
    List<Employee> getAll();

    /**
     * 根据员工姓名查询员工信息
     * @param empName
     * @return
     */
    List<Employee> getAll(String empName);



}
