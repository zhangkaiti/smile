package wyy.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wyy.test.entity.User;
import wyy.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends Exception{
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/hello.do")
	@ResponseBody
	public String hello(Integer id){
		System.out.println(id);
		User user = userService.findUserById(id);
		System.out.println(user.getName());
		return user.getName();
	}
	
}
