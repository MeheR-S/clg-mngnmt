package com.college.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.entities.FacultyPaper;
import com.college.services.FacultyPaperServices;

@RestController
public class FacultyPaperController {

	@Autowired
	private FacultyPaperServices facultyPaperServices;

	// ADD NEW PAPER
	@PostMapping("/faculty/{id}/addPaper")
	private FacultyPaper addNewPaper(@RequestBody FacultyPaper facultyPaper, @PathVariable("id") int id) {

		return facultyPaperServices.addOrUpdate(facultyPaper);
	}

	// get paper published by particular faculty
	@GetMapping("/faculty/paperPublished/{id}")
	public List<FacultyPaper> paperList(@PathVariable("id") int employeeId) {
		return facultyPaperServices.findFacultyPaperbyEmployeeId(employeeId);
	}
	
	
	public ResponseEntity<?> deletePaper(@PathVariable("id") int paperId){
		Map<String, Object> result = facultyPaperServices.deletePaper(paperId);
		return Response.success(result);
	}
}
