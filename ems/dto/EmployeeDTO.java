package com.example.ems.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


//importing all the annotation from lombok for getter,setter and constructor

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
	
	// giving instance variable size and value(notnull) 
		// copy of instance variable created
	@Id
	@NotNull
	@Size(min = 1)
	private int empId;
	
	@NotNull
	@Size(min = 1)
	private String empName;
	
	@NotNull
	@Size(min = 1)
	private String email;
	
	@NotNull
	@Size(min = 1)
	private long empContact;
	
	@NotNull
	@Size(min = 1)
	private String empPosition;
	
	@NotNull
	@Size(min = 1)
	private String empDept;
}
