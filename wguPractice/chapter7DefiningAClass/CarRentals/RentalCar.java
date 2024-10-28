package wguPractice.chapter7DefiningAClass.CarRentals;

public class RentalCar {
    private int mileage = 0;
    private String renter = "Unspecified";
    private char weekendPrice = 'N';

    public void setMileage(int rentalCarMileage) {
        mileage = rentalCarMileage;
    }

    public void setRenter(String rentalCarRenter) {
        renter = rentalCarRenter;
    }

    public void setWeekendPrice(char rentalCarWeekendPrice) {
        weekendPrice = rentalCarWeekendPrice;
    }

    public void print() {
        System.out.println("Mileage: " + mileage + ", Renter: " + renter + ", Weekend price: " + weekendPrice);
    }
}

