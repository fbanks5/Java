package wguPractice.chapter7DefiningAClass.UnitTesting;

public class CallRectangle {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();

        myRectangle.setSize(1, 1);
        if (myRectangle.getArea() != 1) {
            System.out.println("Error in getArea() for 1, 1");
        }
        if (myRectangle.getPerimeter() != 3) {
            System.out.println("Error in getPerimeter() for 1, 1");
        }

        myRectangle.setSize(2, 3);
        if (myRectangle.getArea() != 6) {
            System.out.println("Error in getArea() for 2, 3");
        }
        if (myRectangle.getPerimeter() != 12) {
            System.out.println("Error in getPerimeter() for 2, 3");
        }
    }
}
