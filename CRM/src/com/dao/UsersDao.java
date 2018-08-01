package com.dao;

import com.model.Users;

public interface UsersDao {
	/**
	 * 根据username查询记录
	 * @param username
	 * @return
	 */
	public Users findByUsername(String username);
}
