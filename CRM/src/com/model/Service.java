package com.model;
/**
 * 服务实体类
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Service generated by hbm2java
 */
public class Service implements java.io.Serializable {

	private String id;// 编号
	private Customer customer;// 客户编号
	private Users users;// 分配给的用户
	private String type;// 服务类型
	private String outline;// 概要
	private String request;// 服务请求
	private String creater;// 创建人
	private String createDate;// 创建时间
	private String allotDate;// 分配时间
	private Integer state;// 状态 0是未分配 1是已分配
	private List<ServiceHanding> serviceHandings = new ArrayList<ServiceHanding>();//服务处理
	
	public Service(String id, Customer customer, Users users, String type, String outline, String request,
			String creater, String createDate, String allotDate, Integer state, List<ServiceHanding> serviceHandings) {
		super();
		this.id = id;
		this.customer = customer;
		this.users = users;
		this.type = type;
		this.outline = outline;
		this.request = request;
		this.creater = creater;
		this.createDate = createDate;
		this.allotDate = allotDate;
		this.state = state;
		this.serviceHandings = serviceHandings;
	}

	public Service() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOutline() {
		return outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getAllotDate() {
		return allotDate;
	}

	public void setAllotDate(String allotDate) {
		this.allotDate = allotDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public List<ServiceHanding> getServiceHandings() {
		return serviceHandings;
	}

	public void setServiceHandings(List<ServiceHanding> serviceHandings) {
		this.serviceHandings = serviceHandings;
	}
	
}
