package com.college.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	//ADD NEW PAPER
	@PostMapping("/faculty/{id}/addPaper")
	private FacultyPaper addNewPaper(@RequestBody FacultyPaper facultyPaper, @PathVariable int id) {
		return facultyPaperServices.addOrUpdate(facultyPaper);
	}
}
