package wguPractice.ch4Labs;

import java.util.Scanner;

public class ConvertReverseBinary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        String binary;
        String reverseBinary;

        num = scnr.nextInt();
        binary = Integer.toBinaryString(num);
        reverseBinary = new StringBuilder(binary).reverse().toString();

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print(reverseBinary);
                break;
            }
            else {
                break;
            }
        }


    }








        //        int num = scnr.nextInt();
//        String binary = Integer.toBinaryString(num);
//        String reverseBinary = new StringBuilder(binary).reverse().toString();
//
//        while (num > 0) {
//            if (num % 2 == 0) {
//                System.out.print(reverseBinary);
//                break;
//            }
//            else {
//                System.out.print(binary);
//                break;
//            }

        }
//    }

