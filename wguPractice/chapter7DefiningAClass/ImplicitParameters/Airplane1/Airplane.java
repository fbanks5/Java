package wguPractice.chapter7DefiningAClass.ImplicitParameters.Airplane1;

public class Airplane {
    private int elevation;

    public Airplane() {
        this.elevation = 0;
    }

    public void setAltitude(int elevation) {
        this.elevation = elevation;
    }

    public void print() {
        System.out.println(this.elevation + " meters");
    }
}
