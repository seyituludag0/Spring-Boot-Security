package spring.security.userservice.services;

import java.util.List;

import spring.security.userservice.entities.Role;
import spring.security.userservice.entities.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String userName, String roleName);
	User getUser(String userName);
	List<User> getUsers();
}
