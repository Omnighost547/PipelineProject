package ie.gmit.contact.data;

import ie.gmit.Contact;

public interface ContactList {

    int saveContact(String name, String secondName, String addressLine1, String addressLine2,
                    String city, String phoneNumber, String dob, String eirCode);

    boolean deleteContact(String name);

    Contact searchContact(String name);
}
