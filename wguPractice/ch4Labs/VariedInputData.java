package wguPractice.ch4Labs;

import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        int sum;
        int count;
        int max;


        num = scnr.nextInt();
        sum = 0;
        count = 0;
        max = Integer.MIN_VALUE;

        while (num >= 0) {
            sum += num;
            count++;
            if (num > max) {
                max = num;

            }
            num = scnr.nextInt();
        }
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.print(max);
            System.out.printf(" %.2f\n", avg);
        }
    }
}



















        //        int num;
//        int sum = 0;
//        int count = 0;
//        int max = 0;
//
//        num = scnr.nextInt();
//
//        while (num != -1) {
//            sum += num;
//            count++;
//            if (num > max) {
//                max = num;
//            }
//            num = scnr.nextInt();
//
//        }
//        if (count > 0) {
//            double avg = (double) sum / count;
//            System.out.print(max + " ");
//            System.out.printf("%.2f\n", avg);
//
//        }
//        else {
//            System.out.println("No data");
//
//        }
//    }
//}
