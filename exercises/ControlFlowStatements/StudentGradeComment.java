package exercises.ControlFlowStatements;

public class StudentGradeComment {
    public static void main(String[] args) {
        char grade = 'A';
        String note;

        switch (grade) {
            case 'A':
                note = "Excellent!";
                break;
            case 'B':
                note = "Good job!";
                break;
            case 'C':
                note = "Not bad!";
                break;
            case 'D':
                note = "You need to work harder!";
                break;
            case 'F':
                note = "Failed!";
                break;
            default:
                note = "Invalid grade!";

        }
        System.out.println(note);
    }
}
