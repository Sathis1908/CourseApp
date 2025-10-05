package com.example.Course_app.Repository;

import com.example.Course_app.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String> {
}
