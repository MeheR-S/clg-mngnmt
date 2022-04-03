package com.college.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;

	private String departmentName;

	private String hod;

	private int firstYearStudents;

	private int secondYearStudents;

	private int thirdYearStudents;

	private int forthYearStudents;

	private int noOfFaculty;

	@JsonIgnore
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Staff> faculty;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Subject> subjects;

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, String hod, int firstYearStudents,
			int secondYearStudents, int thirdYearStudents, int forthYearStudents, int noOfFaculty, List<Staff> faculty,
			List<Subject> subjects) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.hod = hod;
		this.firstYearStudents = firstYearStudents;
		this.secondYearStudents = secondYearStudents;
		this.thirdYearStudents = thirdYearStudents;
		this.forthYearStudents = forthYearStudents;
		this.noOfFaculty = noOfFaculty;
		this.faculty = faculty;
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

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return String.format(
				"Department [departmentId=%s, departmentName=%s, hod=%s, firstYearStudents=%s, secondYearStudents=%s, thirdYearStudents=%s, forthYearStudents=%s, noOfFaculty=%s, faculty=%s, subjects=%s]",
				departmentId, departmentName, hod, firstYearStudents, secondYearStudents, thirdYearStudents,
				forthYearStudents, noOfFaculty, faculty, subjects);
	}

}
