
package ac.za.cput;

import javax.swing.JFrame;

/**
 *
 * @author Lehlohonolo Motsoeneng
 */
public class RunReservation {

    public static void main(String[] args) {
        ReservationGUI reservationGUI = new ReservationGUI();
        reservationGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reservationGUI.setSize(800, 400);
    }
    
}
