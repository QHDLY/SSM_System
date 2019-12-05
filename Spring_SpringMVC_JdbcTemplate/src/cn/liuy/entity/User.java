package cn.liuy.entity;

public class User {

	private Integer u_id;
	private String u_name;
	private String u_pwd;
	
	
	
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	
	
	
	public User(Integer u_id, String u_name, String u_pwd) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
	}
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_pwd=" + u_pwd + "]";
	}
	
	
}
