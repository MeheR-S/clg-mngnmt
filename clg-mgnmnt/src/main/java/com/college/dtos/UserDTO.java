package com.college.dtos;

public class UserDTO {
	private String firstName;
	private String middleName;
	private String lastName;
	private int employeeId;
	private String email;
	private String password;
	private String designation;

	public UserDTO() {
		super();
	}

	public UserDTO(String firstName, String middleName, String lastName, int employeeId, String email, String password,
			String designation) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.email = email;
		this.password = password;
		this.designation = designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	@Override
	public String toString() {
		return String.format(
				"UserDTO [firstName=%s, middleName=%s, lastName=%s, employeeId=%s, email=%s, password=%s, designation=%s]",
				firstName, middleName, lastName, employeeId, email, password, designation);
	}

}
