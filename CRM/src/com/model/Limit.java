package com.model;
/**
 * 权限实体类
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Limit generated by hbm2java
 */
public class Limit implements java.io.Serializable {

	private String id;// 编号
	private String name;// 名称
	private String parentId;// 父级别编号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}


	public Limit(String id, String name, String parentId) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}

	public Limit() {
		super();
	}

}
