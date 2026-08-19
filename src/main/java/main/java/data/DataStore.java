package main.java.data;

import main.java.models.Course;
import main.java.models.Enrollment;
import main.java.models.Students;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Students> students;
    private final List<Course> courses;
    private final List<Enrollment> enrollments;

    public DataStore() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    // ==========================================
    // ESTUDIANTES
    // ==========================================

    //CREATE
    public void addStudent(Students student) {
        students.add(student);
    }

    public List<Students> getStudents() {
        return students;
    }

    public Students getStudent(int id) {
        for (Students student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    //UPDATE
    public void updateStudent(int id, Students updatedStudent) {
        Students existingStudent = getStudent(id);
        if (existingStudent != null) {
            existingStudent.setFirstName(updatedStudent.getFirstName());
            existingStudent.setLastName(updatedStudent.getLastName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setPhone(updatedStudent.getPhone());
            System.out.println("Estudiante actualizado correctamente.");
        } else {
            System.out.println("No se encontró el estudiante con ID: " + id);
        }
    }
    //DELETE
    public void removeStudents(int id) {
        Students student = getStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("No se encontró el estudiante con ID: " + id);
        }
    }

    // ==========================================
    // CURSOS
    // ==========================================

    // CREATE
    public void addCourse(Course course) {
        courses.add(course);
    }

    // READ ALL
    public List<Course> getCourses() {
        return courses;
    }

    public Course getCourse(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    // UPDATE
    public void updateCourse(int id, Course updatedCourse) {
        Course existingCourse = getCourse(id);
        if (existingCourse != null) {

            existingCourse.setCode(updatedCourse.getCode());
            existingCourse.setName(updatedCourse.getName());
            existingCourse.setDescription(updatedCourse.getDescription());
            existingCourse.setMaxCapacity(updatedCourse.getMaxCapacity());
            existingCourse.setDuration(updatedCourse.getDuration());
            System.out.println("Curso actualizado correctamente.");
        } else {
            System.out.println("No se encontró el curso con ID: " + id);
        }
    }

    // DELETE
    public void removeCourse(int id) {
        Course course = getCourse(id);
        if (course != null) {
            courses.remove(course);
            System.out.println("Curso eliminado correctamente.");
        } else {
            System.out.println("No se encontró el curso con ID: " + id);
        }
    }

    // ==========================================
    // MATRÍCULAS
    // ==========================================

    // CREATE
    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    // READ
    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
    public Enrollment getEnrollment(int studentId, int courseId) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudentId() == studentId && enrollment.getCourseId() == courseId) {
                return enrollment;
            }
        }
        return null;
    }

    // UPDATE
    public void updateEnrollmentStatus(int studentId, int courseId, String newStatus) {
        Enrollment existingEnrollment = getEnrollment(studentId, courseId);
        if (existingEnrollment != null) {
            existingEnrollment.setStatus(newStatus);
            System.out.println("Estado de matrícula actualizado correctamente.");
        } else {
            System.out.println("No se encontró la matrícula.");
        }
    }

    // DELETE
    public void removeEnrollment(int studentId, int courseId) {
        Enrollment enrollment = getEnrollment(studentId, courseId);
        if (enrollment != null) {
            enrollments.remove(enrollment);
            System.out.println("Matrícula eliminada correctamente.");
        } else {
            System.out.println("No se encontró la matrícula.");
        }
    }
}



