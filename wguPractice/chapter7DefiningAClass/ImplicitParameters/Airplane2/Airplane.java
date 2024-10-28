package wguPractice.chapter7DefiningAClass.ImplicitParameters.Airplane2;

public class Airplane {
    private int totalSeats;
    private int passengers;

    public Airplane(int totalSeats, int passengers) {
        this.totalSeats = totalSeats;
        this.passengers = passengers;
    }

    public int getAvailableSeats() {
        return this.totalSeats - this.passengers;
    }
}
