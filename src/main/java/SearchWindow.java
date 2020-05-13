//Name : Fatmir Gusani
//Date : 11.05.2020
//This code Creates the search gui for the user to enter details.
//Details can be deleted
//Details can be edited

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class SearchWindow implements ActionListener {

    JLabel firstName, lastName, address1, address2, city, phoneNumber, dateOfBirth, eircode;
    JLabel firstNameLabel, lastNameLabel, address1Label, address2Label, cityLabel, phoneNumberLabel, dateOfBirthLabel, eircodeLabel, contactbook;
    JButton editContact, deleteContact, backToContactBook;

    SearchWindow() {
        JFrame f = new JFrame();
        database d = new database();
        MainGUI m = new MainGUI();
        ContactController contactController = new ContactController();

        contactbook = new JLabel("Search Contact");
        contactbook.setBounds(150, 10, 150, 20);
        Font bigFont = contactbook.getFont().deriveFont(Font.BOLD, 20f);
        contactbook.setFont(bigFont);

        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(50, 50, 150, 20);
        //Get Name From DataBase
        firstName = new JLabel();
        firstName.setBounds(150, 50, 200, 20);

        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(50, 70, 150, 20);
        //Get Name From DataBase
        lastName = new JLabel("");
        lastName.setBounds(150, 70, 200, 20);

        address1Label = new JLabel("Address 1");
        address1Label.setBounds(50, 90, 150, 20);
        //Get Address From DataBase
        address1 = new JLabel("");
        address1.setBounds(150, 90, 200, 20);

        address2Label = new JLabel("Address 2");
        address2Label.setBounds(50, 110, 150, 20);
        //Get Address From DataBase
        address2 = new JLabel("");
        address2.setBounds(150, 110, 200, 20);

        cityLabel = new JLabel("City");
        cityLabel.setBounds(50, 130, 150, 20);
        //Get City From DataBase
        city = new JLabel("");
        city.setBounds(150, 130, 200, 20);

        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberLabel.setBounds(50, 150, 150, 20);
        //Get Phone Number From DataBase
        phoneNumber = new JLabel("");
        phoneNumber.setBounds(150, 150, 200, 20);

        dateOfBirthLabel = new JLabel("Date of Birth");
        dateOfBirthLabel.setBounds(50, 170, 150, 20);
        dateOfBirth = new JLabel("");
        dateOfBirth.setBounds(150, 170, 200, 20);

        eircodeLabel = new JLabel("Eir Code");
        eircodeLabel.setBounds(50, 190, 150, 20);
        eircode = new JLabel("");
        eircode.setBounds(150, 190, 200, 20);

        editContact = new JButton("Edit Contact");
        editContact.setBounds(0, 220, 200, 50);
        editContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditWindow editWindow = new EditWindow();
                f.dispose();
            }
        });

        deleteContact = new JButton("Delete Contact");
        deleteContact.setBounds(200, 220, 200, 50);
        deleteContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test;
                test = contactController.deleteContact(firstName.getText());
            }
        });

        backToContactBook = new JButton("Contact Book");
        backToContactBook.setBounds(100, 270, 200, 50);
        backToContactBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainGUI();
                f.dispose();
            }
        });

        f.add(contactbook);
        f.add(firstNameLabel);
        f.add(firstName);
        f.add(lastNameLabel);
        f.add(lastName);
        f.add(address1Label);
        f.add(address1);
        f.add(address2Label);
        f.add(address2);
        f.add(cityLabel);
        f.add(city);
        f.add(phoneNumberLabel);
        f.add(phoneNumber);
        f.add(dateOfBirthLabel);
        f.add(dateOfBirth);
        f.add(eircodeLabel);
        f.add(eircode);
        f.add(editContact);
        f.add(deleteContact);
        f.add(backToContactBook);

        f.setSize(415, 370);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
    //public static void main(String[] args) {
    //    new SearchWindow();
    //}