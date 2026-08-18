package main.java.models;

import javax.swing.*;
import java.time.LocalDateTime;

public class Enrollment {

    private int courseId;
    private int studentId;
    private String status;
    private String createAt;


    public Enrollment(int courseId, int studentId, String activo) {
    }

    public Enrollment(int courseId, int studentId, Spring status) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.status = String.valueOf(status);
        this.createAt = LocalDateTime.now().toString();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(Spring status) {
        this.status = String.valueOf(status);
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
