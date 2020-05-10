import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearchWindow {
    private Selenium selenium;
    SearchWindow searchWindow;

    @BeforeEach
    public void setup() throws Exception {
        searchWindow = new SearchWindow();
    }

    //First Name Testing//
    @Test
    public void TestFirstNameLable() throws Exception {
        String str = searchWindow.firstNameLable.getText();
        assertEquals("First Name", str);
    }

    @Test
    public void TestFirstName() throws Exception {
        String str = searchWindow.firstName.getText();
        assertEquals("Fatmir", str);
    }

    //Last Name Testing//
    @Test
    public void TestLastNameLable() throws Exception {
        String str = searchWindow.lastNameLable.getText();
        assertEquals("Last Name", str);
    }

    @Test
    public void TestLastName() throws Exception {
        String str = searchWindow.lastName.getText();
        assertEquals("Gusani", str);
    }

    //Address Testing//
    @Test
    public void TestAddress1Lable() throws Exception {
        String str = searchWindow.address1Lable.getText();
        assertEquals("Address 1", str);
    }

    @Test
    public void TestAddress1() throws Exception {
        String str = searchWindow.address1.getText();
        assertEquals("123 Fake street", str);
    }

    @Test
    public void TestAddress2Lable() throws Exception {
        String str = searchWindow.address2Lable.getText();
        assertEquals("Address 2", str);
    }

    @Test
    public void TestAddress2() throws Exception {
        String str = searchWindow.address2.getText();
        assertEquals("Westside", str);
    }

    //City Testing//
    @Test
    public void TestCityLable() throws Exception {
        String str = searchWindow.cityLable.getText();
        assertEquals("City", str);
    }

    @Test
    public void TestCity() throws Exception {
        String str = searchWindow.city.getText();
        assertEquals("Galway", str);
    }

    //Phone Number Testing//
    @Test
    public void TestPhoneNumberLable() throws Exception {
        String str = searchWindow.phoneNumberLable.getText();
        assertEquals("Phone Number", str);
    }

    @Test
    public void TestPhoneNumber() throws Exception {
        String str = searchWindow.phoneNumber.getText();
        assertEquals("087 430 7730", str);
    }

    //Date of Birth Testing//
    @Test
    public void TestDOBLable() throws Exception {
        String str = searchWindow.dateOfBirthLable.getText();
        assertEquals("Date of Birth", str);
    }

    @Test
    public void TestDOB() throws Exception {
        String str = searchWindow.dateOfBirth.getText();
        assertEquals("April 5th", str);
    }

    //Not Sure if this is right//
    //Test Back to Contact Book Button//
    @Test
    public void TestBackToContactBookButton() throws Exception{
        searchWindow.backToContactBook.addActionListener(searchWindow.backToContactBook.getAction());
    }

    //Test Delete Contact Button//
    @Test
    public void TestDeleteContactButton() throws Exception{
        searchWindow.deleteContact.addActionListener(searchWindow.deleteContact.getAction());
    }

    //Test Edit Contact Button//
    @Test
    public void TestEditContactButton() throws Exception{
        searchWindow.editContact.addActionListener(searchWindow.editContact.getAction());
    }
}