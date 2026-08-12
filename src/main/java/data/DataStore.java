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

        public List<Students> getStudents() {
            return students;
        }

        public void addStudent(Students student){
            students.add(student);
        }

        public Students getStudent(Long id){
            for (Students student : students) {
                if (student.getId()== id) {
                    return student;
                }
            }
            return null;
        }
        public void removeStudents(Long id){
            Students student = getStudent(id);
            if (student != null) {
                students.remove(student);
                System.out.println("Estudiante eliminado correctamente.");
            } else {
                System.out.println("No se encontró el estudiante con ID: " + id);
            }
        }
    }


