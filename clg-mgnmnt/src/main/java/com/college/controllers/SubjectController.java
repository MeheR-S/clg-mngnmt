package com.college.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.college.dtos.SubjectDTO;
import com.college.services.SubjectServices;

@Controller
public class SubjectController {

	@Autowired
	private SubjectServices subjectServices;

	@PostMapping("/admin/add/subject")
	public ResponseEntity<?> addSubject(@RequestBody SubjectDTO subjectDto) {
		Map<String, Object> result = subjectServices.addSubject(subjectDto);
		return Response.success(result);
	}

//	@PostMapping("/admin/add/subjects")
//	public ResponseEntity<?> addSubjects(@RequestBody Subject subject) {
//		Subject result = subjectServices.addSub(subject);
//		return Response.success(result);
//	}

	@DeleteMapping("/admin/department/delete/{id}")
	public ResponseEntity<?> deleteSubject(@PathVariable("id") int subjectId) {
		Map<String, Object> result = subjectServices.deleteSubject(subjectId);
		return Response.success(result);
	}

}
