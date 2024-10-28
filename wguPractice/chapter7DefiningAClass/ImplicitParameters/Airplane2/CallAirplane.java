package wguPractice.chapter7DefiningAClass.ImplicitParameters.Airplane2;

public class CallAirplane {
    public static void main(String[] args) {
        Airplane boeing737 = new Airplane(200, 60);

        System.out.println("Seats: " + boeing737.getAvailableSeats());
    }
}
