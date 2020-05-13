//Name : Fatmir Gusani
//Date : 11.05.2020
//This code test the EditWindow

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEditWindow {
    EditWindow editWindow;

    @BeforeEach
    public void setup() throws Exception
    {
        editWindow = new EditWindow();
    }

    //First Name Testing Label//
    @Test
    public void TestFirstNameLabel() throws Exception
    {
        String str = editWindow.firstNameLabel.getText();
        assertEquals("First Name", str);
    }

    //First Name Testing//
    @Test
    public void TestFirstName() throws Exception
    {
        String str = editWindow.firstName.getText();
        assertEquals("", str);
    }

    //Last Name Testing Label//
    @Test
    public void TestLastNameLable() throws Exception
    {
        String str = editWindow.lastNameLabel.getText();
        assertEquals("Last Name", str);
    }

    //Last Name Testing//
    @Test
    public void TestLastName() throws Exception
    {
        String str = editWindow.lastName.getText();
        assertEquals("", str);
    }

    //Address 1 Testing Label//
    @Test
    public void TestAddress1Lable() throws Exception
    {
        String str = editWindow.address1Label.getText();
        assertEquals("Address 1", str);
    }

    //Address 1 Testing//
    @Test
    public void TestAddress1() throws Exception
    {
        String str = editWindow.address1.getText();
        assertEquals("", str);
    }

    //Address 2 Testing Label//
    @Test
    public void TestAddress2Lable() throws Exception
    {
        String str = editWindow.address2Label.getText();
        assertEquals("Address 2", str);
    }

    //Address 2 Testing//
    @Test
    public void TestAddress2() throws Exception
    {
        String str = editWindow.address2.getText();
        assertEquals("", str);
    }

    //City Testing Label//
    @Test
    public void TestCityLable() throws Exception
    {
        String str = editWindow.cityLabel.getText();
        assertEquals("City", str);
    }

    //City Testing//
    @Test
    public void TestCity() throws Exception
    {
        String str = editWindow.city.getText();
        assertEquals("", str);
    }

    //Phone Number Testing Label//
    @Test
    public void TestPhoneNumberLable() throws Exception
    {
        String str = editWindow.phoneNumberLabel.getText();
        assertEquals("Phone Number", str);
    }

    //Phone Number Testing//
    @Test
    public void TestPhoneNumber() throws Exception
    {
        String str = editWindow.phoneNumber.getText();
        assertEquals("", str);
    }

    //Date of Birth Testing Label//
    @Test
    public void TestDOBLable() throws Exception
    {
        String str = editWindow.dateOfBirthLabel.getText();
        assertEquals("Date of Birth", str);
    }

    @Test
    public void TestDOB() throws Exception
    {
        String str = editWindow.dateOfBirth.getText();
        assertEquals("", str);
    }

    //Date of Birth Testing//
    @Test
    public void TestEirCodeLable() throws Exception
    {
        String str = editWindow.eircodeLabel.getText();
        assertEquals("Eir Code", str);
    }

    //EirCode Testing Label//
    @Test
    public void TestEirCode() throws Exception
    {
        String str = editWindow.eircode.getText();
        assertEquals("", str);
    }

    //Not sure if this is right//
    //Test the Done Editing button
    @Test
    public void TestDoneEditButton() throws Exception
    {
        editWindow.doneEdit.addActionListener(editWindow.doneEdit.getAction());
    }

    //Test the Back To Contact Book button
    @Test
    public void TestBackToContactBookButton() throws Exception
    {
        editWindow.backToContactBook.addActionListener(editWindow.backToContactBook.getAction());
    }

}
