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
		staffDto.setDepartment(entity.getDepartment());
		staffDto.setDesignation(entity.getDesignation());
		staffDto.setSubjects(entity.getSubjects());
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
		displayDepartmentDto.setSubjects(entity.getSubjects());

		return displayDepartmentDto;
	}

	public StaffDto toEmployeeDto(Staff employee) {
		StaffDto staffDto = new StaffDto();
		staffDto.setFirstName(employee.getFirstName());
		staffDto.setMiddleName(employee.getMiddleName());
		staffDto.setLastName(employee.getLastName());
		staffDto.setDepartmentId(employee.getDepartment().getDepartmentId());
		staffDto.setContactNo(employee.getContactNo());
		staffDto.setDob(employee.getDob());
		staffDto.setHireDate(employee.getHireDate());
		staffDto.setEmail(employee.getEmail());
		staffDto.setPassword(employee.getPassword());
		staffDto.setFacultyPapers(employee.getFacultyPapers());
		staffDto.setEmployeeId(employee.getEmployeeId());
		staffDto.setNoOfPaperPublished(employee.getNoOfPaperPublished());
		staffDto.setSalary(employee.getSalary());
		staffDto.setWorkExperience(employee.getWorkExperience());
		staffDto.setGender(employee.getGender());
		staffDto.setDesignation(employee.getDesignation());

		return staffDto;
	}

	public Staff toStaffEntity(StaffDto newEmployee) {
		Staff newEntry = new Staff();
		newEntry.setFirstName(newEmployee.getFirstName());
		newEntry.setMiddleName(newEmployee.getMiddleName());
		newEntry.setLastName(newEmployee.getLastName());
		newEntry.setContactNo(newEmployee.getContactNo());
		newEntry.setDob(newEmployee.getDob());
		newEntry.setHireDate(newEmployee.getHireDate());
		newEntry.setEmail(newEmployee.getEmail());
		newEntry.setPassword(newEmployee.getPassword());
		newEntry.setFacultyPapers(newEmployee.getFacultyPapers());
		newEntry.setEmployeeId(newEmployee.getEmployeeId());
		newEntry.setNoOfPaperPublished(newEmployee.getNoOfPaperPublished());
		newEntry.setSalary(newEmployee.getSalary());
		newEntry.setWorkExperience(newEmployee.getWorkExperience());
		newEntry.setGender(newEmployee.getGender());
		newEntry.setDesignation(newEmployee.getDesignation());
		return newEntry;
	}
	
	

	public UserDTO toUserDto(Staff dbStaff) {
		UserDTO userDto = new UserDTO();
		userDto.setEmail(dbStaff.getEmail());
		userDto.setPassword(dbStaff.getPassword());
		userDto.setEmployeeId(dbStaff.getEmployeeId());
		userDto.setDesignation(dbStaff.getDesignation());
		userDto.setFirstName(dbStaff.getFirstName());
		userDto.setMiddleName(dbStaff.getMiddleName());
		userDto.setLastName(dbStaff.getLastName());
		return userDto;
	}

	public Staff toEmployeeEntity(EmployeeDTO newEmployee) {
		Staff newEntry = new Staff();
		newEntry.setFirstName(newEmployee.getFirstName());
		newEntry.setMiddleName(newEmployee.getMiddleName());
		newEntry.setLastName(newEmployee.getLastName());
		newEntry.setContactNo(newEmployee.getContactNo());
		newEntry.setDob(newEmployee.getDob());
		newEntry.setHireDate(newEmployee.getHireDate());
		newEntry.setEmail(newEmployee.getEmail());
		newEntry.setPassword(newEmployee.getPassword());
		newEntry.setEmployeeId(newEmployee.getEmployeeId());
		newEntry.setNoOfPaperPublished(newEmployee.getNoOfPaperPublished());
		newEntry.setSalary(newEmployee.getSalary());
		newEntry.setWorkExperience(newEmployee.getWorkExperience());
		newEntry.setGender(newEmployee.getGender());
		newEntry.setDesignation(newEmployee.getDesignation());
		newEntry.setDepartment(newEmployee.getDepartment());
		return newEntry;
	}

	public Department toDepartmentEntity(DeptDTO department) {
		Department dept = new Department();
		dept.setDepartmentId(department.getDepartmentId());
		dept.setDepartmentName(department.getDepartmentName());
		dept.setHod(department.getHod());
		dept.setFirstYearStudents(department.getFirstYearStudents());
		dept.setSecondYearStudents(department.getSecondYearStudents());
		dept.setThirdYearStudents(department.getThirdYearStudents());
		dept.setForthYearStudents(department.getForthYearStudents());
		dept.setNoOfFaculty(department.getNoOfFaculty());
		return dept;
	}

}
