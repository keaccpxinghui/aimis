package com.ks.stuaimis.test;
import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ks.stuaimis.dao.bill.IBillDetailDao;
import com.ks.stuaimis.pojo.Bill;

public class BillDetailDaoTest {

	private SqlSessionFactory ssf;
	private Logger logger = Logger.getRootLogger();

	@Before
	public void initFactory() {
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		try {
			ssf = sfb.build(Resources.getResourceAsStream("MyBatisConfig.xml"));
		} catch (IOException e) {
			logger.error("配置文佳加载失败", e);
		}
	}

	@Test
	public void testBillQuery() throws Exception {
		SqlSession session=ssf.openSession();
		IBillDetailDao dao=session.getMapper(IBillDetailDao.class);
		Bill bill=dao.findAllBill("20160119001");
		System.out.println(bill);
		
	}
}
