package com.example.Course_app.Controller;

import com.example.Course_app.Model.Course;
import com.example.Course_app.Model.Student;
import com.example.Course_app.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/course/enrolledlist")
    public List<Student> allStudent()
    {
        return studentService.allStudent();
    }

    @PostMapping("/course/enroll")
    public String addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return student.getName()+" data is added successfully";
    }


}
