package wguPractice.chapter7DefiningAClass.Products;

import java.util.Scanner;
import java.util.ArrayList;

public class CallProducts {
    public static void main(String[] args) {
        Products allProducts = new Products();

        allProducts.inputProducts();
        allProducts.printAfterDiscount(2);
    }
}