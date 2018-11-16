package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseDao {
	List<Course> findAllCourses();
	List<Course> findByIdTeacher(Long idTeacher);
	void saveCourse(Course curse);
	void updateCourse(Course curse);
	Course findById(Long idCourse);
	Course findByName(String name);
	void deleteCourseById(Long idCourse); 
}

