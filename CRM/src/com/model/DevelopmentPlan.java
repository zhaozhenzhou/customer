package com.model;
/**
 * 开发计划实体类
 */
public class DevelopmentPlan implements java.io.Serializable {

	private String id;//编号
	private SalesLeads salesLeads;//销售机会
	private String planDate;//计划时间
	private String conrent;//计划内容
	private String result;//执行效果

	public DevelopmentPlan() {
	}

	public DevelopmentPlan(String id) {
		this.id = id;
	}

	public DevelopmentPlan(String id, SalesLeads salesLeads, String planDate, String conrent, String result) {
		this.id = id;
		this.salesLeads = salesLeads;
		this.planDate = planDate;
		this.conrent = conrent;
		this.result = result;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SalesLeads getSalesLeads() {
		return this.salesLeads;
	}

	public void setSalesLeads(SalesLeads salesLeads) {
		this.salesLeads = salesLeads;
	}

	public String getPlanDate() {
		return this.planDate;
	}

	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}

	public String getConrent() {
		return this.conrent;
	}

	public void setConrent(String conrent) {
		this.conrent = conrent;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
