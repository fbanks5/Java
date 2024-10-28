package wguPractice.chapter7DefiningAClass.DogLicense;

public class DogLicense {
    private int licenseYear;
    private int licenseNum;

    public void setYear(int yearRegistered) {
        licenseYear = yearRegistered;
    }

    public void createLicenseNum(int customID) {
        licenseNum = (100000 * customID) + licenseYear;
    }

    public int getLicenseNum() {
        return licenseNum;
    }
}
