//Name : Fatmir Gusani
//Date : 11.05.2020
//This code test the MainGUI

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainGUI {
    MainGUI mainGUI;

    @BeforeEach
    public void setup() throws Exception {
             mainGUI = new MainGUI();
    }

    //First Name Testing Label//
    @Test
    public void TestFirstNameLabel() throws Exception {
        String str = mainGUI.firstNameLabel.getText();
        assertEquals("First Name", str);
    }

    //First Name Testing//
    @Test
    public void TestFirstName() throws Exception {
        String str = mainGUI.firstName.getText();
        assertEquals("Fatmir", str);
    }

    //Last Name Testing Label//
    @Test
    public void TestLastNameLabel() throws Exception {
        String str = mainGUI.lastNameLabel.getText();
        assertEquals("Last Name", str);
    }

    //Last Name Testing//
    @Test
    public void TestLastName() throws Exception {
        String str = mainGUI.lastName.getText();
        assertEquals("", str);
    }

    //Address 1 Testing Label//
    @Test
    public void TestAddress1Label() throws Exception {
        String str = mainGUI.address1Label.getText();
        assertEquals("Address 1", str);
    }

    //Address 1 Testing//
    @Test
    public void TestAddress1() throws Exception {
        String str = mainGUI.address1.getText();
        assertEquals("", str);
    }

    //Address 2 Testing Label//
    @Test
    public void TestAddress2Label() throws Exception {
        String str = mainGUI.address2Label.getText();
        assertEquals("Address 2", str);
    }

    //Address 2 Testing//
    @Test
    public void TestAddress2() throws Exception {
        String str = mainGUI.address2.getText();
        assertEquals("", str);
    }

    //City Testing Label//
    @Test
    public void TestCityLabel() throws Exception {
        String str = mainGUI.cityLabel.getText();
        assertEquals("City", str);
    }

    //City Testing//
    @Test
    public void TestCity() throws Exception {
        String str = mainGUI.city.getText();
        assertEquals("", str);
    }

    //Phone Number Testing Label//
    @Test
    public void TestPhoneNumberLabel() throws Exception {
        String str = mainGUI.phoneNumberLabel.getText();
        assertEquals("Phone Number", str);
    }

    //Phone Number Testing//
    @Test
    public void TestPhoneNumber() throws Exception {
        String str = mainGUI.phoneNumber.getText();
        assertEquals("", str);
    }

    //Date of Birth Testing Label//
    @Test
    public void TestDOBLabel() throws Exception {
        String str = mainGUI.dateOfBirthLabel.getText();
        assertEquals("Date of Birth", str);
    }

    //Date of Birth Testing//
    @Test
    public void TestDOB() throws Exception {
        String str = mainGUI.dateOfBirth.getText();
        assertEquals("", str);
    }

    //EirCode Testing Label//
    @Test
    public void TestEirCodeLabel() throws Exception {
        String str = mainGUI.eircodeLabel.getText();
        assertEquals("Eir Code", str);
    }

    //EirCode Testing//
    @Test
    public void TestEirCode() throws Exception {
        String str = mainGUI.eircode.getText();
        assertEquals("", str);
    }

    //Not sure if this is right//
    //Test the Add Contact button
    @Test
    public void TestAddContactButton() throws Exception{
        mainGUI.addContact.addActionListener(mainGUI.addContact.getAction());
    }

    //Test the Search Contact button
    @Test
    public void TestSearchContactButton() throws Exception{
        mainGUI.searchContact.addActionListener(mainGUI.searchContact.getAction());
    }
}
