public class Contact {

    private String name;
    private String secondName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String phoneNr;
    private String DOB;
    private String eirCode;

    //constructor for contact with mane, second name
    public Contact(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
    //constructor for contact with mane, second name, prone number
    public Contact(String name, String secondName, String phoneNr) {
        this.name = name;
        this.secondName = secondName;
        this.phoneNr = phoneNr;
    }
    //constructor for contact with all entries
    public Contact(String name, String secondName, String addressLine1, String addressLine2, String city, String phoneNr, String DOB, String eirCode) {
        this.name = name;
        this.secondName = secondName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.phoneNr = phoneNr;
        this.DOB = DOB;
        this.eirCode = eirCode;
    }
    //getter and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEirCode() {
        return eirCode;
    }

    public void setEirCode(String eirCode) {
        this.eirCode = eirCode;
    }
    //to string method


    @Override
    public String toString() {
        return name+ " " + secondName + "\n"
                + "Address:\n"
                + addressLine1 + "\n"
                + addressLine2 + "\n"
                + city + "\n"
                + "Phone Number" + phoneNr + "\n"
                + "Date of Birth" + DOB + "\n"
                + "EIRCODE" + eirCode + "\n";
    }
}
