package com.ks.stuaimis.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.ks.stuaimis.biz.bill.BillDetailBiz;
import com.ks.stuaimis.pojo.Bill;

@RestController
@RequestMapping("/api")
public class BillDetailAction {

	@Autowired
	private BillDetailBiz biz;
	
	@RequestMapping(value="billDetails/{billno}",method=RequestMethod.GET)
	public Map<String, Object> findAllBill(@PathVariable String billno){
		Map<String, Object> message=new HashMap<String,Object>();
		Bill bill=biz.findBill(billno);
		if(bill!=null) {
			message.put("code", "200");
			message.put("msg",JSON.toJSONString(bill));
		}else {
			message.put("code", "500");
			message.put("msg",null);
		}
		return message;
	}
	
	/*@RequestMapping(value="billDetails/billDetail",method=RequestMethod.POST)
	public Map<String, Object> addBillDetail(@RequestBody Bill bill){
		Map<String, Object> message = new HashMap<String, Object>();
		System.out.println(JSON.toJSONString(bill)+"===================");
		try {
			biz.addBillDetail(bill);
			message.put("code", "200");
			message.put("msg", "保存成功");
		} catch (Exception e) {
			message.put("code", "500");
			message.put("msg",e.getMessage());
		}
		
		return message;
	}*/
	
}
