package com.link.service;/**
 * Created by Administrator on 2017/4/1.
 */

import com.link.entity.Dept;

import java.util.List;

/**
 * 部门业务逻辑层接口
 *
 * @author link
 * @create 2017-04-01-12:40
 */
public interface IDeptService {

    /**
     * 查询全部
     * @return
     */
   List<Dept> getAll();

    /**
     * 根据ID进行查询
     * @param id
     * @return
     */
   Dept findById(int id);
}
