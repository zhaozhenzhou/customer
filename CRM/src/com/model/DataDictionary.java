package com.model;
/**
 * 数据字典实体类
 */

/**
 * DataDictionary generated by hbm2java
 */
public class DataDictionary implements java.io.Serializable {

	private String id;//编号
	private String type;//类别
	private String entry;//条目
	private String price;//值
	private Integer num;//是否可编辑 0.1 0代表可以   1代表不可以
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public DataDictionary(String id, String type, String entry, String price, Integer num) {
		super();
		this.id = id;
		this.type = type;
		this.entry = entry;
		this.price = price;
		this.num = num;
	}
	public DataDictionary() {
		super();
	}
 
	

}