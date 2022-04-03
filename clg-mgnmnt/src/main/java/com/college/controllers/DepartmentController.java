package com.college.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.dtos.DepartmentDTO;
import com.college.entities.Department;
import com.college.services.DepartmentServices;
import com.college.services.FacultyServices;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentServices departmentServices;

	@Autowired
	private FacultyServices facultyServices;

	@PostMapping("/admin/department")
	public ResponseEntity<?> addDepartment(@RequestBody Department department) {
		Map<String, Object> newDepartment = departmentServices.addDepartment(department);
		return Response.success(newDepartment);
	}

	// Assign department to faculty
	@PostMapping("/admin/assign/faculty/{id}/to/department")
	public ResponseEntity<?> assigndepartmentToFaculty(@PathVariable("id") int employeeId,
			@RequestBody Department department) {
		Map<String, Object> assigned = facultyServices.assignDeptToFaculty(department, employeeId);
		return Response.success(assigned);
	}

	// GET ALL DEPARTMENTS
	@GetMapping("/departments/all")
	public ResponseEntity<?> departments() {
		List<Department> departments = departmentServices.allDepartments();
		List<DepartmentDTO> dtoDepartments = new ArrayList<>();

		for (int i = 0; i < departments.size(); i++) {
			DepartmentDTO dtoDept = departmentServices.getdepartmentById(departments.get(i).getDepartmentId());
			dtoDepartments.add(dtoDept);
		}
		return Response.success(dtoDepartments);
	}

	// DELETE A DEPARTMENT
	@DeleteMapping("/admin/deleteDepartment/{id}")
	public ResponseEntity<?> deleteFaculty(@PathVariable("id") int departmentId) {
		Map<String, Object> result = departmentServices.deleteDepartment(departmentId);
		return Response.success(result);
	}

	// GET A DEPARTMENT
	@GetMapping("/department/{id}")
	public ResponseEntity<?> getDepartment(@PathVariable("id") int departmentId) {
		DepartmentDTO department = departmentServices.getdepartmentById(departmentId);
		return Response.success(department);
	}
}
