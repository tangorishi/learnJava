import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DigitalClock is a simple Swing application that displays a visually appealing digital clock in a 12-hour format with AM/PM.
 */
public class DigitalClock extends JFrame {
    private final JLabel clockLabel;

    public DigitalClock() {
        // Set up the JFrame
        setTitle("Digital Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));

        // Create clock label with custom styling
        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Digital", Font.PLAIN, 48));
        clockLabel.setForeground(Color.BLUE);
        add(clockLabel);

        // Use a timer to update the clock every second
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        updateClock(); // Initial clock update
    }

    /**
     * Updates the clock's display with the current time in 12-hour format with AM/PM.
     */
    private void updateClock() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        String time = dateFormat.format(new Date());
        clockLabel.setText(time);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalClock clock = new DigitalClock();
            clock.setVisible(true);
        });
    }
}
