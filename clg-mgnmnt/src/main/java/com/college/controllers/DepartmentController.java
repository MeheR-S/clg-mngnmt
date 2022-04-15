package com.college.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.dtos.DepartmentDTO;
import com.college.dtos.DeptDTO;
import com.college.entities.Department;
import com.college.services.DepartmentServices;
import com.college.services.FacultyServices;

@CrossOrigin(origins = "*")
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

	// ****************************************************************************************************
	// GET ALL DEPARTMENTS WITH WHOLE INFORMATION
	/*
	 * @GetMapping("/departments/all") public ResponseEntity<?> departments() {
	 * List<Department> departments = departmentServices.allDepartments();
	 * List<DepartmentDTO> dtoDepartments = new ArrayList<>();
	 * 
	 * for (int i = 0; i < departments.size(); i++) { DepartmentDTO dtoDept =
	 * departmentServices.getDepartmentById(departments.get(i).getDepartmentId());
	 * dtoDepartments.add(dtoDept); } return Response.success(dtoDepartments); }
	 */
	// ****************************************************************************************************

	// GET ALL DEPARTMENTS
//	@GetMapping("/departments/all")
//	public ResponseEntity<?> departments() {
//		List<Department> departments = departmentServices.allDepartments();
//		List<DisplayDepartmentDTO> dtoDepartments = new ArrayList<>();
//
//		for (int i = 0; i < departments.size(); i++) {
//			DisplayDepartmentDTO dtoDept = departmentServices
//					.getDepartmentByIdToDisplay(departments.get(i).getDepartmentId());
//			dtoDepartments.add(dtoDept);
//		}
//		return Response.success(dtoDepartments);
//	}

	@GetMapping("/departments/all")
	public ResponseEntity<?> departments() {
		List<Department> departments = departmentServices.allDepartments();

		return Response.success(departments);
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
		DepartmentDTO department = departmentServices.getDepartmentById(departmentId);
		return Response.success(department);
	}

	// Edit Department Data

	@PutMapping("/admin/edit/department/{departmentId}")
	public ResponseEntity<?> updateDepartment(@PathVariable("departmentId") int departmentId,
			@RequestBody DeptDTO department) {
		Map<String, Object> result = departmentServices.updateDepartment(departmentId, department);
		return Response.success(result);
	}
}
