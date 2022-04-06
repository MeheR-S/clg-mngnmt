package com.college.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SUBJECT")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectId;

	@Column(length = 30)
	private String subjectName;

	@JsonIgnore
	@ManyToOne
	private Department department;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Staff faculty;

	public Subject() {
		super();
	}

	public Subject(int subjectId, String subjectName, Department department, Staff faculty) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.department = department;
		this.faculty = faculty;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Staff getFaculty() {
		return faculty;
	}

	public void setFaculty(Staff faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return String.format("Subject [subjectId=%s, subjectName=%s, department=%s, faculty=%s]", subjectId,
				subjectName, department, faculty);
	}

}
