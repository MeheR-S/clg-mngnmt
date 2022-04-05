package com.college.dtos;

public class DisplayDepartmentDTO {

	private int departmentId;
	private String departmentName;
	private String hod;

	public DisplayDepartmentDTO() {
	}

	public DisplayDepartmentDTO(int departmentId, String departmentName, String hod) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.hod = hod;
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

	@Override
	public String toString() {
		return String.format("DisplayDepartmentDTO [departmentId=%s, departmentName=%s, hod=%s]", departmentId,
				departmentName, hod);
	}

}
