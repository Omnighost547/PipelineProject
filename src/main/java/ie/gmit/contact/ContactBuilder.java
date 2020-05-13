package ie.gmit.contact;

import ie.gmit.Contact;
import ie.gmit.pm.Validator;

public class ContactBuilder {

    private final Validator validator = new Validator();
    private int errorCode = 0;

    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String phoneNumber;
    private String dateOfBirth;
    private String eirCode;

    public ContactBuilder setFirstName(String firstName)
    {
        errorCode = validator.validateName(firstName);
        if (errorCode == 0) {
            this.firstName = firstName;
        }
        return this;
    }

    public ContactBuilder setLastName(String lastName)
    {
        errorCode = validator.validateSecondName(lastName);
        if (errorCode == 0) {
            this.lastName = lastName;
        }
        return this;
    }

    public ContactBuilder setAddressLine1(String addressLine1)
    {
        this.addressLine1 = addressLine1;
        return this;
    }

    public ContactBuilder setAddressLine2(String addressLine2)
    {
        this.addressLine2 = addressLine2;
        return this;
    }

    public ContactBuilder setCity(String city)
    {
        this.city = city;
        return this;
    }

    public ContactBuilder setPhoneNumber(String phoneNumber)
    {
        errorCode = validator.validatePhoneNumber(phoneNumber);
        if (errorCode == 0) {
            this.phoneNumber = phoneNumber;
        }
        return this;
    }

    public ContactBuilder setDateOfBirth(String dateOfBirth)
    {
        errorCode = validator.validateDOB(dateOfBirth);
        if (errorCode == 0) {
            this.dateOfBirth = dateOfBirth;
        }
        return this;
    }

    public ContactBuilder setEirCode(String eirCode)
    {
        errorCode = validator.validateEirCode(eirCode);
        if (errorCode == 0) {
            this.eirCode = eirCode;
        }
        return this;
    }

    public Contact getContact() throws Exception
    {
        if (errorCode == 0) {
            return new Contact(firstName, lastName, addressLine1, addressLine2, city, phoneNumber, dateOfBirth,
                    eirCode);
        } else {
            throw new Exception("Validator error code: " + errorCode);
        }
    }
}
