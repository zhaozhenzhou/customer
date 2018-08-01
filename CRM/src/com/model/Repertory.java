package com.model;
/**
 * 库存实体类
 * @author Administrator
 *
 */
public class Repertory implements java.io.Serializable {

	private String id;// 编号
	private String product;// 产品名称
	private String warehouseName;// 仓库名
	private String goodsAllocation;// 货位
	private Long number;// 数量
	private String remark;// 备注

	public Repertory() {
	}

	public Repertory(String id) {
		this.id = id;
	}

	public Repertory(String id, String product, String warehouseName, String goodsAllocation, Long number,
			String remark) {
		this.id = id;
		this.product = product;
		this.warehouseName = warehouseName;
		this.goodsAllocation = goodsAllocation;
		this.number = number;
		this.remark = remark;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getGoodsAllocation() {
		return this.goodsAllocation;
	}

	public void setGoodsAllocation(String goodsAllocation) {
		this.goodsAllocation = goodsAllocation;
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
