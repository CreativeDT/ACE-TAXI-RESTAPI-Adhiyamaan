package service.impl;

import org.springframework.stereotype.Service;

import dto.UserDto;
import entity.User;
import mapper.UserMapper;
import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user= UserMapper.maptoUser(userDto);
		User savedUser= userRepository.save(user);
		return UserMapper.mapUserDto(savedUser);
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	

}
