package com.ks.stuaimis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ks.stuaimis.biz.bill.BillDetailBiz;
import com.ks.stuaimis.pojo.Bill;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-ctx.xml"})
public class BillDetailBizTest {

	@Autowired
	private BillDetailBiz biz;
	@Test
	public void testFingBill() {
		Bill bill=biz.findBill("20160119001");
		System.out.println(bill);
	}
}
