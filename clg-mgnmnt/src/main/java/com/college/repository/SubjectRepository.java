package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
