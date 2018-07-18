package com.ks.stuaimis.dao.bill;


import org.apache.ibatis.annotations.Param;

import com.ks.stuaimis.pojo.Bill;



/**
 * 订单数据操作
 * @author pxh
 *
 */
public interface IBillDetailDao {

	/**
	 * 查询
	 * @return
	 */
	public Bill findAllBill(@Param("billno")String billno);
	/**
	 * 新增
	 * @param bill
	 */
	public void saveBillDetail(@Param("bill")Bill bill);
	
}
