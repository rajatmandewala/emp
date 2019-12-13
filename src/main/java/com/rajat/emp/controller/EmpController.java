package com.rajat.emp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.emp.model.Emp;
import com.rajat.emp.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@GetMapping
	public List<Emp> getAllEmp(){
		
		System.out.println(empService.getAllEmp());	
		return empService.getAllEmp();
	}
	
}
