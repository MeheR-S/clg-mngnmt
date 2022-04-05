package com.college.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectId;

	@Column(length = 30)
	private String subjectName;

	@ManyToOne//(cascade = CascadeType.ALL)
	private Department department;

	public Subject() {
		super();
	}

	public Subject(int subjectId, String subjectName, Department department) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.department = department;
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

	@Override
	public String toString() {
		return String.format("Subject [subjectId=%s, subjectName=%s, department=%s]", subjectId, subjectName,
				department);
	}

}
