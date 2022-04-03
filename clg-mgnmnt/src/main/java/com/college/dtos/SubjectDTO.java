package com.college.dtos;

import com.college.entities.Department;

public class SubjectDTO {

	private int subjectId;
	private String subjectName;
	private Department department;

	public SubjectDTO() {
		super();
	}

	public SubjectDTO(int subjectId, String subjectName, Department department) {
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
		return String.format("SubjectDTO [subjectId=%s, subjectName=%s, department=%s]", subjectId, subjectName,
				department);
	}

}
