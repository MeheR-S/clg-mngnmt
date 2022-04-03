//package com.college.services;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.StreamSupport;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.college.entities.Staff;
//import com.college.entities.Subject;
//import com.college.repository.FacultyRepository;
//import com.college.repository.SubjectRepository;
//
//@Service
//public class SubjectServices {
//
//	@Autowired
//	private SubjectRepository subjectRepository;
//	
//	@Autowired
//	private FacultyRepository facultyRepository;
//	
//	
//	/* All GET requests */
//	
//	//get a subject  by id
//	public Subject getSubjectById(int subjectId) {
//		return subjectRepository.getById(subjectId);
//	}
//	
//	//get the list of subjects assigned to a particular Faculty.
//	public List<Subject> getSubjects()	{
//		List<Subject> subjects = StreamSupport
//				.stream(subjectRepository.findAll().spliterator(), false)
//				.collect(Collectors.toList());
//		return subjects;
//	}
//	
//	
//	/* All POST requests */
//	
//	public Staff addFaculty(Staff faculty) {
//		return facultyRepository.save(faculty);
//	}
//	
//	public Subject addSubject(Subject subject) {
//		return subjectRepository.save(subject);
//	}
//	
//	//for Assigning faculty to particular subject
//	public Subject assignFacultyToSubject (int subjectId, int employeeId) {
//		
//		Subject subject = getSubjectById(subjectId);
//		Staff faculty = facultyRepository.getById(employeeId);
//		
//		
//		if (faculty.getSubjects().contains(faculty)) {
//			throw new IllegalArgumentException("Faculty : " + faculty.getFirstName() + " " + faculty.getLastName() +
//					" is Already Assiended to " + subject.getSubjectName());
//		}
//		
////		subject.addFaculty(faculty); //Added addFaculty method in entity of subject class.
////		faculty.addSubject(subject); //Added addSubject method in entity of staff class.
//		
//		return subject;
//	}
//}
