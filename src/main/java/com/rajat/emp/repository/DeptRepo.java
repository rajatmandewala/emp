package com.rajat.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.emp.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Integer>{}
