import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

/**
 * TemperatureConverter is a basic Swing application to convert temperatures between Celsius and Fahrenheit.
 */
public class TemperatureConverter extends JFrame {

    private final JTextField celsiusField;
    private final JTextField fahrenheitField;

    public TemperatureConverter() {
        // Set up the JFrame
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create Celsius label and input field
        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusField = new JTextField(10);
        celsiusField.setToolTipText("Enter temperature in Celsius");
        add(celsiusLabel);
        add(celsiusField);

        // Create Fahrenheit label and input field
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitField = new JTextField(10);
        fahrenheitField.setToolTipText("Enter temperature in Fahrenheit");
        add(fahrenheitLabel);
        add(fahrenheitField);

        // Create convert button
        JButton convertButton = new JButton("Convert");
        add(convertButton);

        // Add ActionListener to the convert button
        convertButton.addActionListener(e -> convertTemperature());

        // Add DocumentFilter to allow only numeric input
        ((AbstractDocument) celsiusField.getDocument()).setDocumentFilter(new NumericInputFilter());
        ((AbstractDocument) fahrenheitField.getDocument()).setDocumentFilter(new NumericInputFilter());

        // Add KeyListeners to clear the opposite input field when a value is changed
        celsiusField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                fahrenheitField.setText("");
            }
        });

        fahrenheitField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                celsiusField.setText("");
            }
        });

        pack();
        setLocationRelativeTo(null); // Center the JFrame
    }

    /**
     * Converts the temperature between Celsius and Fahrenheit and updates the input fields.
     */
    private void convertTemperature() {
        try {
            if (!celsiusField.getText().isEmpty()) {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                DecimalFormat df = new DecimalFormat("#.##");
                fahrenheitField.setText(df.format(fahrenheit));
            } else if (!fahrenheitField.getText().isEmpty()) {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                DecimalFormat df = new DecimalFormat("#.##");
                celsiusField.setText(df.format(celsius));
            }
        } catch (NumberFormatException ex) {
            celsiusField.setText("");
            fahrenheitField.setText("");
        }
    }

    /**
     * DocumentFilter to allow only numeric input.
     */
    private static class NumericInputFilter extends DocumentFilter {
        String regex = "[-+]?[0-9]*\\.?[0-9]*";
        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if (text.matches(regex)) {
                super.insertString(fb, offset, text, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text.matches(regex)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverter converter = new TemperatureConverter();
            converter.setVisible(true);
        });
    }
}
