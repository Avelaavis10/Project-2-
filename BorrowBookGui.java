package borrowbookgui;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowBookGui extends JFrame {

    // Step 1 - component declarations 
    private JPanel pnlCenter, pnlCenterLeft, pnlCenterRight;
    private JLabel lblName, lblBooksInStock, lblIssueDate, lblReturnDate, lblBookCover;
    private JTextField txtIssueDate, txtReturnDate;
    private JButton btnBorrow, btnReservation;

    public BorrowBookGui() {
        // Set custom icon for the JFrame
        ImageIcon icon = createImageIcon("/images/icon.png");
        if (icon != null) {
            setIconImage(icon.getImage());
        } else {
            System.err.println("Icon image not found or cannot be loaded.");
        }

        // Step 3 initialize panels 
        pnlCenter = new JPanel();
        pnlCenterLeft = new JPanel();
        pnlCenterRight = new JPanel();

        // Initialize labels
        lblName = new JLabel("Ahluma Nkqayi");
        lblBooksInStock = new JLabel("No. of Books available in stock: 7/10");
        lblIssueDate = new JLabel("Issue Date:");
        lblReturnDate = new JLabel("Return Date:");

        lblBookCover = new JLabel();
        ImageIcon bookCoverIcon = createImageIcon("/images/bookcover.png"); // Assuming the book cover image is named bookcover.png and stored in the images folder
        if (bookCoverIcon != null) {
            lblBookCover.setIcon(bookCoverIcon);
        } else {
            System.err.println("Book cover image not found or cannot be loaded.");
        }

        // Initialize text fields
        txtIssueDate = new JTextField(10);
        txtReturnDate = new JTextField(10);

        // Set default dates in the text fields
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        txtIssueDate.setText(sdf.format(new Date()));
        txtReturnDate.setText(sdf.format(new Date()));

        // Initialize buttons
        btnBorrow = new JButton("Confirm Borrow");
        btnReservation = new JButton("Reservation");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);

        setBorrowBookGUI();

        // Add pnlCenter to the JFrame
        add(pnlCenter, BorderLayout.CENTER);

        setVisible(true);
    }

    private ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public void setBorrowBookGUI() {
        // Set layout for panels
        pnlCenter.setLayout(new BorderLayout()); // Center panel with BorderLayout
        pnlCenterLeft.setLayout(new GridLayout(6, 1, 10, 10)); // Left center panel with 6 rows
        pnlCenterRight.setLayout(new BorderLayout()); // Right center panel with BorderLayout

        // Set background colors
        Color lightGrey = new Color(211, 211, 211); // Light grey color
        pnlCenter.setBackground(lightGrey);
        pnlCenterLeft.setBackground(lightGrey);
        pnlCenterRight.setBackground(lightGrey);

        // Set border for separation
        pnlCenterRight.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.GRAY)); // Left border for right panel

        // Add components to the left center panel
        pnlCenterLeft.add(lblName);
        pnlCenterLeft.add(lblBooksInStock);
        pnlCenterLeft.add(lblIssueDate);
        pnlCenterLeft.add(txtIssueDate);
        pnlCenterLeft.add(lblReturnDate);
        pnlCenterLeft.add(txtReturnDate);

        // Add components to the right center panel
        pnlCenterRight.add(lblBookCover, BorderLayout.CENTER);

        JPanel pnlButtons = new JPanel(); // Panel to hold buttons
        pnlButtons.setLayout(new FlowLayout());
        pnlButtons.add(btnBorrow);
        pnlButtons.add(btnReservation);

        pnlCenterRight.add(pnlButtons, BorderLayout.SOUTH);

        // Add sub-panels to the center panel
        pnlCenter.add(pnlCenterLeft, BorderLayout.WEST);
        pnlCenter.add(pnlCenterRight, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BorrowBookGui());
    }
}
