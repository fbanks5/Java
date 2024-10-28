package wguPractice.chapter7DefiningAClass.ImprovedReviewsProgramSection15;

import java.util.ArrayList;
import java.util.Scanner;

public class Reviews {
    private ArrayList<Review> reviewList = new ArrayList<Review>(); // List of reviews

    public void inputReviews(Scanner scnr) {
        Review currReview;  // Current review
        int currRating;     // Current rating
        String currComment; // Current comment

        currRating = scnr.nextInt();
        while (currRating >= 0) {
            currReview = new Review();
            currComment = scnr.nextLine(); // Consume newline
            currReview.setRatingAndComment(currRating, currComment); // Set rating and comment
            reviewList.add(currReview); // Add review to list
            currRating = scnr.nextInt(); // Get next rating
        }
    }

    public void printCommentsForRating(int currRating) {
        Review currReview;  // Current review
        int i;              // Loop index

        // Print comments for reviews with the specified rating
        for (i = 0; i < reviewList.size(); ++i) {
            currReview = reviewList.get(i); // Get review
            if (currRating == currReview.getRating()) {
                System.out.println(currReview.getComment());;
            }
        }
    }

    public int getAverageRating() {
        int ratingsSum;
        int i;

        ratingsSum = 0;
        for (i = 0; i < reviewList.size(); ++i) {
            ratingsSum += reviewList.get(i).getRating();
        }
        return (ratingsSum / reviewList.size());
    }
}
