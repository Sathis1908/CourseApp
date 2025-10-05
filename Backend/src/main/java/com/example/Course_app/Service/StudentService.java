package com.example.Course_app.Service;

import com.example.Course_app.Model.Student;
import com.example.Course_app.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> allStudent() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {

        studentRepo.save(student);
    }


}
