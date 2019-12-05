package cn.liuy.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.liuy.entity.User;

public class UserRowMapper implements  RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int i) throws SQLException {
		Integer u_id = rs.getInt("t_id");
		String u_name = rs.getString("t_name");
		String u_pwd = rs.getString("t_pwd");
		return new User(u_id,u_name,u_pwd);
	}

	

}
