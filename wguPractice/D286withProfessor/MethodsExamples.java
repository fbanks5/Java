package wguPractice.D286withProfessor;

public class MethodsExamples {
    public static void main(String[] args) {

/*
//        displayMessage();
//        displayMessage("Frantz", 30);
//        displayMessage("Jean", 25);

        int result = calculateProduct(20, 5);
        System.out.println("The product is: " + result);

        result = calculateProduct(10, 5);
        System.out.println("The product is: " + result);

        result = calculateProduct(5, 5);
        System.out.println("The product is: " + result); */

        // Create Arrays
        int[] numbersArray = new int[3];
        String[] namesArray = new String[3];
        double[] doubleArray = new double[3];

        // Populate Arrays
        numbersArray[0] = 10;
        numbersArray[1] = 100;
        numbersArray[2] = 1000;

        namesArray[0] = "John";
        namesArray[1] = "Jane";
        namesArray[2] = "Joe";

        doubleArray[0] = 10.0;
        doubleArray[1] = 100.0;
        doubleArray[2] = 1000.0;

        // Access Array Items
        System.out.println(numbersArray[0]);
        System.out.println(namesArray[2]);

        // Array length
        System.out.println(namesArray.length);

        // Array Errors
//        System.out.println(namesArray[3]);
//        numbersArray[0] = "X";

        // Iterate Array
        for(int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }

        // Pass Array to Method
        changeName(namesArray);
        System.out.println(namesArray[2]);

        // Return Array
        int length = generateNames(namesArray).length;
        System.out.println(length);
    }

    public static String[] generateNames(String[] namesArray) {
        return namesArray;
    }


    public static void changeName(String[] namesArray) {
        namesArray[2] = "Frantz";
    }

    public static void displayMessage() {
        System.out.println("Hello from displayMessage");
    }

    public static void displayMessage(String message, int age) {
        System.out.println("Hello " + message + ".");
        System.out.println(message + " " + age + ".");
    }

    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }
}
