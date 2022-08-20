package com.shivam.portal.exam.dto;

import java.util.List;

import com.shivam.portal.exam.entity.User;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ResultUserDto {
	
	private boolean success;
	
	private List<String> errors;
	
	private User user;
	

}
