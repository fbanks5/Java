package wguPractice.chapter7DefiningAClass.PersonInfo;

public class PersonInfo {
    private int numKids;

    public void setNumKids(int setPersonKids) {
        numKids = setPersonKids;
    }

    public void incNumKids() {
        numKids = numKids + 1;
    }

    public int getNumKids() {
        return numKids;
    }
}
