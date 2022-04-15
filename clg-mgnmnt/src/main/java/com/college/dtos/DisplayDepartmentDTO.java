package com.college.dtos;

import java.util.List;

import com.college.entities.Subject;

public class DisplayDepartmentDTO {

	private int departmentId;
	private String departmentName;
	private String hod;
	private List<Subject> subjects;

	public DisplayDepartmentDTO() {
	}

	public DisplayDepartmentDTO(int departmentId, String departmentName, String hod, List<Subject> subjects) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.hod = hod;
		this.subjects = subjects;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return String.format("DisplayDepartmentDTO [departmentId=%s, departmentName=%s, hod=%s, subjects=%s]",
				departmentId, departmentName, hod, subjects);
	}

}
