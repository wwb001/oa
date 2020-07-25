package com.wwb.oa.biz.impl;

import com.wwb.oa.biz.DepartmentBiz;
import com.wwb.oa.dao.DepartmentDao;
import com.wwb.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public void add(Department department) {
        departmentDao.insert(department);
    }

    @Override
    public void edit(Department department) {
        departmentDao.update(department);
    }

    @Override
    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    @Override
    public Department get(String sn) {
        return departmentDao.select(sn);
    }

    @Override
    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
