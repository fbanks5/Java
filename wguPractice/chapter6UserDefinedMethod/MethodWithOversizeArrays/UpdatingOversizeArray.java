package wguPractice.chapter6UserDefinedMethod.MethodWithOversizeArrays;

public class UpdatingOversizeArray {
   public static int addElement(String[] arrayRef, int currentSize, String addme) {
       // Check that array has space
       if (currentSize == arrayRef.length) {
           return currentSize;
       }


       // If array has space, add the element to the array
       arrayRef[currentSize] = addme;
       ++currentSize;
       return currentSize;


   }

    public static void main(String[] args) {
        final int LIST_SIZE = 5;
        String[] toDoList = new String[LIST_SIZE];
        int toDoListSize = 0;

        toDoListSize = addElement(toDoList, toDoListSize, "Study for CS101");
        toDoListSize = addElement(toDoList, toDoListSize, "Do the laundry");
        toDoListSize = addElement(toDoList, toDoListSize, "Buy some milk");
        toDoListSize = addElement(toDoList, toDoListSize, "Go for a walk");
        toDoListSize = addElement(toDoList, toDoListSize, "Buy some milk");
        System.out.println("toDoListSize: " + toDoListSize);
    }

}
