package com.college.dtos;

import org.springframework.stereotype.Component;

import com.college.entities.Staff;

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

}
