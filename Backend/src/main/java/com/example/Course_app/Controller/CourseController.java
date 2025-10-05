package com.example.Course_app.Controller;

import com.example.Course_app.Model.Course;
import com.example.Course_app.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/course/list")
    public List<Course> allCourse()
    {
        return courseService.allCourse();
    }

    @PostMapping("/course/add")
    public void addCourse(@RequestParam("courseId") String courseId,
                          @RequestParam("courseName") String courseName,
                          @RequestParam("durationInWeeks") int durationInWeeks,
                          @RequestParam("trainerName") String trainerName)
    {
        courseService.addCourse(courseId,courseName,durationInWeeks,trainerName);

    }

    @PutMapping("/course/edit")
    public void editCourse(@RequestParam("courseId") String courseId,
                             @RequestParam("courseName") String courseName,
                             @RequestParam("durationInWeeks") int durationInWeeks,
                             @RequestParam("trainerName") String trainerName)
    {
        courseService.editCourse(courseId,courseName,durationInWeeks,trainerName);
    }

    @DeleteMapping("/course/delete/{courseId}")
    public void deleteCourse(@PathVariable("courseId") String courseId)
    {
        courseService.deleteCourse(courseId);
    }



}
