//Name : Fatmir Gusani
//Date : 11.05.2020
//This Code tests the Search window

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearchWindow {
    SearchWindow searchWindow;

    @BeforeEach
    public void setup() throws Exception
    {
        searchWindow = new SearchWindow();
    }

    //First Name Testing Label//
    @Test
    public void TestFirstNameLabel() throws Exception
    {
        String str = searchWindow.firstNameLabel.getText();
        assertEquals("First Name", str);
    }

    //First Name Testing//
    @Test
    public void TestFirstName() throws Exception
    {
        String str = searchWindow.firstName.getText();
        assertEquals("", str);
    }

    //Last Name Testing Label//
    @Test
    public void TestLastNameLabel() throws Exception
    {
        String str = searchWindow.lastNameLabel.getText();
        assertEquals("Last Name", str);
    }

    //Last Name Testing//
    @Test
    public void TestLastName() throws Exception
    {
        String str = searchWindow.lastName.getText();
        assertEquals("", str);
    }

    //Address 1 Testing Label//
    @Test
    public void TestAddress1Label() throws Exception
    {
        String str = searchWindow.address1Label.getText();
        assertEquals("Address 1", str);
    }

    //Address 1 Testing//
    @Test
    public void TestAddress1() throws Exception
    {
        String str = searchWindow.address1.getText();
        assertEquals("", str);
    }

    //Address 2 Testing Label//
    @Test
    public void TestAddress2Label() throws Exception
    {
        String str = searchWindow.address2Label.getText();
        assertEquals("Address 2", str);
    }

    //Address 2 Testing//
    @Test
    public void TestAddress2() throws Exception
    {
        String str = searchWindow.address2.getText();
        assertEquals("", str);
    }

    //City Testing Label//
    @Test
    public void TestCityLabel() throws Exception
    {
        String str = searchWindow.cityLabel.getText();
        assertEquals("City", str);
    }

    //City Testing//
    @Test
    public void TestCity() throws Exception
    {
        String str = searchWindow.city.getText();
        assertEquals("", str);
    }

    //Phone Number Testing Label//
    @Test
    public void TestPhoneNumberLabel() throws Exception
    {
        String str = searchWindow.phoneNumberLabel.getText();
        assertEquals("Phone Number", str);
    }

    //Phone Number Testing//
    @Test
    public void TestPhoneNumber() throws Exception
    {
        String str = searchWindow.phoneNumber.getText();
        assertEquals("", str);
    }

    //Date of Birth Testing Label//
    @Test
    public void TestDOBLabel() throws Exception
    {
        String str = searchWindow.dateOfBirthLabel.getText();
        assertEquals("Date of Birth", str);
    }

    //Date of Birth Testing//
    @Test
    public void TestDOB() throws Exception
    {
        String str = searchWindow.dateOfBirth.getText();
        assertEquals("", str);
    }

    //EirCode Testing Label//
    @Test
    public void TestEirCodeLabel() throws Exception
    {
        String str = searchWindow.eircodeLabel.getText();
        assertEquals("Eir Code", str);
    }

    //EirCode Testing//
    @Test
    public void TestEirCode() throws Exception
    {
        String str = searchWindow.eircode.getText();
        assertEquals("", str);
    }

    //Not Sure if this is right//
    //Test Back to Contact Book Button//
    @Test
    public void TestBackToContactBookButton() throws Exception
    {
        searchWindow.backToContactBook.addActionListener(searchWindow.backToContactBook.getAction());
    }

    //Test Delete Contact Button//
    @Test
    public void TestDeleteContactButton() throws Exception
    {
        searchWindow.deleteContact.addActionListener(searchWindow.deleteContact.getAction());
    }

    //Test Edit Contact Button//
    @Test
    public void TestEditContactButton() throws Exception
    {
        searchWindow.editContact.addActionListener(searchWindow.editContact.getAction());
    }
}
