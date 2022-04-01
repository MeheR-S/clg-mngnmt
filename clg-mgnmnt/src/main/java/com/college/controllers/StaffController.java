package com.college.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.entities.Staff;
import com.college.services.FacultyServices;

@RestController
public class StaffController {

	@Autowired
	private FacultyServices facultyServices;
	
	
	//add this to admin controller
	//Add new STAFF MEMBER
	@PostMapping("/admin/add/faculty")
	private Staff addNewStaffMember(@RequestBody Staff newStaffMember) {
		return facultyServices.addOrUpdate(newStaffMember);
	}
	
}
