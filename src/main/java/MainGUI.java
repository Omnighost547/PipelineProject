//Name : Fatmir Gusani
//Date : 11.05.2020
//This code Creates the main gui for the user to enter details.
//Name : Fatmir Gusani
//Date : 11.05.2020
//This code Creates the search gui for the user to enter details.
//Details can be added into database
//Details can be search into database

import ie.gmit.Contact;
import ie.gmit.contact.data.ContactList;
import ie.gmit.contact.data.InMemoryContactList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class MainGUI implements ActionListener {

    JTextField firstName, lastName, address1, address2, city, phoneNumber, dateOfBirth, eircode;
    JLabel firstNameLabel, lastNameLabel, address1Label, address2Label, cityLabel, phoneNumberLabel, dateOfBirthLabel,
            eircodeLabel, contactbook;
    JButton addContact, searchContact;

    MainGUI()
    {

        JFrame f = new JFrame();
        ContactList contactController = InMemoryContactList.getInstance();
        //database d = new database();

        contactbook = new JLabel("Contact Book");
        contactbook.setBounds(150, 10, 150, 20);
        Font bigFont = contactbook.getFont().deriveFont(Font.BOLD, 20f);
        contactbook.setFont(bigFont);

        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(50, 50, 150, 20);
        firstName = new JTextField("Fatmir");
        firstName.setBounds(150, 50, 200, 20);

        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(50, 70, 150, 20);
        lastName = new JTextField("");
        lastName.setBounds(150, 70, 200, 20);

        address1Label = new JLabel("Address 1");
        address1Label.setBounds(50, 90, 150, 20);
        address1 = new JTextField("");
        address1.setBounds(150, 90, 200, 20);

        address2Label = new JLabel("Address 2");
        address2Label.setBounds(50, 110, 150, 20);
        address2 = new JTextField("");
        address2.setBounds(150, 110, 200, 20);

        cityLabel = new JLabel("City");
        cityLabel.setBounds(50, 130, 150, 20);
        city = new JTextField("");
        city.setBounds(150, 130, 200, 20);

        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberLabel.setBounds(50, 150, 150, 20);
        phoneNumber = new JTextField("");
        phoneNumber.setBounds(150, 150, 200, 20);

        dateOfBirthLabel = new JLabel("Date of Birth");
        dateOfBirthLabel.setBounds(50, 170, 150, 20);
        dateOfBirth = new JTextField("");
        dateOfBirth.setBounds(150, 170, 200, 20);

        eircodeLabel = new JLabel("Eir Code");
        eircodeLabel.setBounds(50, 190, 150, 20);
        eircode = new JTextField("");
        eircode.setBounds(150, 190, 200, 20);

        addContact = new JButton("Add Contact");
        addContact.setBounds(0, 220, 200, 50);
        addContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int result;
                result = contactController.saveContact(firstName.getText(), lastName.getText(), address1.getText(),
                        address2.getText(),
                        city.getText(), phoneNumber.getText(), dateOfBirth.getText(), eircode.getText());

                if (result == 0) {
                    System.out.println("Contact Saved");
                }
                if (result == 1) {
                    System.out.println("issue with Name");
                }
                if (result == 2) {
                    System.out.println("issue with last name");
                }
                if (result == 3) {
                    System.out.println("issue with address");
                }
                if (result == 4) {
                    System.out.println("issue with Name");
                }
                if (result == 5) {
                    System.out.println("issue with Name");
                }
            }
        });

        searchContact = new JButton("Search Contact");
        searchContact.setBounds(200, 220, 200, 50);
        searchContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Contact c = contactController.searchContact(firstName.getText());
                System.out.println(c);
                new SearchWindow();
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
        f.add(addContact);
        f.add(searchContact);

        f.setSize(415, 330);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
    }
}
//public static void main(String[] args) {
//    new MainGUI();
//}
