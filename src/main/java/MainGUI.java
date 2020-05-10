import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class MainGUI implements ActionListener {

    JTextField firstName, lastName, address1,address2, city, phoneNumber, dateOfBirth, eircode;
    JLabel firstNameLable, lastNameLable, address1Lable,address2Lable, cityLable, phoneNumberLable, dateOfBirthLable,eircodeLable,contactbook;
    JButton addContact, searchContact;

    MainGUI() {

        JFrame f = new JFrame();
        f.setBackground(Color.RED);

        contactbook = new JLabel("Contact Book");
        contactbook.setBounds(150, 10, 150, 20);
        Font bigFont = contactbook.getFont().deriveFont(Font.BOLD, 20f);
        contactbook.setFont(bigFont);

        firstNameLable = new JLabel("First Name");
        firstNameLable.setBounds(50, 50, 150, 20);
        //The Value in here is test, thats why testing was good.//
        firstName = new JTextField("Enter First Name");
        firstName.setBounds(150, 50, 200, 20);

        lastNameLable = new JLabel("Last Name");
        lastNameLable.setBounds(50, 70, 150, 20);
        lastName = new JTextField("Enter Last Name");
        lastName.setBounds(150, 70, 200, 20);

        address1Lable = new JLabel("Address 1");
        address1Lable.setBounds(50, 90, 150, 20);
        address1 = new JTextField("Enter Address 1");
        address1.setBounds(150, 90, 200, 20);

        address2Lable = new JLabel("Address 2");
        address2Lable.setBounds(50, 110, 150, 20);
        address2 = new JTextField("Enter Address 2");
        address2.setBounds(150, 110, 200, 20);

        cityLable = new JLabel("City");
        cityLable.setBounds(50, 130, 150, 20);
        city = new JTextField("Enter City");
        city.setBounds(150, 130, 200, 20);

        phoneNumberLable = new JLabel("Phone Number");
        phoneNumberLable.setBounds(50, 150, 150, 20);
        phoneNumber = new JTextField("Enter Phone Number");
        phoneNumber.setBounds(150, 150, 200, 20);

        dateOfBirthLable = new JLabel("Date of Birth");
        dateOfBirthLable.setBounds(50, 170, 150, 20);
        dateOfBirth = new JTextField("Enter Data of Birth");
        dateOfBirth.setBounds(150, 170, 200, 20);

        eircodeLable = new JLabel("Eir Code");
        eircodeLable.setBounds(50, 190, 150, 20);
        eircode = new JTextField("Enter Eir Code");
        eircode.setBounds(150, 190, 200, 20);

        addContact = new JButton("Add Contact");
        addContact.setBounds(0, 220, 200, 50);
        addContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Functins
            }
        });

        searchContact = new JButton("Search Contact");
        searchContact.setBounds(200, 220, 200, 50);

        //searchContact.addActionListener(this);
        searchContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchWindow searchWindow = new SearchWindow();
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
        f.add(addContact);
        f.add(searchContact);

        f.setSize(415, 330);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        /*
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);

         */
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}