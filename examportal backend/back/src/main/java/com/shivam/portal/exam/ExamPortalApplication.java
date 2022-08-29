package com.shivam.portal.exam;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shivam.portal.exam.service.UserService;




@SpringBootApplication
public class ExamPortalApplication{

	@Autowired
	private static UserService userService;

	
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);

	}

}
