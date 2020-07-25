package com.wwb.oa.dao;

import com.wwb.oa.entity.ClaimVoucherItem;
import com.wwb.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("claimVoucherItemDao")
public interface ClaimVoucherItemDao {
    void insert(ClaimVoucherItem claimVoucherItem);
    void update(ClaimVoucherItem claimVoucherItem);
    void delete(int id);
    List<ClaimVoucherItem> selectByClaimVoucher(int cvid);
}
