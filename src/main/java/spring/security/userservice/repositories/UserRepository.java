package spring.security.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.security.userservice.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String userName);

}
