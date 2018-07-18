package com.ks.stuaimis.pojo;

/**
 * ���������
 * @author pxh
 *
 */
public class Detail {

	private Integer lineid;//行号
	private String goodsname;//商品名称
	private Integer goodsnum;//数量
	private Float goodsprice;//单价
	private Float goodsmoneyamt;//金额
	private Integer ispresent;//是否赠品

	private Bill bill;

	public Integer getLineid() {
		return lineid;
	}

	public void setLineid(Integer lineid) {
		this.lineid = lineid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Integer getGoodsnum() {
		return goodsnum;
	}

	public void setGoodsnum(Integer goodsnum) {
		this.goodsnum = goodsnum;
	}

	public Float getGoodsprice() {
		return goodsprice;
	}

	public void setGoodsprice(Float goodsprice) {
		this.goodsprice = goodsprice;
	}

	public Float getGoodsmoneyamt() {
		return this.goodsprice*this.goodsnum;
	}

	public void setGoodsmoneyamt(Float goodsmoneyamt) {
		this.goodsmoneyamt = goodsmoneyamt;
	}

	public Integer getIspresent() {
		return ispresent;
	}

	public void setIspresent(Integer ispresent) {
		this.ispresent = ispresent;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Detail(String goodsname, Integer goodsnum, Float goodsprice,
			Integer ispresent) {
		super();
		this.goodsname = goodsname;
		this.goodsnum = goodsnum;
		this.goodsprice = goodsprice;
		this.ispresent = ispresent;
	}

	public Detail() {
		super();
	}

	@Override
	public String toString() {
		return "Detail [lineid=" + lineid + ", goodsname=" + goodsname + ", goodsnum=" + goodsnum + ", goodsprice="
				+ goodsprice + ", goodsmoneyamt=" + goodsmoneyamt + ", ispresent=" + ispresent + "]";
	}
	
}
