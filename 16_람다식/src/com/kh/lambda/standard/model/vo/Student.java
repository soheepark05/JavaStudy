package com.kh.lambda.standard.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;
}
