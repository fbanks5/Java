package wguPractice.chapter7DefiningAClass.DogLicense;

import java.util.Scanner;

public class CallDogLicense {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        DogLicense dog1 = new DogLicense();
        int userYear;
        int userId;

        userYear = scnr.nextInt();
        userId = scnr.nextInt();

        dog1.setYear(userYear);
        dog1.createLicenseNum(userId);
        System.out.println("Dog license: " + dog1.getLicenseNum());
    }
}
