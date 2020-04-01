import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JPanel jMaster;
    private JLabel jLabelOuput;
    private JButton JbnButtons[];

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - 600) / 2);
        int y = (int) ((dimension.getHeight() - 440) / 2);
        setBounds(x, y, 600, 440);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setResizable(false);
        jMaster = new JPanel();
        jLabelOuput = new JLabel("", SwingConstants.CENTER);

        getContentPane().add(jLabelOuput, BorderLayout.NORTH);

        JbnButtons = new JButton[20];
        String fName = "/fonts/saxmono.ttf";
        InputStream is = Main.class.getResourceAsStream(fName);
        Font font = new Font ("saxmono", Font.PLAIN, 36);

        for (int i = 0; i <= 15; i++) {
            if (i == 10) {
                JbnButtons[i] = new JButton("=");
            } else if (i == 11)
                JbnButtons[i] = new JButton("+");
            else if (i == 12)
                JbnButtons[i] = new JButton("-");
            else if (i == 13)
                JbnButtons[i] = new JButton("/");
            else if (i == 14)
                JbnButtons[i] = new JButton("*");
            else if (i == 15)
                JbnButtons[i] = new JButton("AC");
            else
                JbnButtons[i] = new JButton(String.valueOf(i));

            JbnButtons[i].setPreferredSize(new Dimension(40, 80));
            JbnButtons[i].setFont(font);


        }


        JPanel jPLButtons = new JPanel();
        jPLButtons.setLayout(new GridLayout(4, 5, 2, 2));

        for (int i = 0; i <= 15; i++) {
            jPLButtons.add(JbnButtons[i]);
        }

        jMaster.setLayout(new BorderLayout());
        jMaster.add(jPLButtons, BorderLayout.SOUTH);

        getContentPane().add(jMaster, BorderLayout.SOUTH);
        requestFocus();

        for (int i = 0; i <= 15; i++) {
            JbnButtons[i].addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("=")) {

            jLabelOuput.setText(findTheResultOf(jLabelOuput.getText()) + "");

        } else if (((JButton) e.getSource()).getText().equals("AC")) {

            jLabelOuput.setText("");

        } else {
            JButton jButton = (JButton) e.getSource();

            String buttonText = jButton.getText();
            jLabelOuput.setText(jLabelOuput.getText() + buttonText);
            Font font = new Font ("saxmono", Font.PLAIN, 28);
            jLabelOuput.setFont(font);
        }
    }

    private int findTheResultOf(String operation) {
        int firstNumber, secondNumber, result = 0;
        if (operation.contains("+")) {
            firstNumber = Integer.parseInt(operation.split("\\+")[0]);
            secondNumber = Integer.parseInt(operation.split("\\+")[1]);
            result = firstNumber + secondNumber;
        }
        else  if (operation.contains("-")) {
            firstNumber = Integer.parseInt(operation.split("-")[0]);
            secondNumber = Integer.parseInt(operation.split("-")[1]);
            result = firstNumber - secondNumber;
        }
        else  if (operation.contains("*")) {
            firstNumber = Integer.parseInt(operation.split("\\*")[0]);
            secondNumber = Integer.parseInt(operation.split("\\*")[1]);
            result = firstNumber * secondNumber;
        }
        else  if (operation.contains("/")) {
            firstNumber = Integer.parseInt(operation.split("/")[0]);
            secondNumber = Integer.parseInt(operation.split("/")[1]);
            result = firstNumber / secondNumber;
        }
        return result;
    }

}