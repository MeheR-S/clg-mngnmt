package com.college.dtos;

import java.util.Date;

public class UpdatePartialFacultyDTO {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String contactNo;

	public UpdatePartialFacultyDTO() {
		super();
	}

	public UpdatePartialFacultyDTO(int employeeId, String firstName, String middleName, String lastName, Date dob,
			String contactNo) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNo = contactNo;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return String.format("StaffDTO [employeeId=%s, firstName=%s, middleName=%s, lastName=%s, dob=%s, contactNo=%s]",
				employeeId, firstName, middleName, lastName, dob, contactNo);
	}

}
