package com.example.Course_app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Course {
    @Id
    private String courseId;
    private String courseName;
    private int durationInWeeks;
    private String trainerName;

    public Course() {
    }


}
