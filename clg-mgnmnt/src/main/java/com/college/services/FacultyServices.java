package com.college.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.college.dtos.Credentials;
import com.college.dtos.DtoEntityConverter;
import com.college.dtos.FacultyDTO;
import com.college.dtos.UpdatePartialFacultyDTO;
import com.college.entities.Department;
import com.college.entities.Staff;
import com.college.repository.FacultyRepository;

@Transactional
@Service
public class FacultyServices {

	// Autowiring facultyRepository
	@Autowired
	private FacultyRepository facultyRepository;

	@Autowired
	private DtoEntityConverter converter;

	public Staff addOrUpdate(Staff newStaffMember) {
		return facultyRepository.save(newStaffMember);
	}

	public FacultyDTO findStaffMemberById(int employeeId) {
		Staff staffMember = facultyRepository.findById(employeeId).get();
		FacultyDTO facultyMember = converter.toStaffDto(staffMember);

		return facultyMember;
	}

	public Staff findStaffMemberByEmail(String email) {
		Staff staffMember = facultyRepository.findByEmail(email);
		return staffMember;
	}

	public FacultyDTO findStaffMemberByEmailAndPassword(Credentials cred) {
		Staff dbStaff = facultyRepository.findByEmail(cred.getEmail());
		if (dbStaff != null && dbStaff.getPassword().equals(cred.getPassword())) {
			FacultyDTO dbStaffDto = converter.toStaffDto(dbStaff);
			return dbStaffDto;
		}
		return null;
	}

	public Map<String, Object> deleteStaffMember(int employeeId) {
		if (facultyRepository.existsById(employeeId)) {
			facultyRepository.deleteById(employeeId);
			return Collections.singletonMap("Affected records :", 1);
		}
		return Collections.singletonMap("affectedRows", 0);
	}

	// check it with ma'am
	// how to partially update a table without getting null values
	public Map<String, Object> updateFaculty(int employeeId, UpdatePartialFacultyDTO facultyDto) {
		if (facultyRepository.existsById(employeeId)) {
			Staff oldData = facultyRepository.getById(employeeId);
			facultyDto.setEmployeeId(employeeId);
			Staff staffMember = converter.toFacultyEntity(facultyDto, oldData);
			staffMember = facultyRepository.save(staffMember);
			return Collections.singletonMap("DATA UPDATED : Employee ID", staffMember.getEmployeeId());
		}
		return Collections.singletonMap("changedRows", 0);

	}

	// get all the faculty members
	public List<Staff> getAllStaffMembers() {
		List<Staff> allStaffMembers = facultyRepository.findAll();
		return allStaffMembers;
	}

	// Assign DEPARTMENT to FACULTY
	public Map<String, Object> assignDeptToFaculty(Department dept, int employeeId) {
		Staff faculty = facultyRepository.findById(employeeId).get();
		if (faculty != null) {
			faculty.setDepartment(dept);
			facultyRepository.save(faculty);
			return Collections.singletonMap("Records Affected", 1);
		}
		return Collections.singletonMap("affectedRows", 0);
	}

}
