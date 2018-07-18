package com.ks.stuaimis.biz.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ks.stuaimis.dao.bill.IBillDetailDao;
import com.ks.stuaimis.pojo.Bill;

@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true,rollbackFor= {Exception.class})
@Service
public class BillDetailBiz {

	@Autowired
	private IBillDetailDao dao;

	public Bill findBill(String billno) {
		return dao.findAllBill(billno);
	}

	/*@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	public void addBill() {

	}*/
}
