package exercises.ControlFlowStatements;

public class HighestAndLowestGrades {
    public static void main(String[] args) {
        int[] grades = {50, 60, 70, 80, 90, 100};
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("The highest grade is: " + highest);
        System.out.println("The lowest grade is: " + lowest);
    }
}
