package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAOMybatis userDAOMybatis;

	public void setUserDAO(UserDAOMybatis userDAOMybatis) {
		System.out.println("setUserDAOMybatis() ����");
		this.userDAOMybatis = userDAOMybatis;
	}

	public UserVO getUser(UserVO vo) {
		System.out.println("Mybatis getUser() ����");
		return userDAOMybatis.getUser(vo);
	}
}
