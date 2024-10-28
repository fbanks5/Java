package wguPractice.chapter7DefiningAClass.ImplicitParameters.Airplane1;

public class CallAirplane {
    public static void main(String[] args) {
        Airplane boeing747 = new Airplane();

        boeing747.setAltitude(11000);
        boeing747.print();
    }
}
