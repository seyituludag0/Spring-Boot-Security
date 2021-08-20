package spring.security.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.security.userservice.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByName(String name);
}
