package com.link.dao;


import com.link.entity.Dept;
import com.link.entity.Employee;

import java.util.List;

/**
 * 部门接口
 *
 * @author link
 * @create 2017-04-01-8:30
 */
public interface IDeptDao {
    /**
     * 查询所有部门信息
     * @return 全部信息
     */
   List<Dept> findAll();

    /**
     * 根据主键查询部门
     * @param id  主键
     * @return 部门
     */
   Dept findById(int id);


}
