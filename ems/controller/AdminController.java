//package com.example.ems.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.ems.converter.AdminConverter;
//import com.example.ems.dao.AdminRepository;
//import com.example.ems.dto.AdminDto;
//
//import com.example.ems.entities.Admin;
//
//
//
//@RestController
//public class AdminController {
//
//		@Autowired AdminRepository arepo;
//		@Autowired AdminConverter aconverter;
//		
//		
//		@GetMapping("/admin/{ID}")
//		public AdminDto findById(@PathVariable(value="ID") int aid)
//		{
//			Admin a=arepo.findById(aid);
//			return aconverter.entityToDto(a);	
//		}
//				
//		@GetMapping("/adminAll")
//		public List<AdminDto> findAll()
//		{
//			List<Admin> findall=arepo.findAll();
//			return aconverter.entityToDto(findall);
//		}
//		
//		@PostMapping("/adminsave")
//		public AdminDto save(@RequestBody AdminDto dto)
//		{
//			Admin admin=aconverter.dtoToEntity(dto);
//			admin=arepo.save(admin);
//			return aconverter.entityToDto(admin);
//		}
//}
