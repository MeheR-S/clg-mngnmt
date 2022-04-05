package com.college.dtos;

import org.springframework.stereotype.Component;

import com.college.entities.Department;
import com.college.entities.FacultyPaper;
import com.college.entities.Staff;
import com.college.entities.Subject;

@Component
public class DtoEntityConverter {
	public UpdatePartialFacultyDTO toFacultyDto(Staff entity) {
		UpdatePartialFacultyDTO dto = new UpdatePartialFacultyDTO();

		dto.setEmployeeId(entity.getEmployeeId());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setMiddleName(entity.getMiddleName());
		dto.setDob(entity.getDob());
		dto.setContactNo(entity.getContactNo());

		return dto;
	}

	public Staff toFacultyEntity(UpdatePartialFacultyDTO dto, Staff oldData) {
		Staff entity = new Staff();

		entity.setEmployeeId(dto.getEmployeeId());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setMiddleName(dto.getMiddleName());
		entity.setDob(dto.getDob());
		entity.setContactNo(dto.getContactNo());
		entity.setEmail(oldData.getEmail());
		entity.setPassword(oldData.getPassword());
		entity.setGender(oldData.getGender());
		entity.setNoOfPaperPublished(oldData.getNoOfPaperPublished());
		entity.setHireDate(oldData.getHireDate());
		entity.setSalary(oldData.getSalary());
		entity.setWorkExperience(oldData.getWorkExperience());
		return entity;

	}

	public FacultyDTO toStaffDto(Staff entity) {

		FacultyDTO staffDto = new FacultyDTO();

		staffDto.setEmail(entity.getEmail());
		staffDto.setPassword(entity.getPassword());
		staffDto.setFirstName(entity.getFirstName());
		staffDto.setMiddleName(entity.getMiddleName());
		staffDto.setLastName(entity.getLastName());
		staffDto.setDob(entity.getDob());
		staffDto.setContactNo(entity.getContactNo());
		staffDto.setEmployeeId(entity.getEmployeeId());
		staffDto.setFacultyPapers(entity.getFacultyPapers());
		staffDto.setGender(entity.getGender());
		staffDto.setHireDate(entity.getHireDate());
		staffDto.setNoOfPaperPublished(entity.getNoOfPaperPublished());
		staffDto.setSalary(entity.getSalary());
		staffDto.setWorkExperience(entity.getWorkExperience());
		return staffDto;
	}

	public DepartmentDTO toDepartmentDto(Department entity) {
		DepartmentDTO deptDto = new DepartmentDTO();

		deptDto.setDepartmentId(entity.getDepartmentId());
		deptDto.setDepartmentName(entity.getDepartmentName());
		deptDto.setFaculty(entity.getFaculty());
		deptDto.setFirstYearStudents(entity.getFirstYearStudents());
		deptDto.setSecondYearStudents(entity.getSecondYearStudents());
		deptDto.setThirdYearStudents(entity.getThirdYearStudents());
		deptDto.setForthYearStudents(entity.getForthYearStudents());
		deptDto.setHod(entity.getHod());
		deptDto.setNoOfFaculty(entity.getNoOfFaculty());

		return deptDto;
	}

	public FacultyPaperDTO toFacultyPaperDto(FacultyPaper facultyPaper) {
		FacultyPaperDTO paperDto = new FacultyPaperDTO();

		paperDto.setFaculty(facultyPaper.getFaculty());
		paperDto.setPaperId(facultyPaper.getId());
		paperDto.setPaperTopic(facultyPaper.getPaperTopic());
		paperDto.setPaperDesc(facultyPaper.getPaperDesc());

		return paperDto;

	}

	public SubjectDTO toSubjectDto(Subject entity) {
		SubjectDTO subjectDto = new SubjectDTO();

		subjectDto.setSubjectId(entity.getSubjectId());
		subjectDto.setSubjectName(entity.getSubjectName());
		subjectDto.setDepartment(entity.getDepartment());

		return subjectDto;

	}

	public Subject toSubjectEntity(SubjectDTO subjectDto) {

		Subject entity = new Subject();

		entity.setSubjectId(subjectDto.getSubjectId());
		entity.setSubjectName(subjectDto.getSubjectName());
		entity.setDepartment(subjectDto.getDepartment());

		return entity;
	}

	public DisplayDepartmentDTO toDepartmentDisplayDto(Department entity) {
		DisplayDepartmentDTO displayDepartmentDto = new DisplayDepartmentDTO();
		displayDepartmentDto.setDepartmentId(entity.getDepartmentId());
		displayDepartmentDto.setDepartmentName(entity.getDepartmentName());
		displayDepartmentDto.setHod(entity.getHod());

		return displayDepartmentDto;
	}

}
