package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
}
