package com.wwb.oa.biz;

import com.wwb.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
