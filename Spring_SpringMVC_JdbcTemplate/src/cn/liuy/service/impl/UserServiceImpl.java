package cn.liuy.service.impl;

import cn.liuy.dao.UserDao;
import cn.liuy.entity.User;
import cn.liuy.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao ud;
	
	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	public User selectByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return ud.selectByNameAndPwd(name, pwd);
	}

}
