package wguPractice.chapter7DefiningAClass.UnitTesting.ExampleProblemCh7Section8;

import java.util.Scanner;

public class CallInventoryTag {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        InventoryTag redSweater = new InventoryTag();
        int sweaterShipment;
        int sweaterInventoryBefore;

        sweaterInventoryBefore = redSweater.getQuantityRemaining();
        sweaterShipment = scnr.nextInt();

        System.out.println("Beginning tests.");

        redSweater.addInventory(sweaterShipment);
        if (redSweater.getQuantityRemaining() != sweaterInventoryBefore + sweaterShipment) {
            System.out.println("   UNIT TEST FAILED: addInventory()");
        }
        System.out.println("Tests complete.");

    }
}
