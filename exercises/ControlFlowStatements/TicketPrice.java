package exercises.ControlFlowStatements;

public class TicketPrice {
    public static void main(String[] args) {
        int age = 19;
        double price = 0.0;

        if (age <= 5) {
            price = 0.0;
        } else if (age > 5 && age <= 12) {
            price = 5;
        } else if (age >= 13 && age <= 18) {
            price = 10;
        }else {
            price = 15;
        }

        System.out.println("The ticket price is: $" + (int) price);


    }
}
