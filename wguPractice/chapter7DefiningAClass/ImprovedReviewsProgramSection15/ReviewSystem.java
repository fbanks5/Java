package wguPractice.chapter7DefiningAClass.ImprovedReviewsProgramSection15;

import java.util.Scanner;

public class ReviewSystem {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Reviews allReviews = new Reviews();
        String currName;
        int currRating;

        System.out.println("Type rating + comments. To end: -1");
        allReviews.inputReviews(scnr);

        System.out.println("\nAverage rating: ");           // Output average rating
        System.out.println(allReviews.getAverageRating()); // Output average rating

        // Output all comments for given rating
        System.out.println("\nType rating. To end: -1");
        currRating = scnr.nextInt(); // Get first rating
        while (currRating != -1) {
            allReviews.printCommentsForRating(currRating);  // Print comments for rating
            currRating = scnr.nextInt();                    // Get next rating
        }
    }
}
