package main_university;

import University.Student;
import University.Course;
import University.Enrollment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 618412;
        student.name = "Banks III, Frantz";

        Course course = new Course();
        course.courseId = 2301;
        course.courseName = "Java Programming Foundations";


        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

        System.out.println("Student ID: " + student.studentId + ", Student Name: " + student.name);
        System.out.println("Course ID: " + course.courseId + ", Course Name: " + course.courseName);
        System.out.println("Enrolled Student: " + enrollment.student.name + ", Enrolled Course: " + enrollment.course.courseName);
    }
}
