package com.college.dtos;

import java.util.Date;
import java.util.List;

import com.college.entities.FacultyPaper;

public class StaffDto {
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
	private String designation;
	private List<FacultyPaper> facultyPapers;
	private int departmentId;

	public StaffDto() {
		super();
	}

	public StaffDto(int employeeId, String firstName, String middleName, String lastName, String email, String password,
			Date dob, double workExperience, int noOfPaperPublished, Date hireDate, String contactNo, String gender,
			double salary, String designation, List<FacultyPaper> facultyPapers, int departmentId) {
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
		this.designation = designation;
		this.facultyPapers = facultyPapers;
		this.departmentId = departmentId;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<FacultyPaper> getFacultyPapers() {
		return facultyPapers;
	}

	public void setFacultyPapers(List<FacultyPaper> facultyPapers) {
		this.facultyPapers = facultyPapers;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return String.format(
				"StaffDto [employeeId=%s, firstName=%s, middleName=%s, lastName=%s, email=%s, dob=%s, workExperience=%s, noOfPaperPublished=%s, hireDate=%s, contactNo=%s, gender=%s, salary=%s, designation=%s, facultyPapers=%s, departmentId=%s]",
				employeeId, firstName, middleName, lastName, email, dob, workExperience, noOfPaperPublished, hireDate,
				contactNo, gender, salary, designation, facultyPapers, departmentId);
	}

}
