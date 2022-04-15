package com.college.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.college.dtos.DtoEntityConverter;
import com.college.dtos.SubjectDTO;
import com.college.dtos.SubjectFacultyDTO;
import com.college.entities.Department;
import com.college.entities.Staff;
import com.college.entities.Subject;
import com.college.repository.DepartmentRepository;
import com.college.repository.FacultyRepository;
import com.college.repository.SubjectRepository;

@Transactional
@Service
public class SubjectServices {

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private DtoEntityConverter converter;

	@Autowired
	private FacultyRepository facultyRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	// ADD SUBJECT
	public Subject addSubject(SubjectDTO subjectDto) {
		Subject subject = converter.toSubjectEntity(subjectDto);
		return subjectRepository.save(subject);
	}

	// DELETE SUBJECT
	public Map<String, Object> deleteSubject(int subjectId) {
		if (subjectRepository.existsById(subjectId)) {
			subjectRepository.deleteById(subjectId);
			return Collections.singletonMap("Affected records :", 1);
		}
		return Collections.singletonMap("Subject with subjectId " + subjectId + " NOT FOUND & Records affected", 0);
	}

	// SUBJECT AND FACULTY OPERATIONS
	// ASSIGN A SUBJECT TO FACULTY
	public Map<String, Object> assignSubjectToFaculty(Subject subject, int employeeId) {
		Staff faculty = facultyRepository.getById(employeeId);
		if (faculty != null && faculty.getDesignation().equalsIgnoreCase("faculty")) {
			Subject sub = new Subject();
			sub.setSubjectId(subject.getSubjectId());
			sub.setDepartment(subject.getDepartment());
			sub.setSubjectName(subject.getSubjectName());
			sub.setFaculty(faculty);
			subjectRepository.save(sub);
			return Collections.singletonMap("Records Affected", 1);
		}
		return Collections.singletonMap("Records Affected", 0);
	}

	// GET ALL SUBJECTS
//	public Map<String, Object> getAllSubjects() {
//		List<Subject> subjects = subjectRepository.findAll();
//		return Collections.singletonMap("All SUBJECTS", subjects);
//	}
	
	
	public List<Subject> getAllSubjects() {
		List<Subject> subjects = subjectRepository.findAll();
		return subjects;
	}

	// GET ALL SUBJECTS FROM A PERTICULAR DEPARTMENT
	public Map<String, Object> getDepartmentWiseSubjects(int departmentId) {
		Department dept = departmentRepository.getById(departmentId);
		List<Subject> subjects = dept.getSubjects();
		return Collections.singletonMap("All DEPARTMENT WISE SUBJECTS", subjects);

	}

	// GET ALL SUBJECTS FROM A PERTICULAR FACULTY
	public Map<String, Object> getFacultyWiseSubjects(int employeeId) {
		Staff faculty = facultyRepository.getById(employeeId);
		List<Subject> subjects = faculty.getSubjects();
		return Collections.singletonMap("All FACULTY WISE SUBJECTS", subjects);

	}

	public List<Subject> getSubjectList() {
		List<Subject> allsubs = subjectRepository.findAll();
		return allsubs;
	}

	public Map<String, Object> assignSubject(SubjectFacultyDTO subject, int employeeId) {
		Staff faculty = facultyRepository.getById(employeeId);
		Department dept = departmentRepository.getById(subject.getDepartmentId());
		Subject sub = new Subject();
		sub.setDepartment(dept);
		sub.setSubjectId(subject.getSubjectId());
		sub.setSubjectName(subject.getSubjectName());
		sub.setFaculty(faculty);
		subjectRepository.save(sub);
		return Collections.singletonMap("Subject Assigned", sub);
	}
}
