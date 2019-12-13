package com.rajat.emp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.emp.model.Dept;
import com.rajat.emp.repository.DeptRepo;

@Service
@Transactional
public class DeptService {
	
	@Autowired
	private DeptRepo deptRepo;
	
	public List<Dept> getAllDept(){
		return deptRepo.findAll();
	}

}
