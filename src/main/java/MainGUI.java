import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    private JFrame jFrame;
    private JPanel jPanel;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField address;
    private JTextField city;
    private JTextField phoneNumber;
    private JTextField dateOfBirth;

    private JLabel nameLable;
    private JLabel lastLable;
    private JLabel addressLable;
    private JLabel cityLable;
    private JLabel phoneLable;
    private JLabel DOBLable;

    private Button addContact;
    private Button searchContact;

    //Constructor//
    public MainGUI(){
        GUI();
    }

    public void GUI()
    {
        jFrame = new JFrame("Add Window");
        jFrame.setVisible(true);

        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel = new JPanel();
        jPanel.setBackground(Color.GREEN);

        nameLable = new JLabel("First Name");
        firstName = new JTextField("");

        lastLable = new JLabel("Last Name");
        lastName = new JTextField("");

        addressLable = new JLabel("Address");
        address = new JTextField("");

        cityLable = new JLabel("City");
        city = new JTextField("");

        phoneLable = new JLabel("Phone Number");
        phoneNumber = new JTextField("");

        DOBLable = new JLabel("Date of Birth");
        dateOfBirth = new JTextField("");

        addContact = new Button("Add to Contact");

        searchContact = new Button("Back To Contact Book");
        searchContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchWindow searchWindow = new SearchWindow();
                searchWindow.SearchWindowGUI();
            }
        });

        jPanel.add(nameLable);
        jPanel.add(firstName);

        jPanel.add(lastLable);
        jPanel.add(lastName);

        jPanel.add(addressLable);
        jPanel.add(address);

        jPanel.add(cityLable);
        jPanel.add(city);

        jPanel.add(phoneLable);
        jPanel.add(phoneNumber);

        jPanel.add(DOBLable);
        jPanel.add(dateOfBirth);

        jPanel.add(addContact);
        jPanel.add(searchContact);

        jFrame.add(jPanel);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
