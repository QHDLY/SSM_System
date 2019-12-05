package cn.liuy.service;

import cn.liuy.entity.User;

public interface UserService {

	public User selectByNameAndPwd(String name,String pwd);
}
