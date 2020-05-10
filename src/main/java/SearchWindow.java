import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class SearchWindow implements ActionListener{

    JLabel firstName,lastName,address1,address2,city,phoneNumber,dateOfBirth,eircode;
    JLabel firstNameLable,lastNameLable,address1Lable,address2Lable,cityLable,phoneNumberLable,dateOfBirthLable,eircodeLable,contactbook;
    JButton editContact, deleteContact, backToContactBook;

    SearchWindow(){

        JFrame f= new JFrame();
        //f.setBackground(Color.GREEN);

        contactbook = new JLabel("Search Contact");
        contactbook.setBounds(150,10,150,20);
        Font bigFont = contactbook.getFont().deriveFont(Font.BOLD, 20f);
        contactbook.setFont(bigFont);


        firstNameLable = new JLabel("First Name");
        firstNameLable.setBounds(50,50,150,20);
        //Get Name From DataBase
        firstName = new JLabel("Fatmir");
        firstName.setBounds(150,50,200,20);


        lastNameLable = new JLabel("Last Name");
        lastNameLable.setBounds(50,70,150,20);
        //Get Name From DataBase
        lastName = new JLabel("Gusani");
        lastName.setBounds(150,70,200,20);

        address1Lable = new JLabel("Address 1");
        address1Lable.setBounds(50,90,150,20);
        //Get Address From DataBase
        address1 = new JLabel("123 Fake street");
        address1.setBounds(150,90,200,20);

        address2Lable = new JLabel("Address 2");
        address2Lable.setBounds(50,110,150,20);
        //Get Address From DataBase
        address2 = new JLabel("Westside");
        address2.setBounds(150,110,200,20);

        cityLable = new JLabel("City");
        cityLable.setBounds(50,130,150,20);
        //Get City From DataBase
        city = new JLabel("Galway");
        city.setBounds(150,130,200,20);

        phoneNumberLable = new JLabel("Phone Number");
        phoneNumberLable.setBounds(50,150,150,20);
        //Get Phone Number From DataBase
        phoneNumber = new JLabel("087 430 7730");
        phoneNumber.setBounds(150,150,200,20);

        dateOfBirthLable = new JLabel("Date of Birth");
        dateOfBirthLable.setBounds(50,170,150,20);
        dateOfBirth = new JLabel("April 5th");
        dateOfBirth.setBounds(150,170,200,20);

        eircodeLable = new JLabel("Eir Code");
        eircodeLable.setBounds(50,190,150,20);
        eircode = new JLabel("HN81 HHH");
        eircode.setBounds(150,190,200,20);

        editContact = new JButton("Edit Contact");
        editContact.setBounds(0,220,200,50);
        editContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditWindow editWindow = new EditWindow();
                f.dispose();
            }
        });


        deleteContact = new JButton("Delete Contact");
        deleteContact.setBounds( 200,220,200,50);
        deleteContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: Call the Delete contact from Database Function Here
            }
        });

        backToContactBook = new JButton("Contact Book");
        backToContactBook.setBounds( 100,270,200,50);
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
        f.add(editContact);
        f.add(deleteContact);
        f.add(backToContactBook);

        f.setSize(415,370);
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
        new SearchWindow();
    }
}