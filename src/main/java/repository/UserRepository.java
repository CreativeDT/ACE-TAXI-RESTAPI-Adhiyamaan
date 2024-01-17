package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dto.UserDto;
import entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
