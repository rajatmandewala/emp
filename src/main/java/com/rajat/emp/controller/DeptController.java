package com.rajat.emp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.emp.service.DeptService;
import com.rajat.emp.model.Dept;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping
	public List<Dept> getAllDept(){
		return deptService.getAllDept();
	}
}
