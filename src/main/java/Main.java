import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JMenu jMenuFile, jMenuHelp;
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


    /**
     * Create the frame.
     */
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        // MEnu File
        jMenuFile = new JMenu("File");


        // MEnu Help
        jMenuHelp = new JMenu("Help");


        // Menu Bar
        JMenuBar mb = new JMenuBar();
        mb.add(jMenuFile);
        mb.add(jMenuHelp);
        setJMenuBar(mb);


        // frame componant
        jMaster = new JPanel();
        jLabelOuput = new JLabel("");

        // add our componante to fram
        getContentPane().add(jLabelOuput, BorderLayout.NORTH);

        JbnButtons = new JButton[20];

        for (int i = 0; i <= 14; i++) {
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
            else
                JbnButtons[i] = new JButton(String.valueOf(i));
        }


        JPanel jPLButtons = new JPanel();
        jPLButtons.setLayout(new GridLayout(4, 5, 2, 2));

        // add button to the jplbuttons
        for (int i = 0; i <= 14; i++) {
            jPLButtons.add(JbnButtons[i]);
        }

        // JPANEL MASET
        jMaster.setLayout(new BorderLayout());
        jMaster.add(jPLButtons, BorderLayout.SOUTH);


        // add componant to frame
        getContentPane().add(jMaster, BorderLayout.SOUTH);
        requestFocus();

        //add listenner to button
        for (int i = 0; i <= 14; i++) {
            JbnButtons[i].addActionListener(this);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("=")) {

            jLabelOuput.setText(findTheResultOf(jLabelOuput.getText()) + "");

        } else {
            JButton jButton = (JButton) e.getSource();

            String buttonText = jButton.getText();
            jLabelOuput.setText(jLabelOuput.getText() + buttonText);
        }
    }

    private int findTheResultOf(String operation) {
        //TODO:
        return 0;
    }

}