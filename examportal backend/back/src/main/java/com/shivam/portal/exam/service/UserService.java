package com.shivam.portal.exam.service;

import java.util.List;
import java.util.Set;

import com.shivam.portal.exam.dto.ResultUserDto;
import com.shivam.portal.exam.entity.User;
import com.shivam.portal.exam.entity.UserRole;

public interface UserService {

	ResultUserDto createUser(User user,List<UserRole> userRole) throws Exception;
	
	ResultUserDto getUserByUserName(String username);
	
}
