
package com.shivam.portal.exam.dto;

import java.util.List;

import com.shivam.portal.exam.entity.exam.Quiz;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ResultQuizDto {
	
	private boolean success;
	
	private List<String> errors;
	
	private Quiz quiz;

}
