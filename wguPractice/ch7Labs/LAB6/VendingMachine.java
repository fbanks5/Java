package wguPractice.ch7Labs.LAB6;

public class VendingMachine {
    // number of bottles in stock
    private int bottles;

    public VendingMachine() {
        bottles = 20;
    }

    public void purchase(int amount) {
        bottles = bottles - amount;
    }

    public int getInventory() {
        return bottles;
    }

    public void restock(int amount) {
        bottles = bottles + amount;
    }

    public void report() {
        System.out.println("Inventory: " + bottles + " bottles");
    }
}
