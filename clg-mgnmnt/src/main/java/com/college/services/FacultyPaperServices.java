package com.college.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.FacultyPaper;
import com.college.repository.FacultyPaperRepository;

@Service
public class FacultyPaperServices {
	
	@Autowired
	private FacultyPaperRepository facultyPaperRepository;

	public FacultyPaper addOrUpdate(FacultyPaper newPaper) {
		return facultyPaperRepository.save(newPaper);
	}
	
	public FacultyPaper getByPaperId(int id	) {
		return facultyPaperRepository.findById(id).get();
	}
}
