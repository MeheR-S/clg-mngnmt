package com.college.services;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.college.dtos.DtoEntityConverter;
import com.college.dtos.SubjectDTO;
import com.college.entities.Subject;
import com.college.repository.SubjectRepository;

@Transactional
@Service
public class SubjectServices {

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private DtoEntityConverter converter;

	// ADD SUBJECT
	public Map<String, Object> addSubject(SubjectDTO subjectDto) {
		Subject subject = converter.toSubjectEntity(subjectDto);
		subject = subjectRepository.save(subject);
		return Collections.singletonMap("Inserted ID", subject.getSubjectId());
	}

	// DELETE SUBJECT
	public Map<String, Object> deleteSubject(int subjectId) {
		if (subjectRepository.existsById(subjectId)) {
			subjectRepository.deleteById(subjectId);
			return Collections.singletonMap("Affected records :", 1);
		}
		return Collections.singletonMap("Subject with subjectId " + subjectId + " NOT FOUND & Records affected", 0);
	}
	
	//SUBJECT AND FACULTY OPERATIONS
	//ASSIGN A SUBJECT TO FACULTY
}
