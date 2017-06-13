package wyy.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wyy.test.dao.UserDao;
import wyy.test.entity.User;

@Service("userService")
public class UserService {

	@Resource
	private UserDao userDao;
	
	public User findUserById(Integer id){
		System.out.println("service:"+id);
		return userDao.findUserById(id);
	}

}
