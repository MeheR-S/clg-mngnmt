package com.college.controllers;

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

import com.college.dtos.FacultyDTO;
import com.college.dtos.FacultyPaperDTO;
import com.college.entities.FacultyPaper;
import com.college.services.FacultyPaperServices;
import com.college.services.FacultyServices;

@RestController
public class FacultyPaperController {

	@Autowired
	private FacultyPaperServices facultyPaperServices;

	@Autowired
	private FacultyServices facultyServices;

	// ADD NEW PAPER
//	@PostMapping("/faculty/{id}/addPaper")
//	private FacultyPaper addNewPaper(@RequestBody FacultyPaper facultyPaper, @PathVariable("id") int id) {
//		return facultyPaperServices.addOrUpdate(facultyPaper);
//	}

	@PostMapping("/faculty/{id}/addPaper")
	private Map<String, Object> addPaperdetails(@RequestBody FacultyPaper facultyPaper, @PathVariable("id") int id) {
		return facultyPaperServices.addPaper(facultyPaper, id);
	}

	// get paper published by particular faculty
	@GetMapping("/faculty/paperPublished/{id}")
	public List<FacultyPaper> paperList(@PathVariable("id") int employeeId) {

		return facultyPaperServices.findFacultyPaperbyEmployeeId(employeeId);
	}

	// get paper published by particular faculty
	@GetMapping("/faculty/{id}/publishedPaper")
	public ResponseEntity<?> publishedPaper(@PathVariable("id") int employeeId) {
		FacultyDTO faculty = facultyServices.findStaffMemberById(employeeId);
		List<FacultyPaperDTO> dtoPapers = facultyPaperServices.allPublishedPapers(faculty);

		return Response.success(dtoPapers);
	}

	// DELETE PAPER
	@DeleteMapping("/faculty/deletePublishedPaper/{paperId}")
	public ResponseEntity<?> deletePaper(@PathVariable("paperId") int paperId) {
		Map<String, Object> result = facultyPaperServices.deletePaper(paperId);
		return Response.success(result);
	}
}
