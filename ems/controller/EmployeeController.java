package com.example.ems.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.ems.converter.EmployeeConverter;
import com.example.ems.dao.EmployeeRepository;
import com.example.ems.dto.EmployeeDTO;

import com.example.ems.entities.Employee;

@RestController
public class EmployeeController {
	@Autowired EmployeeRepository emprepo;
	@Autowired EmployeeConverter empconverter;


	@GetMapping("/emp/{ID}")
	public EmployeeDTO findById(@PathVariable(value="ID") int empid)
	{
		Employee e=emprepo.findById(empid);
		return empconverter.entityToDto(e);	
	}
	@GetMapping("/empAll")
	public List<EmployeeDTO> findAll()
	{
		List<Employee> findall=emprepo.findAll();
		return empconverter.entityToDto(findall);
	}
	
	@PostMapping("/save")
	public EmployeeDTO save(@RequestBody EmployeeDTO dto)
	{
		Employee employee=empconverter.dtoToEntity(dto);
		employee=emprepo.save(employee);
		return empconverter.entityToDto(employee);
	}
	
	

}
