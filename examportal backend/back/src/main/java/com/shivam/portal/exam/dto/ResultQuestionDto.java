package com.shivam.portal.exam.dto;

import java.util.List;

import com.shivam.portal.exam.entity.exam.Question;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ResultQuestionDto {
	
	private boolean success;
	
	private List<String> errors;
	
	private Question question;
	

}
