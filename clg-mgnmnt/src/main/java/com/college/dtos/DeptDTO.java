package com.college.dtos;

public class DeptDTO {

	private int departmentId;
	private String departmentName;
	private String hod;
	private int firstYearStudents;
	private int secondYearStudents;
	private int thirdYearStudents;
	private int forthYearStudents;
	private int noOfFaculty;

	public DeptDTO() {
		super();
	}

	public DeptDTO(int departmentId, String departmentName, String hod, int firstYearStudents, int secondYearStudents,
			int thirdYearStudents, int forthYearStudents, int noOfFaculty) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.hod = hod;
		this.firstYearStudents = firstYearStudents;
		this.secondYearStudents = secondYearStudents;
		this.thirdYearStudents = thirdYearStudents;
		this.forthYearStudents = forthYearStudents;
		this.noOfFaculty = noOfFaculty;
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

	@Override
	public String toString() {
		return String.format(
				"DeptDTO [departmentId=%s, departmentName=%s, hod=%s, firstYearStudents=%s, secondYearStudents=%s, thirdYearStudents=%s, forthYearStudents=%s, noOfFaculty=%s]",
				departmentId, departmentName, hod, firstYearStudents, secondYearStudents, thirdYearStudents,
				forthYearStudents, noOfFaculty);
	}

}
