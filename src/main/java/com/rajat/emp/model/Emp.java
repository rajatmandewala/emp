package com.rajat.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="emp")
public class Emp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empid")
	private Integer empId;
	
	@Column(name="empname")
	private String empName;
	
	@JsonBackReference
	@JoinColumn(name="dept_deptid")
	@ManyToOne
	private Dept dept;
	
	

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}
	
	
	
}
