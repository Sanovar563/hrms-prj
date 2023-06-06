package com.example.ems.converter;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ems.dto.EmployeeDTO;

import com.example.ems.entities.Employee;

@Component
public class EmployeeConverter {
	@Autowired 
	private ModelMapper modelmapper;
	
	public EmployeeDTO entityToDto(Employee employee)
	{
		EmployeeDTO dto= this.modelmapper.map(employee, EmployeeDTO.class);
//		dto.setEmpDtoId(employee.getEmpid());
//		dto.setEmpDtoName(employee.getName());
//		dto.setEmail(employee.getEmail());
//		dto.setEmpDtoDept(employee.getDept());
		return dto;
		
	}
	public List<EmployeeDTO> entityToDto(List<Employee> employee)
	{
		return employee.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
	}
	public Employee dtoToEntity(EmployeeDTO employeedto)
	{
		Employee employee=this.modelmapper.map(employeedto, Employee.class);
//		employee.setEmpid(employeedto.getEmpDtoId());
//		employee.setName(employeedto.getEmpDtoName());
//		employee.setEmail(employeedto.getEmail());
//		employee.setDept(employeedto.getEmpDtoDept());
		return employee;
	}
	public List<Employee> dtoToEntity(List<EmployeeDTO> dto)
	{
		return dto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
	}
	
}
