import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Contact {
    @Test
    void testConstructorTwoARG() {
        Contact myContact = new Contact("Sean","Kelly");
        assertEquals("Sean",myContact.getName());
        assertEquals("Kelly",myContact.getSecondName());
    }
    @Test
    void testDestructorTwoARG() {
        Contact myContact = new Contact(""," ");
        myContact.setName("Sean");
        myContact.setSecondName("Kelly");
        assertEquals("Sean",myContact.getName());
        assertEquals("Kelly",myContact.getSecondName());
    }

    @Test
    void  testConstructorThreeARG(){
        Contact myContact = new Contact("Sean","Kelly","12345678");
        assertEquals("Sean",myContact.getName());
        assertEquals("Kelly",myContact.getSecondName());
        assertEquals("12345678",myContact.getPhoneNr());
    }
    @Test
    void testDestructorThreeARG(){
        Contact myContact = new Contact(" "," "," ");
        myContact.setName("Sean");
        myContact.setSecondName("Kelly");
        myContact.setPhoneNr("12345678");
        assertEquals("Sean",myContact.getName());
        assertEquals("Kelly",myContact.getSecondName());
        assertEquals("12345678",myContact.getPhoneNr());
    }
    @Test
    void testFullConstructor(){
        Contact myContact = new Contact("Sean","Kelly","Monivea","Athenry","Galway","12345678","15/05/1998","H65HN81");
        assertEquals("Sean",myContact.getName());
        assertEquals("Kelly",myContact.getSecondName());
        assertEquals("12345678",myContact.getPhoneNr());
        assertEquals("Monivea",myContact.getAddressLine1());
        assertEquals("Athenry",myContact.getAddressLine2());
        assertEquals("Galway",myContact.getCity());
        assertEquals("15/05/1998",myContact.getDOB());
        assertEquals("H65HN81",myContact.getEirCode());

    }
    @Test
    void testFullDestructor(){
        Contact myContact = new Contact(" "," "," "," "," "," "," "," ");
        myContact.setName("Sean");
        myContact.setSecondName("Kelly");
        myContact.setPhoneNr("12345678");
        myContact.setAddressLine1("Monivea");
        myContact.setAddressLine2("Athenry");
        myContact.setCity("Galway");
        myContact.setDOB("15/05/1998");
        myContact.setEirCode("H65HN81");
        assertEquals("Sean",myContact.getName());
        assertEquals("Kelly",myContact.getSecondName());
        assertEquals("12345678",myContact.getPhoneNr());
        assertEquals("Monivea",myContact.getAddressLine1());
        assertEquals("Athenry",myContact.getAddressLine2());
        assertEquals("Galway",myContact.getCity());
        assertEquals("15/05/1998",myContact.getDOB());
        assertEquals("H65HN81",myContact.getEirCode());

    }
    @Test
    void testName(){
     // Name myName = new Name("Sean") ;
    }



    @Test
    void testGetters(){

    }
    @Test
    void testSetters(){

    }
}
