package main_university;

import University.Course;
import University.Enrollment;
import University.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 123456;
        student.Name = "Frantz Banks III";

        Course course = new Course();
        course.courseId = 450;
        course.courseName = "Java Programming";

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

        System.out.println("Student ID: " + enrollment.student.studentId);
        System.out.println("Student Name: " + enrollment.student.Name);
        System.out.println("Course ID: " + enrollment.course.courseId);
        System.out.println("Course Name: " + enrollment.course.courseName);



    }
}
