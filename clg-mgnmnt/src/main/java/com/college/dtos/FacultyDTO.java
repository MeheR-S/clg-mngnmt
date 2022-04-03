package com.college.dtos;

import java.util.Date;
import java.util.List;

import com.college.entities.FacultyPaper;
//import com.college.entities.Subject;

public class FacultyDTO {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private double workExperience;
	private int noOfPaperPublished;
	private Date hireDate;
	private String contactNo;
	private String gender;
	private double salary;
	private List<FacultyPaper> facultyPapers;
	// private List<Subject> subjects;

	public FacultyDTO() {
		super();
	}

	public FacultyDTO(int employeeId, String firstName, String middleName, String lastName, String email,
			String password, Date dob, double workExperience, int noOfPaperPublished, Date hireDate, String contactNo,
			String gender, double salary, List<FacultyPaper> facultyPapers// ,List<Subject> subjects
	) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.workExperience = workExperience;
		this.noOfPaperPublished = noOfPaperPublished;
		this.hireDate = hireDate;
		this.contactNo = contactNo;
		this.gender = gender;
		this.salary = salary;
		this.facultyPapers = facultyPapers;
		// this.subjects = subjects;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(double workExperience) {
		this.workExperience = workExperience;
	}

	public int getNoOfPaperPublished() {
		return noOfPaperPublished;
	}

	public void setNoOfPaperPublished(int noOfPaperPublished) {
		this.noOfPaperPublished = noOfPaperPublished;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<FacultyPaper> getFacultyPapers() {
		return facultyPapers;
	}

	public void setFacultyPapers(List<FacultyPaper> facultyPapers) {
		this.facultyPapers = facultyPapers;
	}

//	public List<Subject> getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(List<Subject> subjects) {
//		this.subjects = subjects;
//	}

	@Override
	public String toString() {
		return String.format(
				"FacultyDTO [employeeId=%s, firstName=%s, middleName=%s, lastName=%s, email=%s, dob=%s, workExperience=%s, noOfPaperPublished=%s, hireDate=%s, contactNo=%s, gender=%s, salary=%s, facultyPapers=%s]",
				employeeId, firstName, middleName, lastName, email, dob, workExperience, noOfPaperPublished, hireDate,
				contactNo, gender, salary, facultyPapers// , subjects
		);
	}

}
