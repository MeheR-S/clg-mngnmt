package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entities.Staff;

@Repository
public interface FacultyRepository extends JpaRepository<Staff, Integer> {

}
