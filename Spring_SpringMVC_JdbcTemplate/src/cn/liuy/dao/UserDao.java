package cn.liuy.dao;

import cn.liuy.entity.User;

public interface UserDao {
	
	public User selectByNameAndPwd(String name,String pwd);
}
