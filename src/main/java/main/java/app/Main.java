package main.java.app;

import main.java.models.Course;
import main.java.models.Enrollment;
import main.java.models.Students;

import main.java.data.DataStore;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.addStudent(new Students(1,"Maria", "Doe", "MariDoe", "41223456789"));
        dataStore.addStudent(new Students(2, "John", "Smith", "JohnSmith", "41298765432"));
        dataStore.addStudent(new Students(3, "Ana", "Gomez", "AnaGomez", "41255512345"));
        dataStore.addStudent(new Students(4, "Carlos", "Perez", "CarlosP", "41244498765"));
        dataStore.addStudent(new Students(5, "Elena", "Rius", "ElenaR", "41233345678"));

        dataStore.addStudent(new Students(6,"pedro","marcos","mar@ejejplo","4582164595"));


        System.out.println("list Students");

        dataStore.getStudents().forEach( Students ->{
            System.out.println("ID: "       + Students.getId());
            System.out.println("Nombre: "   + Students.getFirstName());
            System.out.println("Apellido: " + Students.getLastName());
            System.out.println("Teléfono: " + Students.getPhone());

        });

        System.out.println("List of Courses");

        dataStore.addCourse(new Course(101, "JAV-01", "Fundamentos de Java", "Lógica y sintaxis", 25, 40));
        dataStore.addCourse(new Course(102, "SPR-02", "Spring Boot Pro", "Microservicios", 20, 60));
        dataStore.addCourse(new Course(103, "SQL-03", "Bases de Datos SQL", "MySQL y PostgreSQL", 30, 30));
        dataStore.addCourse(new Course(104, "GIT-04", "Git y GitHub", "Control de versiones", 40, 15));
        dataStore.addCourse(new Course(105, "ADSO-05", "Análisis de Software", "Metodologías ágiles", 25, 50));

        dataStore.getCourses().forEach(Course ->{
            System.out.println("ID: "       + Course.getId());
            System.out.println("Código: "      + Course.getCode());
            System.out.println("Nombre: "      + Course.getName());
            System.out.println("Descripción: " + Course.getDescription());
            System.out.println("Cupo Máximo: " + Course.getMaxCapacity());
            System.out.println("Duración: "    + Course.getDuration() + " horas");
        });



        System.out.println("List of Enrollment");

        dataStore.addEnrollment(new Enrollment(01,101, 202601, "Activo"));
        dataStore.addEnrollment(new Enrollment(02,102, 202602, "Pendiente"));
        dataStore.addEnrollment(new Enrollment(03,103, 202601, "Activo"));
        dataStore.addEnrollment(new Enrollment(04,104, 202603, "Activo"));
        dataStore.addEnrollment(new Enrollment(05,105, 202604, "Cancelado"));

        dataStore.getEnrollments().forEach(Enrollment ->{
            System.out.println("ID Matricula : " + Enrollment.getId());
            System.out.println("ID Curso: "       + Enrollment.getCourseId());
            System.out.println("ID Estudiante: "  + Enrollment.getStudentId());
            System.out.println("Estado: "         + Enrollment.getStatus());
            System.out.println("Fecha Registro: " + Enrollment.getCreateAt());
        });



    }



}