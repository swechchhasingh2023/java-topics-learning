package com.swechchha.SpringRestProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swechchha.SpringRestProject.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
