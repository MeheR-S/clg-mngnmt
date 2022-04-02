package com.college.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.entities.Department;
import com.college.services.DepartmentServices;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentServices departmentServices;

	@PostMapping("/admin/department")
	public ResponseEntity<?> addDepartment(@RequestBody Department department) {
		Map<String, Object> newDepartment = departmentServices.addDepartment(department);
		return Response.success(newDepartment);
	}
}
