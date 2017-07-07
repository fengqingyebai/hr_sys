package com.link.service;/**
 * Created by Administrator on 2017/4/1.
 */

import com.link.entity.Employee;

import java.util.List;

/**
 * 员工业务逻辑层接口
 *
 * @author link
 * @create 2017-04-01-12:41
 */
public interface IEmployeeService {
    /**
     * 保存员工
     * @param emp
     */
    void save(Employee emp);

    /**
     * 更新员工
     * @param emp
     */
    void update(Employee emp);

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    Employee findById(int id);

    /**
     * 查找所有员工
     * @return
     */
    List<Employee> getAll();

    /**
     * 根据员工姓名 查找
     * @param empName
     * @return
     */
    List<Employee> getAll(String empName);

    /**
     * 根据员工id 删除员工
     * @param id
     */
    void delete(int id);

    /**
     * 删除多个员工
     * @param ids
     */
    void deleteMany(int[] ids);

}
