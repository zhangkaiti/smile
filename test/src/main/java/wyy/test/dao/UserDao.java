package wyy.test.dao;

import wyy.test.entity.User;

public interface UserDao {
	User findUserById(Integer id);
	void addUser(User user);
}
