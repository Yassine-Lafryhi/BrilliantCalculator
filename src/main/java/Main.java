import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main implements ActionListener {
    private JFrame CalculatorFrame;
    private JPanel CalculatorPanel;
    private JLabel operation, result;

    public static void main(String[] args) {
        Main main = new Main();
        //main.showBasicCalculatorLayout();
        main.showScientificCalculatorLayout();
        //main.showProgrammerCalculatorLayout();
    }


    private void showBasicCalculatorLayout() {
        CalculatorFrame = new JFrame("Basic Calculator");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - 760) / 2);
        int y = (int) ((dimension.getHeight() - 560) / 2);
        CalculatorFrame.setBounds(x, y, 760, 560);
        CalculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //CalculatorFrame.setResizable(false);
        CalculatorPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        CalculatorPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Font font = new Font("saxmono", Font.PLAIN, 36);
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        String[] buttonsContent = {"7", "8", "9", "AC", "Del", "4", "5", "6", "+", "(", "1", "2", "3", "-", ")", "0", "*", "/", ".", "="};


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        operation = new JLabel("", SwingConstants.LEFT);
        operation.setFont(font);
        operation.setPreferredSize(new Dimension(700, 80));
        CalculatorPanel.add(operation, gridBagConstraints);


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        result = new JLabel("", SwingConstants.RIGHT);
        result.setFont(font);
        result.setPreferredSize(new Dimension(700, 80));
        CalculatorPanel.add(result, gridBagConstraints);


        int gridy = 2;
        int gridx = 0;
        for (int i = 0; i < buttonsContent.length; i += 1) {

            gridBagConstraints.gridx = gridx;
            gridBagConstraints.gridy = gridy;
            gridBagConstraints.gridwidth = 1;
            JButton button = new JButton(buttonsContent[i]);
            button.addActionListener(this);
            button.setFont(font);
            button.setPreferredSize(new Dimension(140, 80));
            CalculatorPanel.add(button, gridBagConstraints);
            if ((i + 1) % 5 == 0) {
                gridy++;
                gridx = 0;
            } else
                gridx += 1;
        }

        CalculatorFrame.add(CalculatorPanel);
        CalculatorFrame.setVisible(true);
    }


    private void showScientificCalculatorLayout() {
        CalculatorFrame = new JFrame("Scientific Calculator");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - 900) / 2);
        int y = (int) ((dimension.getHeight() - 720) / 2);
        CalculatorFrame.setBounds(x, y, 900, 720);
        CalculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //CalculatorFrame.setResizable(false);
        CalculatorPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        CalculatorPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Font font = new Font("saxmono", Font.PLAIN, 36);
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        String[] buttonsContent = {
                "7", "8", "9", "AC", "4", "5","(",
                "6", "+", "1", "2", "3", "-",")",
                "0", "*", "/", "=", "cos", "sin","sqrt",
                "tan", "e", "ln", "abs", "x!", "sinh","cbrt",
                "cosh", "tanh", "1/x", "rad", "deg", "rand","A",
                "%", ".", "x^2", "x^3", "pi", "phi","B",
                "e^x", "^", "log", "arcsin", "arccos", "arctan","C"

        };


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        operation = new JLabel("", SwingConstants.LEFT);
        operation.setFont(font);
        operation.setPreferredSize(new Dimension(840, 80));
        CalculatorPanel.add(operation, gridBagConstraints);


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        result = new JLabel("", SwingConstants.RIGHT);
        result.setFont(font);
        result.setPreferredSize(new Dimension(840, 80));
        CalculatorPanel.add(result, gridBagConstraints);

        int gridy = 2;
        int gridx = 0;
        for (int i = 0; i < buttonsContent.length; i += 1) {

            gridBagConstraints.gridx = gridx;
            gridBagConstraints.gridy = gridy;
            gridBagConstraints.gridwidth = 1;
            JButton button = new JButton(buttonsContent[i]);
            button.addActionListener(this);
            button.setFont(font);
            button.setPreferredSize(new Dimension(140, 80));
            CalculatorPanel.add(button, gridBagConstraints);
            if ((i + 1) % 7 == 0) {
                gridy++;
                gridx = 0;
            } else
                gridx += 1;
        }


        CalculatorFrame.add(CalculatorPanel);
        CalculatorFrame.setVisible(true);
    }


    private void showProgrammerCalculatorLayout() {
        CalculatorFrame = new JFrame("Programmer Calculator");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - 900) / 2);
        int y = (int) ((dimension.getHeight() - 720) / 2);
        CalculatorFrame.setBounds(x, y, 900, 720);
        CalculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //CalculatorFrame.setResizable(false);
        CalculatorPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        CalculatorPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Font font = new Font("saxmono", Font.PLAIN, 36);
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        String[] buttonsContent = {
                "7", "8", "9", "AC", "4", "5",
                "6", "+", "1", "2", "3", "-",
                "0", "*", "/", "=", "tobin", "todec",
                "tohex", "and", "or", "not", "xor", "nor",
                "nand", "tanh", ">>", "<<", "1's", "2's",
                "x<<y", "y<<x", "A", "B", "C", "D",
                "E", "F", "00", "FF", "RoR", "RolL",

        };


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        JLabel result = new JLabel("0", SwingConstants.CENTER);
        result.setFont(font);
        result.setPreferredSize(new Dimension(560, 80));
        CalculatorPanel.add(result, gridBagConstraints);

        int gridy = 1;
        int gridx = 0;
        for (int i = 0; i < buttonsContent.length; i += 1) {

            gridBagConstraints.gridx = gridx;
            gridBagConstraints.gridy = gridy;
            gridBagConstraints.gridwidth = 1;
            JButton button = new JButton(buttonsContent[i]);
            button.setFont(font);
            button.setPreferredSize(new Dimension(140, 80));
            CalculatorPanel.add(button, gridBagConstraints);
            if ((i + 1) % 6 == 0) {
                gridy++;
                gridx = 0;
            } else
                gridx += 1;
        }


        CalculatorFrame.add(CalculatorPanel);
        CalculatorFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("=")) {
            if (!operation.getText().isEmpty()) {
                try {
                    result.setText(String.valueOf(Expression.evaluate(operation.getText())));
                }
                catch (Exception exception){
                    result.setText("Syntax Error");
                }
            } else {
                result.setText("Syntax Error");
            }
        } else if (((JButton) e.getSource()).getText().equals("AC")) {
            result.setText("");
            operation.setText("");
        } else if (((JButton) e.getSource()).getText().equals("Del")) {
            operation.setText((operation.getText() == null || operation.getText().length() == 0) ? operation.getText() : operation.getText().substring(0, operation.getText().length() - 1));
        }
        else {
            JButton jButton = (JButton) e.getSource();
            String buttonText = jButton.getText();

            /*if (buttonText.contains("+") || buttonText.contains("-") || buttonText.contains("*") || buttonText.contains("/")) {
                if (result.getText().split("\\+").length >= 2) {
                    result.setText(findTheResultOf(result.getText()) + "");
                } else if (result.getText().split("-").length >= 2) {
                    result.setText(findTheResultOf(result.getText()) + "");
                } else if (result.getText().split("\\*").length >= 2) {
                    result.setText(findTheResultOf(result.getText()) + "");
                } else if (result.getText().split("/").length >= 2) {
                    result.setText(findTheResultOf(result.getText()) + "");

                }
            }*/

            operation.setText(operation.getText() + buttonText);
            Font font = new Font("saxmono", Font.PLAIN, 28);
            result.setFont(font);
        }
    }

    /*private double findTheResultOf(String operation) {
        double firstNumber, secondNumber, result = 0;
        if (operation.contains("+")) {
            firstNumber = Long.parseLong(operation.split("\\+")[0]);
            secondNumber = Long.parseLong(operation.split("\\+")[1]);
            result = firstNumber + secondNumber;
        } else if (operation.contains("-")) {
            firstNumber = Long.parseLong(operation.split("-")[0]);
            secondNumber = Long.parseLong(operation.split("-")[1]);
            result = firstNumber - secondNumber;
        } else if (operation.contains("*")) {
            firstNumber = Long.parseLong(operation.split("\\*")[0]);
            secondNumber = Long.parseLong(operation.split("\\*")[1]);
            result = firstNumber * secondNumber;
        } else if (operation.contains("/")) {
            firstNumber = Long.parseLong(operation.split("/")[0]);
            secondNumber = Long.parseLong(operation.split("/")[1]);
            result = firstNumber / secondNumber;
        }
        return result;
    }*/

}