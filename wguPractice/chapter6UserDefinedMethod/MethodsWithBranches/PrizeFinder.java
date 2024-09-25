package wguPractice.chapter6UserDefinedMethod.MethodsWithBranches;

import java.util.Scanner;

public class PrizeFinder {
    public static int findPrize(int lotteryNumber) {
        int prize;

        if ((lotteryNumber == 196) || (lotteryNumber == 353)) {
            prize = 12000;
        }
        else if ((lotteryNumber == 488) || (lotteryNumber == 944)) {
            prize = 12500;
        }
        else {
            prize = 0;
        }

        return prize;
    }



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number;

        number = scnr.nextInt();

        System.out.println(findPrize(number));
    }
}
