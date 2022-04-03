package com.college.dtos;

import com.college.entities.Staff;

public class FacultyPaperDTO {

	private int PaperId;
	private String paperTopic;
	private String paperDesc;
	private Staff faculty;

	public FacultyPaperDTO() {
		super();
	}

	public FacultyPaperDTO(int paperId, String paperTopic, String paperDesc, Staff faculty) {
		PaperId = paperId;
		this.paperTopic = paperTopic;
		this.paperDesc = paperDesc;
		this.faculty = faculty;
	}

	public int getPaperId() {
		return PaperId;
	}

	public void setPaperId(int paperId) {
		PaperId = paperId;
	}

	public String getPaperTopic() {
		return paperTopic;
	}

	public void setPaperTopic(String paperTopic) {
		this.paperTopic = paperTopic;
	}

	public String getPaperDesc() {
		return paperDesc;
	}

	public void setPaperDesc(String paperDesc) {
		this.paperDesc = paperDesc;
	}

	public Staff getFaculty() {
		return faculty;
	}

	public void setFaculty(Staff faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return String.format("FacultyPaperDTO [PaperId=%s, paperTopic=%s, paperDesc=%s, faculty=%s]", PaperId,
				paperTopic, paperDesc, faculty);
	}

}
