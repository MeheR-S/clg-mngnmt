package com.college.services;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.Department;
import com.college.repository.DepartmentRepository;

@Service
public class DepartmentServices {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Map<String, Object> addDepartment(Department deparment) {
		Department newDept = departmentRepository.save(deparment);
		return Collections.singletonMap("Inserted NAME", newDept.getDepartmentName());
	}

}
