//Name : Fatmir Gusani
//Date : 11.05.2020
//This code Creates the edit gui for the user to change details.
//Details can be edited

import ie.gmit.contact.data.ContactList;
import ie.gmit.contact.data.InMemoryContactList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditWindow implements ActionListener {

    JTextField firstName, lastName, address1, address2, city, phoneNumber, dateOfBirth, eircode;
    JLabel firstNameLabel, lastNameLabel, address1Label, address2Label, cityLabel, phoneNumberLabel, dateOfBirthLabel, eircodeLabel, contactbook;
    JButton doneEdit, backToContactBook;

    EditWindow() {

        JFrame f = new JFrame();
        ContactList contactController = InMemoryContactList.getInstance();
        //f.setBackground(Color.RED);

        contactbook = new JLabel("Edit Details");
        contactbook.setBounds(150, 10, 150, 20);
        Font bigFont = contactbook.getFont().deriveFont(Font.BOLD, 20f);
        contactbook.setFont(bigFont);

        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(50, 50, 150, 20);
        //Get Name to edit//
        firstName = new JTextField("");
        firstName.setBounds(150, 50, 200, 20);

        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(50, 70, 150, 20);
        //Get Name to edit//
        lastName = new JTextField("");
        lastName.setBounds(150, 70, 200, 20);

        address1Label = new JLabel("Address 1");
        address1Label.setBounds(50, 90, 150, 20);
        //Get Address to edit//
        address1 = new JTextField("");
        address1.setBounds(150, 90, 200, 20);

        address2Label = new JLabel("Address 2");
        address2Label.setBounds(50, 110, 150, 20);
        //Get Address to edit//
        address2 = new JTextField("");
        address2.setBounds(150, 110, 200, 20);

        cityLabel = new JLabel("City");
        cityLabel.setBounds(50, 130, 150, 20);
        //Get City to edit//
        city = new JTextField("");
        city.setBounds(150, 130, 200, 20);

        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberLabel.setBounds(50, 150, 150, 20);
        //Get PhoneNumber to edit//5
        phoneNumber = new JTextField("");
        phoneNumber.setBounds(150, 150, 200, 20);

        dateOfBirthLabel = new JLabel("Date of Birth");
        dateOfBirthLabel.setBounds(50, 170, 150, 20);
        //Get Date of birth to edit//
        dateOfBirth = new JTextField("");
        dateOfBirth.setBounds(150, 170, 200, 20);

        eircodeLabel = new JLabel("Eir Code");
        eircodeLabel.setBounds(50, 190, 150, 20);
        //Get eir code to edit//
        eircode = new JTextField("");
        eircode.setBounds(150, 190, 200, 20);

        doneEdit = new JButton("Done Editing");
        doneEdit.setBounds(0, 220, 200, 50);
        doneEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:save details into database//
                //go back to homepage//

                int result;
                result = contactController.saveContact(firstName.getText(), lastName.getText(), address1.getText(), address2.getText(),
                        city.getText(), phoneNumber.getText(), dateOfBirth.getText(), eircode.getText());
                MainGUI mainGUI = new MainGUI();
                f.dispose();
            }
        });

        backToContactBook = new JButton("Cancel Editing");
        backToContactBook.setBounds(200, 220, 200, 50);
        backToContactBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI mainGUI = new MainGUI();
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
        f.add(doneEdit);
        f.add(backToContactBook);

        f.setSize(415, 330);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
    //public static void main(String[] args) {
    //    new EditWindow();
    //}
