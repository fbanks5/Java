package genericsandcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("bread");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);

        System.out.println(shoppingList);
        System.out.println(numbers);

        System.out.println(shoppingList.get(0));
        shoppingList.remove("milk");
        System.out.println(shoppingList);
        boolean hasEggs = shoppingList.contains("eggs");
        System.out.println(hasEggs);
    }
}
