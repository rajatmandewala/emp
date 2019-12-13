package com.rajat.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.emp.model.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{}
