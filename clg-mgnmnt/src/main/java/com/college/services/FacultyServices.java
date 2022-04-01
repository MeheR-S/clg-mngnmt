package com.college.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.Staff;
import com.college.repository.FacultyRepository;

@Service
public class FacultyServices {

	//Autowiring facultyRepository
	@Autowired
	private FacultyRepository facultyRepository;
	
	public Staff addOrUpdate(Staff newStaffMember) {
		return facultyRepository.save(newStaffMember);
	}
	
	public Staff getByEmployeeId(int id	) {
		return facultyRepository.findById(id).get();
	}
	
}
