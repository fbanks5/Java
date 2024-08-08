package wguPractice;

import java.util.Scanner;

public class simpleStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;


        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        int avg = (num1 + num2 + num3 + num4) / 4;
        int product = num1 * num2 * num3 * num4;

        System.out.println(product + " " + avg);

        int avgDouble = (num1 + num2 + num3 + num4) % 4;
        double productDouble = num1 * num2 * num3 * num4;

//        System.out.println(productDouble + " " + avgDouble);
        System.out.printf("%.3f %.3f", productDouble, avgDouble);
    }
}
