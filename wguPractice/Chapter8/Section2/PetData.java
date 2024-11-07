package wguPractice.Chapter8.Section2;

public class PetData extends AnimalData {
    private int idNum;

    public void setID(int petID) {
        idNum = petID;
    }

    // FIXME: Add printAll() member function

    public void printAll() {
        super.printAll();
        System.out.println(", ID: " + idNum);
    }
}
