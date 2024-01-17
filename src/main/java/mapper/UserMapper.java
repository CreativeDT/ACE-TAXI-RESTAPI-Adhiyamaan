package mapper;

import dto.UserDto;
import entity.User;

public class UserMapper {
	public static UserDto mapUserDto(User user) {
		return new UserDto(
				user.getId(),
				user.getFirstname(),
				user.getLastname(),
				user.getMobilenumber(),
				user.getEmail(),
				user.getPassword()
				);
	}
	
	public static User maptoUser(UserDto userDto) {
		return new User(
				userDto.getId(),
				userDto.getFirstname(),
				userDto.getLastname(),
				userDto.getMobilenumber(),
				userDto.getEmail(),
				userDto.getPassword()
				);
	}

}
