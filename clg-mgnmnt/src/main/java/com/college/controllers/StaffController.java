package com.college.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.dtos.Credentials;
import com.college.dtos.FacultyDTO;
import com.college.dtos.UpdatePartialFacultyDTO;
import com.college.entities.Staff;
import com.college.services.FacultyServices;

@RestController
public class StaffController {

	@Autowired
	private FacultyServices facultyServices;

	// LOGIN
	@GetMapping("/signIn")
	public ResponseEntity<?> signIn(@RequestBody Credentials cred) {
		FacultyDTO userDto = facultyServices.findStaffMemberByEmailAndPassword(cred);
		if (userDto != null)
			return Response.success(userDto);
		return Response.error("PLEASE ENTER VALID CREDENTIALS");
	}

	// move this to admin controller
	// Add new STAFF MEMBER
	@PostMapping("/admin/add/faculty")
	private ResponseEntity<?> addNewStaffMember(@RequestBody Staff newStaffMember) {
		Staff result = facultyServices.addOrUpdate(newStaffMember);
		return Response.success(result);
	}

	@GetMapping("/admin/faculty/{id}")
	private ResponseEntity<?> faculty(@PathVariable("id") int employeId) {
		FacultyDTO facultyDetails = facultyServices.findStaffMemberById(employeId);
		return Response.success(facultyDetails);
	}

	// GET ALL STAFF-MEMBERS
	@GetMapping("/admin/allStaff")
	private ResponseEntity<?> allStaffMembers() {
		List<Staff> members = facultyServices.getAllStaffMembers();
		List<FacultyDTO> dtoMembers = new ArrayList<>();

		for (int i = 0; i < members.size(); i++) {
			FacultyDTO staff = facultyServices.findStaffMemberById(members.get(i).getEmployeeId());
			dtoMembers.add(staff);
		}
		return Response.success(dtoMembers);
	}

	@DeleteMapping("/admin/deleteFaculty/{id}")
	public ResponseEntity<?> deleteFaculty(@PathVariable("id") int employeeId) {
		Map<String, Object> result = facultyServices.deleteStaffMember(employeeId);
		return Response.success(result);
	}

	// THINGS a Faculty can update(first/middle/last name, dob, contact no)
	@PatchMapping("/faculty/update/{id}")
	public ResponseEntity<?> updateFacultyInfo(@PathVariable("id") int employeeId,
			@RequestBody UpdatePartialFacultyDTO facultyDto) {
		Map<String, Object> result = facultyServices.updateFaculty(employeeId, facultyDto);
		return Response.success(result);
	}

}
