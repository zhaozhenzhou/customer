package com.model;
/**
 * 计划任务指派实体类
 */
import java.math.BigDecimal;

/**
 * PlanAllocation generated by hbm2java
 */
public class PlanAllocation implements java.io.Serializable {

	private String id;// 编号
	private Users users;// 分配给员工
	private TargetPlan targetPlan;// 目标计划号
	private Long customerCountPlan;// 计划客户量
	private Long customerCountComplete;// 客户完成量
	private Integer customerProportionComplete;// 客户量完成比例
	private Double salePlan;// 计划销售额
	private Double saleComplete;// 销售额完成量
	private Integer saleProportionComplete;// 销售额完成比例

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public TargetPlan getTargetPlan() {
		return targetPlan;
	}

	public void setTargetPlan(TargetPlan targetPlan) {
		this.targetPlan = targetPlan;
	}

	public Long getCustomerCountPlan() {
		return customerCountPlan;
	}

	public void setCustomerCountPlan(Long customerCountPlan) {
		this.customerCountPlan = customerCountPlan;
	}

	public Long getCustomerCountComplete() {
		return customerCountComplete;
	}

	public void setCustomerCountComplete(Long customerCountComplete) {
		this.customerCountComplete = customerCountComplete;
	}

	public Integer getCustomerProportionComplete() {
		return customerProportionComplete;
	}

	public void setCustomerProportionComplete(Integer customerProportionComplete) {
		this.customerProportionComplete = customerProportionComplete;
	}

	public Double getSalePlan() {
		return salePlan;
	}

	public void setSalePlan(Double salePlan) {
		this.salePlan = salePlan;
	}

	public Double getSaleComplete() {
		return saleComplete;
	}

	public void setSaleComplete(Double saleComplete) {
		this.saleComplete = saleComplete;
	}

	public Integer getSaleProportionComplete() {
		return saleProportionComplete;
	}

	public void setSaleProportionComplete(Integer saleProportionComplete) {
		this.saleProportionComplete = saleProportionComplete;
	}

	public PlanAllocation(String id, Users users, TargetPlan targetPlan, Long customerCountPlan,
			Long customerCountComplete, Integer customerProportionComplete, Double salePlan, Double saleComplete,
			Integer saleProportionComplete) {
		super();
		this.id = id;
		this.users = users;
		this.targetPlan = targetPlan;
		this.customerCountPlan = customerCountPlan;
		this.customerCountComplete = customerCountComplete;
		this.customerProportionComplete = customerProportionComplete;
		this.salePlan = salePlan;
		this.saleComplete = saleComplete;
		this.saleProportionComplete = saleProportionComplete;
	}

	public PlanAllocation() {
		super();
	}

}
