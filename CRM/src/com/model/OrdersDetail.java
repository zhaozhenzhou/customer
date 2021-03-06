package com.model;
/**
 * 订单明细实体类
 */
import java.math.BigDecimal;

/**
 * OrdersDetail generated by hbm2java
 */
public class OrdersDetail implements java.io.Serializable {

	private String id;// 编号
	private Orders orders;// 订单编号
	private String goodsName;// 商品名
	private Long count;// 数量
	private String unit;// 单位
	private Double price;// 单价
	private Double amount;// 金额

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public OrdersDetail(String id, Orders orders, String goodsName, Long count, String unit, Double price,
			Double amount) {
		super();
		this.id = id;
		this.orders = orders;
		this.goodsName = goodsName;
		this.count = count;
		this.unit = unit;
		this.price = price;
		this.amount = amount;
	}

	public OrdersDetail() {
		super();
	}

}
