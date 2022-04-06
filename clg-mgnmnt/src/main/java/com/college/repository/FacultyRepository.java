package com.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.entities.Staff;

@Repository
public interface FacultyRepository extends JpaRepository<Staff, Integer> {

	Staff findByEmail(String email);

	List<Staff> findByDesignation(String designation);

	@Query("SELECT DISTINCT designation FROM staff;")
	List<String> getAllDesignations();

}
