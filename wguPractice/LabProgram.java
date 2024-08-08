package wguPractice;

import java.util.Scanner;


public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x;
        double y;
        double z;
        double xy;


        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();


        double result1 = Math.pow(x, z);
        double result2 = Math.pow(x, Math.pow(y, z));
        double result3 = Math.abs(y);
        double result4 = Math.sqrt(Math.pow(x * y, z));

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);


    }
}


