package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entities.FacultyPaper;

@Repository
public interface FacultyPaperRepository extends JpaRepository<FacultyPaper, Integer> {

}
