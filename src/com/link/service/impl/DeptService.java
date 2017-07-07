package com.link.service.impl;


import com.link.dao.IDeptDao;
import com.link.entity.Dept;
import com.link.service.IDeptService;

import java.util.List;

/**
 * 部门逻辑控制层实现
 *
 * @author link
 * @create 2017-04-01-12:58
 */
public class DeptService implements IDeptService {

    private IDeptDao deptDao;

    public void setDeptDao(IDeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public List<Dept> getAll() {
        return deptDao.findAll();
    }

    @Override
    public Dept findById(int id) {
        return deptDao.findById(id);
    }
}
