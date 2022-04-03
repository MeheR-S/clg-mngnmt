//package com.college.entities;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "SUBJECT")
//public class Subject {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int subjectId;
//
//	private String subjectName;
//
//	 @ManyToMany(fetch = FetchType.LAZY,
//		      cascade = {
//		          CascadeType.PERSIST,
//		          CascadeType.MERGE
//		      },
//		      mappedBy = "subjects")
//		  @JsonIgnore
//	private List<Staff> faculties;
//
//	public Subject() {
//		super();
//	}
//
//	public Subject(int subjectId, String subjectName, List<Staff> faculties) {
//		this.subjectId = subjectId;
//		this.subjectName = subjectName;
//		this.faculties = faculties;
//	}
//
//	public int getSubjectId() {
//		return subjectId;
//	}
//
//	public void setSubjectId(int subjectId) {
//		this.subjectId = subjectId;
//	}
//
//	public String getSubjectName() {
//		return subjectName;
//	}
//
//	public void setSubjectName(String subjectName) {
//		this.subjectName = subjectName;
//	}
//
//	public List<Staff> getFaculties() {
//		return faculties;
//	}
//
//	public void setFaculties(List<Staff> faculties) {
//		this.faculties = faculties;
//	}
//
//	public void addFaculty(Staff faculty) {
//		faculties.add(faculty);
//	}
//
//	public void removeFaculty(Subject faculty) {
//		faculties.remove(faculty);
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Subject [subjectId=%s, subjectName=%s, faculties=%s]", subjectId, subjectName, faculties);
//	}
//
//}
