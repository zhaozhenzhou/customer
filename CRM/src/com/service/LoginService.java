package com.service;

import com.model.Users;

public interface LoginService {
	/**
	 * 根据用户名进行验证查询
	 * 
	 * @param username
	 *            用户名
	 * @return 查询结果
	 */
	public Users loginValidate(String username);
}
