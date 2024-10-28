package wguPractice.chapter7DefiningAClass.UnitTesting.ExampleProblemCh7Section8;

public class InventoryTag {
    private int quantityRemaining;

    public InventoryTag() {
        quantityRemaining = 0;
    }

    public int getQuantityRemaining() {
        return quantityRemaining;
    }

    public void addInventory(int numItems) {
        if (numItems > 10) {
            quantityRemaining += numItems;
        }
    }
}

