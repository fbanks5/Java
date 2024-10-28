package wguPractice.chapter7DefiningAClass.SortedOrder;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {

    // Adds playerNum to end of ArrayList
    public static void addPlayer (ArrayList<Integer> players, int playerNum) {
        int i;
        boolean foundHigher;

        // Look for first item greater than playerNum
        foundHigher = false;
        i = 0;

        while ( (!foundHigher) && (i < players.size()) ) {
            if (players.get(i) > playerNum) {
                players.add(i, playerNum); // Add playerNum at index i
                foundHigher = true;
            }

            ++i;
        }


        if (!foundHigher) { // No higher number found, add at end
            players.add(playerNum);
        }
    }

    // Prints player numbers currently in ArrayList
    public static void printPlayers(ArrayList<Integer> players) {
        int i;

        for (i = 0; i < players.size(); ++i) {
            System.out.println(" " + players.get(i));
        }
    }

    // Maintains ArrayList of player numbers
    public static void main(String [] args) {
        ArrayList<Integer> players = new ArrayList<Integer>();

        addPlayer(players, 55);
        addPlayer(players, 4);
        addPlayer(players, 50);
        addPlayer(players, 19);

        printPlayers(players);
    }
}


