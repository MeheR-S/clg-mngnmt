package com.college.dtos;

import java.util.Date;

import com.college.entities.Department;

public class EmployeeDTO {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private String designation;
	private double workExperience;
	private int noOfPaperPublished;
	private Date hireDate;
	private String contactNo;
	private String gender;
	private double salary;
	private Department department;

	public EmployeeDTO() {
	}

	public EmployeeDTO(int employeeId, String firstName, String middleName, String lastName, String email,
			String password, Date dob, String designation, double workExperience, int noOfPaperPublished, Date hireDate,
			String contactNo, String gender, double salary, Department department) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.designation = designation;
		this.workExperience = workExperience;
		this.noOfPaperPublished = noOfPaperPublished;
		this.hireDate = hireDate;
		this.contactNo = contactNo;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return String.format(
				"EmployeeDTO [employeeId=%s, firstName=%s, middleName=%s, lastName=%s, email=%s, password=%s, dob=%s, designation=%s, workExperience=%s, noOfPaperPublished=%s, hireDate=%s, contactNo=%s, gender=%s, salary=%s, department=%s]",
				employeeId, firstName, middleName, lastName, email, password, dob, designation, workExperience,
				noOfPaperPublished, hireDate, contactNo, gender, salary, department);
	}

}
