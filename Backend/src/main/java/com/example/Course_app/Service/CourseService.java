package com.example.Course_app.Service;

import com.example.Course_app.Model.Course;
import com.example.Course_app.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    public List<Course> allCourse() {
        return courseRepo.findAll();
    }

    public void addCourse(String courseId, String courseName, int durationInWeeks, String trainerName) {
        Course course = new Course(courseId,courseName,durationInWeeks,trainerName);
        courseRepo.save(course);
    }

    public void editCourse(String courseId, String courseName, int durationInWeeks, String trainerName) {
        Course course = new Course(courseId,courseName,durationInWeeks,trainerName);
        courseRepo.save(course);
    }

    public void deleteCourse(String courseId) {
        courseRepo.deleteById(courseId);
    }
}
