//package com.example.ems.converter;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.stereotype.Component;
//import com.example.ems.dto.AdminDto;
//import com.example.ems.entities.Admin;
//
//@Component
//public class AdminConverter {
//		
//	
//	public AdminDto entityToDto(Admin admin)
//	{
//		AdminDto dt= new AdminDto();
////		dt.setADtoId(admin.getAid());
////		dt.setADtoName(admin.getAname());;
////		dt.setEDtoId(admin.getEmpid());
//		return dt;
//		
//	}
//	public List<AdminDto> entityToDto(List<Admin> admin)
//	{
//		return admin.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
//	}
//	public Admin dtoToEntity(AdminDto admindto)
//	{
//		Admin admin=new Admin();
////		admin.setAid(admindto.getADtoId());
////		admin.setAname(admindto.getADtoName());
////		admin.setEmpid(admindto.getEDtoId());
//		return admin;
//	}
//	
//	public List<Admin> dtoToEntity(List<AdminDto> dto)
//	{
//		return dto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
//	}
//}
