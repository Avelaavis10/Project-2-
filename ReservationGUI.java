
package ac.za.cput;
//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;
//
///**
// *
// * @author Lehlohonolo Motsoeneng
// */
//public class ReservationGUI extends JFrame implements ActionListener{

import javax.swing.*;
import java.awt.*;

public class ReservationGUI extends JFrame {

    public ReservationGUI() {
        setTitle("Reserve Book Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Top panel with logo and search bar
        JPanel topPanel = new JPanel();
        JLabel logoLabel = new JLabel("vaasel");
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("SEARCH");
        JButton homeButton = new JButton("\u2302"); // Home icon
        JButton menuButton = new JButton("\u2261"); // Menu icon
        topPanel.add(logoLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(homeButton);
        topPanel.add(menuButton);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        mainPanel.add(topPanel, gbc);
        this.add(topPanel, BorderLayout.NORTH);

        // User information panel
        JPanel userPanel = new JPanel(new GridLayout(2, 2));
        JLabel userLabel = new JLabel("Ahluma Nkqayi");
        JLabel userIdLabel = new JLabel("User ID:");
        JLabel userIdValue = new JLabel("03977834");
        userPanel.add(userLabel);
        userPanel.add(userIdLabel);
        userPanel.add(new JLabel()); // Empty label for spacing
        userPanel.add(userIdValue);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(userPanel, gbc);
        this.add(userPanel, BorderLayout.WEST);

        // Book information panel
        JPanel bookPanel = new JPanel(new GridLayout(3, 2));
        JLabel bookLabel = new JLabel("Book Reserved:");
        JLabel bookValue = new JLabel("Troubled Daughters Twisted Wives");
        JLabel availabilityLabel = new JLabel("In Stock Availability Date:");
        JLabel availabilityValue = new JLabel("05/26/2024");
        JLabel reservationLabel = new JLabel("Reservation Date:");
        JTextField reservationField = new JTextField("5/13/2024");
        bookPanel.add(bookLabel);
        bookPanel.add(bookValue);
        bookPanel.add(availabilityLabel);
        bookPanel.add(availabilityValue);
        bookPanel.add(reservationLabel);
        bookPanel.add(reservationField);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(bookPanel, gbc);
        this.add(bookPanel, BorderLayout.WEST);
        
        

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        JButton cancelButton = new JButton("Cancel Reservation");
        JButton submitButton = new JButton("Submit Reservation");
        buttonPanel.add(cancelButton);
        buttonPanel.add(submitButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(buttonPanel, gbc);
        this.add(buttonPanel, BorderLayout.EAST);
        

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

//    public static void main(String[] args) {
//        new ReserveBookPage();
}


   