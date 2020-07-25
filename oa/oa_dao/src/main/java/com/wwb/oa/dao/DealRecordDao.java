package com.wwb.oa.dao;

import com.wwb.oa.entity.DealRecord;
import com.wwb.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);
}
