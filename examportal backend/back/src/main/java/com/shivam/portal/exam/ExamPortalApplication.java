package com.shivam.portal.exam;



import com.shivam.portal.exam.entity.Role;
import com.shivam.portal.exam.entity.User;
import com.shivam.portal.exam.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shivam.portal.exam.service.UserService;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ExamPortalApplication{

	@Autowired
	private static UserService userService;

	
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);

	}

}
