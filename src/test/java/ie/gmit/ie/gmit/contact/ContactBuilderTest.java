package ie.gmit.ie.gmit.contact;

import ie.gmit.Contact;
import ie.gmit.contact.ContactBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ContactBuilderTest {

    private static final String FIRST_NAME = "Ted";
    private static final String LAST_NAME = "Crilly";
    private static final String ADDRESS_LINE_1 = "Parochial House";
    private static final String ADDRESS_LINE_2 = "Craggy Island";
    private static final String CITY = "Kinvara";
    private static final String PHONE_NUMBER = "0871234567";
    private static final String DATE_OF_BIRTH = "13/09/1987";
    private static final String EIR_CODE = "D01 F5P2";

    ContactBuilder contactBuilder;
    Contact contact;

    @Before
    public void setup() {
        contactBuilder = new ContactBuilder()
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .setAddressLine1(ADDRESS_LINE_1)
                .setAddressLine2(ADDRESS_LINE_2)
                .setCity(CITY)
                .setPhoneNumber(PHONE_NUMBER)
                .setDateOfBirth(DATE_OF_BIRTH)
                .setEirCode(EIR_CODE);

        //Contact
    }

/*
    @Test
    public void testContactBuilderCreatesContactSuccessfully() {
        contact = contactBuilder.getContact();
        Assertions.assertTrue(contactBuilder.getContact();
    }
*/

}
