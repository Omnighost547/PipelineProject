import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchWindow {

    private JFrame jFrame;
    private JPanel jPanel;
    private Button editContact;
    private Button deleteContact;
    private Button backToMain;

    //Constructor
    public SearchWindow()
    {
        SearchWindowGUI();
    }

    public void SearchWindowGUI()
    {
        jFrame = new JFrame("Search Window");
        jFrame.setVisible(true);

        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel = new JPanel();
        jPanel.setBackground(Color.GREEN);

        editContact = new Button("Back To Contact Book");
        editContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AddWindow addWindow = new AddWindow();
                addWindow.AddWindowGUI();
            }
        });


        deleteContact = new Button("Delete Contact");
        deleteContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Delete Contact From Database//
            }
        });


        backToMain = new Button("Back To Contact Book");
        backToMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchWindow searchWindow = new SearchWindow();
                searchWindow.SearchWindowGUI();
            }
        });

        jPanel.add(editContact);
        jPanel.add(deleteContact);
        jFrame.add(jPanel);
    }

    public static void main(String[] args) {
        new SearchWindow();
    }

}
