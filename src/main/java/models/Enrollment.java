package main.java.models;

import java.time.LocalDateTime;

public class Enrollment {

    private int id;
    private int courseId;
    private int studentId;
    private String status;
    private String createAt;


    public Enrollment(int courseId, int studentId, String activo) {
    }

    public Enrollment(int id, int courseId, int studentId, String status) {
        this.id=id;
        this.courseId = courseId;
        this.studentId = studentId;
        this.status = String.valueOf(status);
        this.createAt = LocalDateTime.now().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setStatus(String status) {
        this.status = String.valueOf(status);
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
