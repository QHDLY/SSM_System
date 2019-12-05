package cn.liuy.dao.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import cn.liuy.dao.UserDao;
import cn.liuy.entity.User;
import cn.liuy.rowmapper.UserRowMapper;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public User selectByNameAndPwd(String name, String pwd) {
		String sql = "select * from t_user where t_name = ? and t_pwd = ?";
		
		User user = null;
		try {
			user = jt.queryForObject(sql,new Object[]{name,pwd},new UserRowMapper());
		} catch (DataAccessException e) {
			System.out.println("没有查询到该用户信息!");
		}
		
		return user;
	}

}
