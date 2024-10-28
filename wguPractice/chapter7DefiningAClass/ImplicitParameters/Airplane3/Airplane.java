package wguPractice.chapter7DefiningAClass.ImplicitParameters.Airplane3;

public class Airplane {
    private int totalSeats;
    private int passengers;

    public Airplane() {
        this.totalSeats = 400;
        this.passengers = 0;
    }

    public void addPassengers(int passengers) {
        this.passengers += passengers;
    }

    public int getAvailableSeats() {
        return this.totalSeats - this.passengers;
    }
}
