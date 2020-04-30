import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddWindow {

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

    private Button backToMain;

    //Constructor
    public AddWindow()
    {
        AddWindowGUI();
    }

    public void AddWindowGUI()
    {
        jFrame = new JFrame("Add Contact");
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

        backToMain = new Button("Back To Contact Book");
        backToMain.addActionListener(new ActionListener() {
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

        jPanel.add(backToMain);

        jFrame.add(jPanel);
    }

    public static void main(String[] args) {
        new AddWindow();
    }
}
