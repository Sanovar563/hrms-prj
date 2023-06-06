package com.example.ems.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.ems.entities.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
	@Id
	private int ADtoId;
	private String ADtoName;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonManagedReference
	private Employee EDtoId;
}
