package com.rajat.emp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.emp.repository.EmpRepo;
import com.rajat.emp.model.Emp;

@Service
@Transactional
public class EmpService {

	@Autowired
	private EmpRepo empRepo;
	
	public List<Emp> getAllEmp(){
		return empRepo.findAll();
	}
	
}
