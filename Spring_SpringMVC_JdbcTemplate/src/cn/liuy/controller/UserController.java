package cn.liuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.liuy.entity.User;
import cn.liuy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/login")
	public String login(String name,String pwd)
	{
		User user = us.selectByNameAndPwd(name, pwd);
		
		if(user != null)
		{
			
			System.out.println("登录成功!");
			return "redirect:/user/selectAll.do";
		}
		
		else{
			System.out.println("登陆失败!");
			return "redirect:/error.jsp";
		}
	}
	
	@RequestMapping("/selectAll")
	public String selectAll()
	{
		System.out.println("正在输出列表!");
		return "forward:/selectAll.jsp";
	}
	
}
