package main_inventory;
import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productid = 01;
        product.productName = "Coffee Beans";
        product.price = 25.0;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 5;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseID = 011;
        warehouse.warehouseName = "Coffee Supply";
        warehouse.inventories = "Placeholder";

        System.out.println("Product ID: " + inventory.product.productid + ", Name: " + inventory.product.productName + ", Price: " + inventory.product.price);
        System.out.println("Inventory Quantity: " + inventory.quantity);
        System.out.println("Warehouse ID: " + warehouse.warehouseID + ", Name: " + warehouse.warehouseName);

    }

}
