//package com.college.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.college.entities.Subject;
//import com.college.services.SubjectServices;
//
//@RestController
//public class SubjectController {
//
//	@Autowired
//	private SubjectServices subjectServices;
//	
//	@PostMapping("/admin/addSubject")
//	public Subject addSubject(@RequestBody Subject subject) {
//		return subjectServices.addSubject(subject);
//	}
//}
