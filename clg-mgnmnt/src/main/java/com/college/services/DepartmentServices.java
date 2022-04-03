package com.college.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dtos.DepartmentDTO;
import com.college.dtos.DtoEntityConverter;
import com.college.entities.Department;
import com.college.repository.DepartmentRepository;

@Service
public class DepartmentServices {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private DtoEntityConverter converter;

	// add new DEPARTMENT
	public Map<String, Object> addDepartment(Department deparment) {
		Department newDept = departmentRepository.save(deparment);
		return Collections.singletonMap("Inserted NAME", newDept.getDepartmentName());
	}

	// GET ALL DEPARTMENTS
	public List<Department> allDepartments() {
		List<Department> departments = departmentRepository.findAll();
		return departments;
	}

	// DELETE A DEPARTMENT
	public Map<String, Object> deleteDepartment(int departmentId) {
		if (departmentRepository.existsById(departmentId)) {
			Department dept = departmentRepository.findById(departmentId).get();
			departmentRepository.deleteById(departmentId);
			return Collections.singletonMap("Affected records :", dept);
		}
		return Collections.singletonMap("affectedRows", 0);
	}

	// GET DEPARTMENT BY ITS ID
	public DepartmentDTO getdepartmentById(int departmentId) {
		Department dept = departmentRepository.findById(departmentId).get();
		DepartmentDTO dtoDept = converter.toDepartmentDto(dept);
		return dtoDept;
	}
}
