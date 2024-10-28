package wguPractice.chapter7DefiningAClass.Section18;

public class Adder {
    public static double add(Integer in1, Double in2, int in3) {
        return in1 + in2 + in3;
    }

    public static void main(String[] args) {
        Integer x = 10;
        Double y = 12.0;
        int z = 5;

        double answer = add(x, y, z);
        System.out.println("Answer: " + answer);
    }
}
