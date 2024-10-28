package wguPractice.chapter7DefiningAClass.UnitTesting;

public class Rectangle {
    private int height;
    private int width;

    public void setSize(int h, int w) {
        height = h;
        width = w;
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return (height * 2) + (width * 2);
    }
}
