package homework1211;

public class Person {

    public String name;
    public String dateOfBirth;
    public String gender;
    public String mobileNumber;
    public String bloodBankName;

    public Person(String name, String dateOfBirth, String gender, String mobileNumber, String bloodBankName) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.bloodBankName = bloodBankName;
    }

    public void displayDetails() {
        System.out.println(name + dateOfBirth + gender + mobileNumber + bloodBankName);
    }
}

class Donor extends Person {

    public String donorType;
    public String bloodGroup;
    public String donationDate;

    public Donor(String name, String dateOfBirth, String gender, String mobileNumber, String bloodBankName, String donorType, String bloodGroup, String donationDate) {
        super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
        this.donorType = donorType;
        this.bloodGroup = bloodGroup;
        this.donationDate = donationDate;
    }

    public void displayDonorDetails() {
        System.out.println(name + dateOfBirth + gender + mobileNumber + bloodBankName + donorType + bloodGroup + donationDate);
    }
}

class Staff extends Person {

    public Integer employeeID;
    public String designation;

    public Staff(String name, String dateOfBirth, String gender, String mobileNumber, String bloodBankName, Integer employeeID, String designation) {
        super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
        this.employeeID = employeeID;
        this.designation = designation;
    }

    public void displayStaffDetails() {
        System.out.println(name + dateOfBirth + gender + mobileNumber + bloodBankName + Integer.toString(employeeID) + designation);
    }
}