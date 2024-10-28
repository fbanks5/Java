package wguPractice.ch6Labs;
import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
    public static String coinFlip(Random rand) {
        int flip = rand.nextInt(2); // 0 or 1
        if (flip == 0) {
            return "Tails";
        }
        else {
            return "Heads";
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        int numFlips;
        int i;

        numFlips = scnr.nextInt();

        for (i = 0; i < numFlips; ++i) {
            System.out.println(coinFlip(rand));
        }
    }
}
