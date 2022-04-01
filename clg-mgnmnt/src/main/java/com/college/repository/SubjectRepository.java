package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
