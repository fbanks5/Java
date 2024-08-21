package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class CourseGrades {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 4;
        int[] courseGrades = new int[NUM_VALS];
        int i;

        for (i = 0; i < courseGrades.length; ++i) {
            courseGrades[i] = scnr.nextInt();
        }
        System.out.print(courseGrades[0] + " ");
        System.out.print(courseGrades[1] + " ");
        System.out.print(courseGrades[2] + " ");
        System.out.print(courseGrades[3] + "\n");

        for (i = courseGrades.length - 1; i >= 0; --i) {
            System.out.print(courseGrades[i] + " ");
        }
    }
}
