package com.college.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACULTY_PAPER")
public class FacultyPaper {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PaperId;

	@Column(length = 50)
	private String paperTopic;

	@Column(length = 1024)
	private String paperDesc;

	// One faculty can publish more than one Paper.
//	@JsonIgnore
	@ManyToOne // (fetch = FetchType.EAGER)
	private Staff faculty;

	public FacultyPaper() {
		super();
	}

	public FacultyPaper(int PaperId, String paperTopic, String paperDesc, Staff faculty) {
		this.PaperId = PaperId;
		this.paperTopic = paperTopic;
		this.paperDesc = paperDesc;
		this.faculty = faculty;
	}

	public int getId() {
		return PaperId;
	}

	public void setId(int PaperId) {
		this.PaperId = PaperId;
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
		return String.format("FacultyPaper [PaperId=%s, paperTopic=%s, paperDesc=%s, faculty=%s]", PaperId, paperTopic,
				paperDesc, faculty);
	}

}
