package wguPractice.ch6Labs;

import java.util.Scanner;

public class WordFrequencies {
    public static int getWordFrequency(String[] wordList, int listSize, String currWord) {
        int count = 0;
        for (int i = 0; i < listSize; ++i) {
            if (wordList[i].equalsIgnoreCase(currWord)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int MAX_WORDS = 20;
        String[] wordList = new String[MAX_WORDS];
        int listSize;

        // Read the entire line
        String inputLine = scnr.nextLine();
        String[] inputWords = inputLine.split(" ");

        // The first word is the number of words
        listSize = Integer.parseInt(inputWords[0]);

        // Read the words into the array
        for (int i = 0; i < listSize; ++i) {
            wordList[i] = inputWords[i + 1];
        }

        // Output the words with their frequencies
        for (int i = 0; i < listSize; ++i) {
            int frequency = getWordFrequency(wordList, listSize, wordList[i]);
            System.out.println(wordList[i] + " " + frequency);
        }
    }
}
