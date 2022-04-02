package com.college.dtos;

import java.util.ArrayList;
import java.util.List;

import com.college.entities.Staff;

public class DepartmentDTO {

private int departmentId;
	
	private String departmentName;
	private String hod;	
	private int firstYearStudents;	
	private int secondYearStudents;	
	private int thirdYearStudents;	
	private int forthYearStudents;
	private int noOfFaculty;
	private List<Staff> faculty = new ArrayList<>();
	
	
	public DepartmentDTO() {
		super();
	}
	
	
	public DepartmentDTO(int departmentId, String departmentName, String hod, int firstYearStudents,
			int secondYearStudents, int thirdYearStudents, int forthYearStudents, int noOfFaculty,
			List<Staff> faculty) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.hod = hod;
		this.firstYearStudents = firstYearStudents;
		this.secondYearStudents = secondYearStudents;
		this.thirdYearStudents = thirdYearStudents;
		this.forthYearStudents = forthYearStudents;
		this.noOfFaculty = noOfFaculty;
		this.faculty = faculty;
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
	public int getFirstYearStudents() {
		return firstYearStudents;
	}
	public void setFirstYearStudents(int firstYearStudents) {
		this.firstYearStudents = firstYearStudents;
	}
	public int getSecondYearStudents() {
		return secondYearStudents;
	}
	public void setSecondYearStudents(int secondYearStudents) {
		this.secondYearStudents = secondYearStudents;
	}
	public int getThirdYearStudents() {
		return thirdYearStudents;
	}
	public void setThirdYearStudents(int thirdYearStudents) {
		this.thirdYearStudents = thirdYearStudents;
	}
	public int getForthYearStudents() {
		return forthYearStudents;
	}
	public void setForthYearStudents(int forthYearStudents) {
		this.forthYearStudents = forthYearStudents;
	}
	public int getNoOfFaculty() {
		return noOfFaculty;
	}
	public void setNoOfFaculty(int noOfFaculty) {
		this.noOfFaculty = noOfFaculty;
	}
	public List<Staff> getFaculty() {
		return faculty;
	}
	public void setFaculty(List<Staff> faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return String.format(
				"DepartmentDTO [departmentId=%s, departmentName=%s, hod=%s, firstYearStudents=%s, secondYearStudents=%s, thirdYearStudents=%s, forthYearStudents=%s, noOfFaculty=%s, faculty=%s]",
				departmentId, departmentName, hod, firstYearStudents, secondYearStudents, thirdYearStudents,
				forthYearStudents, noOfFaculty, faculty);
	}
}
