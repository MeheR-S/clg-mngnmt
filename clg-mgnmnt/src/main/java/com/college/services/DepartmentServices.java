package com.college.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.college.dtos.DepartmentDTO;
import com.college.dtos.DisplayDepartmentDTO;
import com.college.dtos.DtoEntityConverter;
import com.college.entities.Department;
import com.college.repository.DepartmentRepository;

@Transactional
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
			DisplayDepartmentDTO displayDept = converter.toDepartmentDisplayDto(dept);
			departmentRepository.deleteById(departmentId);
			return Collections.singletonMap("Affected records :", displayDept);
		}
		return Collections.singletonMap("affectedRows", 0);
	}

	// GET DEPARTMENT BY ITS ID
	public DepartmentDTO getDepartmentById(int departmentId) {
		Department dept = departmentRepository.findById(departmentId).get();
		DepartmentDTO dtoDept = converter.toDepartmentDto(dept);
		return dtoDept;
	}

	// GET DEPARETMENT IN PROPER FORM
	public DisplayDepartmentDTO getDepartmentByIdToDisplay(int departmentId) {
		Department dept = departmentRepository.findById(departmentId).get();
		DisplayDepartmentDTO dtoDept = converter.toDepartmentDisplayDto(dept);
		return dtoDept;
	}
}
