package wguPractice.chapter7DefiningAClass.ImplicitParameters.Airplane3;

public class CallAirplane {
    public static void main(String[] args) {
        Airplane airbus330 = new Airplane();

        airbus330.addPassengers(1);
        airbus330.addPassengers(2);

        System.out.println(airbus330.getAvailableSeats() + " seats");
    }
}
