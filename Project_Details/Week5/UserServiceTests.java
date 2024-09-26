package com.mockitoegg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserServiceTests {
	@Mock
	private UserRepository userRepository;
	@InjectMocks
	private UserService userService;

	public UserServiceTests() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testGetUserName() {
		// Arrange
		Long userId = 1L;
		User user = new User(userId, "John Doe");
		when(userRepository.findById(userId)).thenReturn(user);
		// Act
		String userName = userService.getUserName(userId);
		// Assert
		assertEquals("John Doe", userName);
	}

	@Test
	void testGetUserName_UserNotFound() {
		// Arrange
		Long userId = 1L;
		when(userRepository.findById(userId)).thenReturn(null);
		// Act
		String userName = userService.getUserName(userId);
		// Assert
		assertEquals("Unknown", userName);
	}

	@Test
	void testuserName_Empty() {

		int userId = 100;
		User user = new User((long)100, "");
		when(userRepository.findById((long)userId)).thenReturn(user);
		// Act
		String userName = userService.getUserName((long)userId);
		// Assert
		assertEquals("", userName);

	}

}