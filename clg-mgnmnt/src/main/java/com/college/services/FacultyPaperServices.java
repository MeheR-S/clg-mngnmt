package com.college.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.FacultyPaper;
import com.college.entities.Staff;
import com.college.repository.FacultyPaperRepository;
import com.college.repository.FacultyRepository;

@Service
public class FacultyPaperServices {

	@Autowired
	private FacultyPaperRepository facultyPaperRepository;

	@Autowired
	private FacultyRepository facultyRepository;

	public FacultyPaper addOrUpdate(FacultyPaper newPaper) {
		return facultyPaperRepository.save(newPaper);
	}

	public FacultyPaper getByPaperId(int id) {
		return facultyPaperRepository.findById(id).get();
	}

	// get paper published by particular faculty
	public List<FacultyPaper> findFacultyPaperbyEmployeeId(int EmployeeId) {

		Staff faculty = facultyRepository.getById(EmployeeId);
		List<FacultyPaper> paperList = faculty.getFacultyPapers();
		return paperList;
	}

	public Map<String, Object> deletePaper(int paperId) {
		if (facultyPaperRepository.existsById(paperId)) {
			facultyPaperRepository.deleteById(paperId);
			return Collections.singletonMap("Affected records :", 1);
		}

		return Collections.singletonMap("affectedRows", 0);
	}

}
