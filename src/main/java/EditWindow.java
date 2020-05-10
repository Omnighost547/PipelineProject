import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class EditWindow implements ActionListener {

    JTextField firstName, lastName, address1, address2, city, phoneNumber, dateOfBirth,eircode;
    JLabel firstNameLable, lastNameLable, address1Lable,address2Lable, cityLable, phoneNumberLable, dateOfBirthLable,eircodeLable, contactbook;
    JButton doneEdit, backToContactBook;

    EditWindow() {

        JFrame f = new JFrame();
        //f.setBackground(Color.RED);

        contactbook = new JLabel("Edit Details");
        contactbook.setBounds(150, 10, 150, 20);
        Font bigFont = contactbook.getFont().deriveFont(Font.BOLD, 20f);
        contactbook.setFont(bigFont);

        firstNameLable = new JLabel("First Name");
        firstNameLable.setBounds(50, 50, 150, 20);
        //Get Name to edit//
        firstName = new JTextField("Edit First Name");
        firstName.setBounds(150, 50, 200, 20);

        lastNameLable = new JLabel("Last Name");
        lastNameLable.setBounds(50, 70, 150, 20);
        //Get Name to edit//
        lastName = new JTextField("Edit Last Name");
        lastName.setBounds(150, 70, 200, 20);

        address1Lable = new JLabel("Address 1");
        address1Lable.setBounds(50, 90, 150, 20);
        //Get Address to edit//
        address1 = new JTextField("Edit Address 1");
        address1.setBounds(150, 90, 200, 20);

        address2Lable = new JLabel("Address 2");
        address2Lable.setBounds(50, 110, 150, 20);
        //Get Address to edit//
        address2 = new JTextField("Edit Address 2");
        address2.setBounds(150, 110, 200, 20);

        cityLable = new JLabel("City");
        cityLable.setBounds(50, 130, 150, 20);
        //Get City to edit//
        city = new JTextField("Edit City");
        city.setBounds(150, 130, 200, 20);

        phoneNumberLable = new JLabel("Phone Number");
        phoneNumberLable.setBounds(50, 150, 150, 20);
        //Get PhoneNumber to edit//5
        phoneNumber = new JTextField("Edit Phone Number");
        phoneNumber.setBounds(150, 150, 200, 20);

        dateOfBirthLable = new JLabel("Date of Birth");
        dateOfBirthLable.setBounds(50, 170, 150, 20);
        //Get Date of birth to edit//
        dateOfBirth = new JTextField("Edit Date of Birth");
        dateOfBirth.setBounds(150, 170, 200, 20);

        eircodeLable = new JLabel("Eir Code");
        eircodeLable.setBounds(50, 190, 150, 20);
        //Get Date of birth to edit//
        eircode = new JTextField("Edit Eir Code");
        eircode.setBounds(150, 190, 200, 20);

        doneEdit = new JButton("Done Editing");
        doneEdit.setBounds(0, 220, 200, 50);
        doneEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:save details into database//
                //go back to homepage//
                MainGUI mainGUI = new MainGUI();
                f.dispose();
            }
        });

        backToContactBook = new JButton("Contact Book");
        backToContactBook.setBounds(200, 220, 200, 50);
        backToContactBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI mainGUI = new MainGUI();
                f.dispose();
            }
        });

        f.add(contactbook);
        f.add(firstNameLable);
        f.add(firstName);
        f.add(lastNameLable);
        f.add(lastName);
        f.add(address1Lable);
        f.add(address1);
        f.add(address2Lable);
        f.add(address2);
        f.add(cityLable);
        f.add(city);
        f.add(phoneNumberLable);
        f.add(phoneNumber);
        f.add(dateOfBirthLable);
        f.add(dateOfBirth);
        f.add(eircodeLable);
        f.add(eircode);
        f.add(doneEdit);
        f.add(backToContactBook);

        f.setSize(415, 330);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        new EditWindow();
    } }