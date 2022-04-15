package com.college.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.college.dtos.SubjectDTO;
import com.college.dtos.SubjectFacultyDTO;
import com.college.entities.Subject;
import com.college.services.SubjectServices;

@CrossOrigin(origins = "*")
@Controller
public class SubjectController {

	@Autowired
	private SubjectServices subjectServices;

	@PostMapping("/admin/add/subject")
	public ResponseEntity<?> addSubject(@RequestBody SubjectDTO subjectDto) {
		Subject result = subjectServices.addSubject(subjectDto);
		return Response.success(result);
	}

//	@PostMapping("/admin/add/subjects")
//	public ResponseEntity<?> addSubjects(@RequestBody Subject subject) {
//		Subject result = subjectServices.addSub(subject);
//		return Response.success(result);
//	}

	@DeleteMapping("/admin/delete/subject/{id}")
	public ResponseEntity<?> deleteSubject(@PathVariable("id") int subjectId) {
		Map<String, Object> result = subjectServices.deleteSubject(subjectId);
		return Response.success(result);
	}

	// ASSIGN FACULTY TO THE SUBJECT
	@PutMapping("/admin/assignFaculty/{employeeId}/toSubject")
	public ResponseEntity<?> assignSubject(@PathVariable("employeeId") int employeeId, @RequestBody Subject subject) {
		Map<String, Object> result = subjectServices.assignSubjectToFaculty(subject, employeeId);
		return Response.success(result);
	}

	@PutMapping("/admin/assignSubjectTo/{employeeId}")
	public ResponseEntity<?> assignSubToFaculty(@PathVariable("employeeId") int employeeId,
			@RequestBody SubjectFacultyDTO subject) {

		Map<String, Object> result = subjectServices.assignSubject(subject, employeeId);
		return Response.success(result);
	}

	// GET ALL SUBJECTS
	@GetMapping("/subject/allSubjects")
	public ResponseEntity<?> allSubjects() {
		List<Subject> result = subjectServices.getAllSubjects();
		return Response.success(result);
	}

	@GetMapping("/getAll/subjects")
	public List<Subject> subjects() {
		List<Subject> result = subjectServices.getSubjectList();
		return result;
	}

	// GET SUBJECTS IN PARTICULAR DEPARTMENT
	@GetMapping("/department/{id}/subjects")
	public ResponseEntity<?> allSubjectsInDepartment(@PathVariable("id") int departmentId) {
		Map<String, Object> result = subjectServices.getDepartmentWiseSubjects(departmentId);
		return Response.success(result);
	}

	// GET SUBJECTS OF PARTICULAR FACULTY
	@GetMapping("/faculty/{id}/subjects")
	public ResponseEntity<?> allSubjectsOfFaculty(@PathVariable("id") int employeeId) {
		Map<String, Object> result = subjectServices.getFacultyWiseSubjects(employeeId);
		return Response.success(result);
	}

}
