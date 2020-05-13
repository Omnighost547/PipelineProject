/*
 * Singleton class for an in-memory list of contacts
 * Tommy Kearns - G00320978
 * 2020-05-07
 * Software Engineering with Test
 * Team Project
 */
package ie.gmit.contact.data;

import ie.gmit.Contact;
import ie.gmit.contact.ContactBuilder;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactList implements ContactList {

    private static InMemoryContactList instance;

    private InMemoryContactList()
    {
    }

    synchronized public static InMemoryContactList getInstance()
    {
        if (instance == null) {
            instance = new InMemoryContactList();
        }
        return instance;
    }

    private static final List<Contact> contactDb = new ArrayList<>();

    @Override
    public int saveContact(String name, String secondName, String addressLine1, String addressLine2, String city, String phoneNumber, String dob, String eirCode)
    {
        try {
            ContactBuilder contactBuilder = new ContactBuilder()
                    .setFirstName(name).setLastName(secondName)
                    .setAddressLine1(addressLine1).setAddressLine2(addressLine2)
                    .setCity(city).setPhoneNumber(phoneNumber).setDateOfBirth(dob).setEirCode(eirCode);

            contactDb.add(contactBuilder.getContact());
        } catch (Exception e) {
            return Integer.parseInt(e.getMessage().substring(e.getMessage().length() - 1));
        }
        return 0;
    }

    @Override
    public boolean deleteContact(String name)
    {
        Contact contactToDelete = contactDb.stream()
                .filter(contact -> name.equals(contact.getName()))
                .findFirst().orElse(null);

        if (contactToDelete == null) {
            return false;
        }
        contactDb.remove(contactToDelete);
        return true;
    }

    @Override
    public Contact searchContact(String name)
    {
        return contactDb.stream()
                .filter(contact -> name.equals(contact.getName()))
                .findFirst().orElse(null);
    }


}
