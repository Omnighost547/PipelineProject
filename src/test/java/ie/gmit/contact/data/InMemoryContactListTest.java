/*
 * Tommy Kearns - G00320978
 * 2020-05-07
 * Software Engineering with Test
 * Team Project
 */
package ie.gmit.contact.data;

import ie.gmit.Contact;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class InMemoryContactListTest {

    private static final String FIRST_NAME = "Ted";
    private static final String LAST_NAME = "Crilly";
    private static final String ADDRESS_LINE_1 = "Parochial House";
    private static final String ADDRESS_LINE_2 = "Craggy Island";
    private static final String CITY = "Kinvara";
    private static final String PHONE_NUMBER = "0871234567";
    private static final String DATE_OF_BIRTH = "13/09/1987";
    private static final String EIR_CODE = "D01 F5P2";

    InMemoryContactList inMemoryContactList;
    Contact contact;

    @Before
    public void setup()
    {
//        inMemoryContactList = InMemoryContactList.getInstance();
        inMemoryContactList = Mockito.mock(InMemoryContactList.class);
        contact = new Contact(FIRST_NAME, LAST_NAME, ADDRESS_LINE_1, ADDRESS_LINE_2, CITY, PHONE_NUMBER, DATE_OF_BIRTH,
                EIR_CODE);
    }


    @DisplayName("When Contact is created, then the object is added to the persistence service")
    @Test
    public void testContactStoredSuccessfully()
    {
        int result = inMemoryContactList.saveContact(FIRST_NAME, LAST_NAME, ADDRESS_LINE_1, ADDRESS_LINE_2, CITY,
                PHONE_NUMBER, DATE_OF_BIRTH, EIR_CODE);
        Assertions.assertEquals(result, 0);
    }


}
