package com.example.Course_app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import javax.annotation.processing.Generated;
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mailId;
    private long phone;
    private String courseName;

    public Student(String name, String mailId, long phone, String courseName) {
        this.name = name;
        this.mailId = mailId;
        this.phone = phone;
        this.courseName = courseName;
    }

    public Student()
    {

    }
}
