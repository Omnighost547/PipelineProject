package ie.gmit;

import ie.gmit.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Contact {
    @Test
    void testConstructorTwoARG()
    {
        Contact myContact = new Contact("Sean", "Kelly");
        assertEquals("Sean", myContact.getName());
        assertEquals("Kelly", myContact.getSecondName());
    }

    @Test
    void testDestructorTwoARG()
    {
        Contact myContact = new Contact("", " ");
        myContact.setName("Sean");
        myContact.setSecondName("Kelly");
        assertEquals("Sean", myContact.getName());
        assertEquals("Kelly", myContact.getSecondName());
    }

    @Test
    void testConstructorThreeARG()
    {
        Contact myContact = new Contact("Sean", "Kelly", "12345678");
        assertEquals("Sean", myContact.getName());
        assertEquals("Kelly", myContact.getSecondName());
        assertEquals("12345678", myContact.getPhoneNr());
    }

    @Test
    void testDestructorThreeARG()
    {
        Contact myContact = new Contact(" ", " ", " ");
        myContact.setName("Sean");
        myContact.setSecondName("Kelly");
        myContact.setPhoneNr("12345678");
        assertEquals("Sean", myContact.getName());
        assertEquals("Kelly", myContact.getSecondName());
        assertEquals("12345678", myContact.getPhoneNr());
    }

    @Test
    void testFullConstructor()
    {
        Contact myContact =
                new Contact("Sean", "Kelly", "Galway", "Galway", "Galway", "12345678", "10/06/1999", "8fuxkoj");
        assertEquals("Sean", myContact.getName());
        assertEquals("Kelly", myContact.getSecondName());
        assertEquals("12345678", myContact.getPhoneNr());
        assertEquals("Galway", myContact.getAddressLine1());
        assertEquals("Galway", myContact.getAddressLine2());
        assertEquals("Galway", myContact.getCity());
        assertEquals("10/06/1999", myContact.getDOB());
        assertEquals("8fuxkoj", myContact.getEirCode());
    }

    @Test
    void testFullDestructor()
    {
        Contact myContact = new Contact(" ", " ", " ", " ", " ", " ", " ", " ");
        myContact.setName("Sean");
        myContact.setSecondName("Kelly");
        myContact.setPhoneNr("12345678");
        myContact.setAddressLine1("Galway");
        myContact.setAddressLine2("Galway");
        myContact.setCity("Galway");
        myContact.setDOB("10/06/1999");
        myContact.setEirCode("8fuxkoj");
        assertEquals("Sean", myContact.getName());
        assertEquals("Kelly", myContact.getSecondName());
        assertEquals("12345678", myContact.getPhoneNr());
        assertEquals("Galway", myContact.getAddressLine1());
        assertEquals("Galway", myContact.getAddressLine2());
        assertEquals("Galway", myContact.getCity());
        assertEquals("10/06/1999", myContact.getDOB());
        assertEquals("8fuxkoj", myContact.getEirCode());

    }

}
