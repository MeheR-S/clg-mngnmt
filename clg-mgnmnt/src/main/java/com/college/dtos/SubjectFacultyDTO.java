package com.college.dtos;

public class SubjectFacultyDTO {
	private int subjectId;
	private String subjectName;
	private int departmentId;

	public SubjectFacultyDTO() {
	}

	public SubjectFacultyDTO(int subjectId, String subjectName, int departmentId) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.departmentId = departmentId;
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

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return String.format("SubjectFacultyDTO [subjectId=%s, subjectName=%s, departmentId=%s]", subjectId,
				subjectName, departmentId);
	}

}
