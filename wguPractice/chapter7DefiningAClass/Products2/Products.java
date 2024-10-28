package wguPractice.chapter7DefiningAClass.Products2;

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
    private ArrayList<Product> productList;

    public Products() {
        productList = new ArrayList<Product>();
    }

    public void inputProducts(Scanner scnr) {
        Product currProduct; // Current product
        int currPrice;       // Current price
        String currName;     // Current name

        currPrice = scnr.nextInt();                             // Get first price
        while(currPrice >= 0) {                                 // Loop while price is non-negative
            currProduct = new Product();                        // Create new product
            currName = scnr.nextLine();                         // Consume newline
            currProduct.setPriceAndName(currPrice, currName);   // Set price and name
            productList.add(currProduct);                       // Add product to list
            currPrice = scnr.nextInt();                         // Get next price
        }
    }

    public void printAfterDiscount(int discountPrice) {
        int i;                 // Loop index
        int currDiscountPrice; // Current price after discount

        for (i = 0; i < productList.size(); ++i) {                              // Loop through all products
            currDiscountPrice = productList.get(i).getPrice() - discountPrice;  // Calculate price after discount
            System.out.println(productList.get(i).getName() + " " + currDiscountPrice); // Output name and price after discount
        }
    }
}
