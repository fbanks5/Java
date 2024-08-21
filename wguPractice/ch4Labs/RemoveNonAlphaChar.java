package wguPractice.ch4Labs;

import java.util.Scanner;

public class RemoveNonAlphaChar {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        String str = scnr.nextLine();
        String newStr = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(newStr);





//        String str = "Hello, World!";
//        String newStr = str.replaceAll("[^a-zA-Z]", "");
//        System.out.println(newStr);
    }
}
