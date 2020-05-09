import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEditWindow {
    private Selenium selenium;
    EditWindow editWindow;

    @BeforeEach
    public void setup() throws Exception {
        editWindow = new EditWindow();
    }

    //First Name Testing//
    @Test
    public void TestFirstNameLable() throws Exception {
        String str = editWindow.firstNameLable.getText();
        assertEquals("First Name", str);
    }

    @Test
    public void TestFirstName() throws Exception {
        String str = editWindow.firstName.getText();
        assertEquals("Edit First Name", str);
    }

    //Last Name Testing//
    @Test
    public void TestLastNameLable() throws Exception {
        String str = editWindow.lastNameLable.getText();
        assertEquals("Last Name", str);
    }

    @Test
    public void TestLastName() throws Exception {
        String str = editWindow.lastName.getText();
        assertEquals("Edit Last Name", str);
    }

    //Address Testing//
    @Test
    public void TestAddressLable() throws Exception {
        String str = editWindow.addressLable.getText();
        assertEquals("Address", str);
    }

    @Test
    public void TestAddress() throws Exception {
        String str = editWindow.address.getText();
        assertEquals("Edit Address", str);
    }

    //City Testing//
    @Test
    public void TestCityLable() throws Exception {
        String str = editWindow.cityLable.getText();
        assertEquals("City", str);
    }

    @Test
    public void TestCity() throws Exception {
        String str = editWindow.city.getText();
        assertEquals("Edit City", str);
    }

    //Phone Number Testing//
    @Test
    public void TestPhoneNumberLable() throws Exception {
        String str = editWindow.phoneNumberLable.getText();
        assertEquals("Phone Number", str);
    }

    @Test
    public void TestPhoneNumber() throws Exception {
        String str = editWindow.phoneNumber.getText();
        assertEquals("Edit Phone Number", str);
    }

    //Date of Birth Testing//
    @Test
    public void TestDOBLable() throws Exception {
        String str = editWindow.dateOfBirthLable.getText();
        assertEquals("Date of Birth", str);
    }

    @Test
    public void TestDOB() throws Exception {
        String str = editWindow.dateOfBirth.getText();
        assertEquals("Edit Date of Birth", str);
    }

    @Test
    public void TestDoneEditButton() throws Exception{
        editWindow.doneEdit.addActionListener(editWindow.doneEdit.getAction());
    }

    @Test
    public void TestBackToContactBookButton() throws Exception{
        editWindow.backToContactBook.addActionListener(editWindow.backToContactBook.getAction());
    }

}
