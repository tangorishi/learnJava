import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * This class implements a simple calculator using Swing components.
 */

public class SwingCalculator {

    private JTextField mathInput; // Input text field for mathematical expression
    private JTextField resultDisplay; // Text field to display the result

    private double firstOperand = 0; // The first operand for calculations
    private String operator = ""; // The operator (+, -, *, /)
    private boolean startNewCalculation = true; // Flag to start a new calculation

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingCalculator().createAndShowGUI());
    }

    /**
     * Create and display the Swing-based calculator GUI.
     */
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Swing Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        mathInput = new JTextField();
        mathInput.setEditable(true);
        mathInput.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(mathInput, BorderLayout.NORTH);

        resultDisplay = new JTextField();
        resultDisplay.setEditable(false);
        resultDisplay.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(resultDisplay, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = makeButton(label);
            buttonPanel.add(button);
        }
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    /**
     * Create a JButton with the given label and ActionListener.
     *
     * @param label The label to display on the button.
     * @return The created JButton.
     */
    private JButton makeButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = button.getText();

                if (buttonText.matches("[0-9]")) {
                    if (startNewCalculation) {
                        mathInput.setText("");
                        startNewCalculation = false;
                    }
                    mathInput.setText(mathInput.getText() + buttonText);
                } else if (buttonText.matches("[+\\-*/]")) {
                    if (!operator.isEmpty()) {
                        calculate();
                    }
                    operator = buttonText;
                    firstOperand = Double.parseDouble(mathInput.getText());
                    startNewCalculation = true;
                } else if (buttonText.equals("=")) {
                    calculate();
                    operator = "";
                } else if (buttonText.equals("C")) {
                    mathInput.setText("");
                    resultDisplay.setText("");
                    firstOperand = 0;
                    operator = "";
                }
            }

            /**
             * Perform the calculation based on the stored operator and operands.
             */
            private void calculate() {
                double secondOperand = Double.parseDouble(mathInput.getText());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand != 0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resultDisplay.setText("Error");
                        }
                        break;
                }
                resultDisplay.setText(String.valueOf(result));
                startNewCalculation = true;
            }
        });

        return button;
    }
}
