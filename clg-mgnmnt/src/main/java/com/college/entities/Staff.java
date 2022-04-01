package com.college.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "STAFF")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(length = 20)
	private String firstName;
	
	@Column(length = 20)
	private String middleName;
	
	@Column(length = 20)
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	@Column(length = 1024)
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	private double workExperience;
	
	private int noOfPaperPublished;
	
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	
	private String contactNo;
	
	private String gender;
	
	private double salary;
	
	//One faculty can publish more than one Paper.
	@OneToMany(mappedBy = "faculty")
	@Cascade(CascadeType.ALL)
	private List<FacultyPaper> facultyPapers = new ArrayList<>();
		

	//CONTRUCTORS
	
	public Staff() {
		super();
	}


	public Staff(int employeeId, String firstName, String middleName, String lastName, String email, String password,
			Date dob, double workExperience, int noOfPaperPublished, Date hireDate, String contactNo, String gender,
			double salary, List<FacultyPaper> facultyPapers) {
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
	}

	
	//GETTERS SETTERS

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

	
	
	//TOSTRING
	@Override
	public String toString() {
		return String.format(
				"Staff [employeeId=%s, firstName=%s, middleName=%s, lastName=%s, email=%s, dob=%s, workExperience=%s, noOfPaperPublished=%s, hireDate=%s, contactNo=%s, gender=%s, salary=%s, facultyPapers=%s]",
				employeeId, firstName, middleName, lastName, email, dob, workExperience, noOfPaperPublished, hireDate,
				contactNo, gender, salary, facultyPapers);
	}


	

}
