package main.java.app;

import main.java.models.Course;
import main.java.models.Enrollment;
import main.java.models.Students;

import main.java.data.DataStore;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {


        students.add(new Students(1,"Maria", "Doe", "MariDoe", "41223456789"));
        students.add(new Students(2, "John", "Smith", "JohnSmith", "41298765432"));
        students.add(new Students(3, "Ana", "Gomez", "AnaGomez", "41255512345"));
        students.add(new Students(4, "Carlos", "Perez", "CarlosP", "41244498765"));
        students.add(new Students(5, "Elena", "Rius", "ElenaR", "41233345678"));


        System.out.println("list Students");
        for (Students est : students) {
            System.out.println("ID: "       + est.getId());
            System.out.println("Nombre: "   + est.getFirstName());
            System.out.println("Apellido: " + est.getLastName());
            System.out.println("Teléfono: " + est.getPhone());

        }

        System.out.println("List of Courses");

        courses.add(new Course(101, "JAV-01", "Fundamentos de Java", "Lógica y sintaxis", 25, 40));
        courses.add(new Course(102, "SPR-02", "Spring Boot Pro", "Microservicios", 20, 60));
        courses.add(new Course(103, "SQL-03", "Bases de Datos SQL", "MySQL y PostgreSQL", 30, 30));
        courses.add(new Course(104, "GIT-04", "Git y GitHub", "Control de versiones", 40, 15));
        courses.add(new Course(105, "ADSO-05", "Análisis de Software", "Metodologías ágiles", 25, 50));

        for (Course c : courses) {
            System.out.println("ID: "          + c.getId());
            System.out.println("Código: "      + c.getCode());
            System.out.println("Nombre: "      + c.getName());
            System.out.println("Descripción: " + c.getDescription());
            System.out.println("Cupo Máximo: " + c.getMaxCapacity());
            System.out.println("Duración: "    + c.getDuration() + " horas");

        }

        System.out.println("List of Enrollment");

        enrollments.add(new Enrollment(101, 202601, "Activo"));
        enrollments.add(new Enrollment(102, 202602, "Pendiente"));
        enrollments.add(new Enrollment(103, 202601, "Activo"));
        enrollments.add(new Enrollment(104, 202603, "Activo"));
        enrollments.add(new Enrollment(105, 202604, "Cancelado"));

        for (Enrollment e : enrollments) {
            System.out.println("ID Curso: "       + e.getCourseId());
            System.out.println("ID Estudiante: "  + e.getStudentId());
            System.out.println("Estado: "         + e.getStatus());
            System.out.println("Fecha Registro: " + e.getCreateAt());
        }








    }



}