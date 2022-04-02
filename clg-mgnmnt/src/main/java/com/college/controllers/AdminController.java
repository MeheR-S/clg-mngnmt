package com.college.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entities.Subject;
import com.college.services.SubjectServices;

@RestController
public class AdminController {

	@Autowired
	private SubjectServices subjectServices;

	// ASSIGNING SUBJECT TO A FACULTY
	@PostMapping("/addFaculty/{employeeId}/to/{subjectId}")
	public Subject assignSubject(@PathVariable("subjectId") int subjectId, @PathVariable("employeeId") int employeeId) {
		return subjectServices.assignFacultyToSubject(subjectId, employeeId);
	}
}
