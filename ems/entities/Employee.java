package com.example.ems.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//importing all the annotation from lombok for getter,setter and constructor

@Entity
@Table(name="Emp_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Emp_Id")
	private int empId;
	
	
	@Column(name="Emp_Name")
		@NotBlank(message = "Employee Name can't be empty")
	@NotNull(message = "Employee Name  can't be  null")	
	@Size(min = 3, max = 20, message = "Customer_Name must be within 3-20 characters")
	private String empName;
	
	@Column(name="Email")
	@Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)",message = "Enter valid Email Address")
	private String email;
	
	@Column(name="Contact_No")
         //	Start from +91 or 91 OR Contact Number starting from 7,8 or 9.
	@Pattern(regexp = "^((\\+91)?|91)?[789][0-9]{9}", message = " Invalid Contact Number it should start from 7,8 or 9 and must haev country code +91 or 91 ")
	private long empContact;
	
	
	@Column(name="Position")
	@NotBlank(message = "The position is compulsary to mention")
	private String empPosition;
	
	
	@Column(name="Department")
	@NotBlank(message = "Department can't be empty")
	@NotNull(message = "Department name can't be  null")	
	private String empDept;
	
	
	
	

	
	
	

}
