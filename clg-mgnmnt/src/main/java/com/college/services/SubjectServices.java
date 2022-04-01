package com.college.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.Subject;
import com.college.repository.SubjectRepository;

@Service
public class SubjectServices {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public Subject assignSubjectToFaculty (Subject subject) {
		return subjectRepository.save(subject);
	}
}
