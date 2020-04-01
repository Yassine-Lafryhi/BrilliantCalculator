import java.awt.*;
import javax.swing.*;

public class Bag {
    private JFrame CalculatorFrame;
    private JPanel CalculatorPanel;

    public static void main(String[] args) {
        Bag swingLayoutDemo = new Bag();
        //swingLayoutDemo.showBasicCalculatorLayout();
        swingLayoutDemo.showScientificCalculatorLayout();
        //swingLayoutDemo.showProgrammerCalculatorLayout();
    }



    private void showBasicCalculatorLayout() {
        CalculatorFrame = new JFrame("Basic Calculator");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - 640) / 2);
        int y = (int) ((dimension.getHeight() - 520) / 2);
        CalculatorFrame.setBounds(x, y, 640, 520);
        CalculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //CalculatorFrame.setResizable(false);
        CalculatorPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        CalculatorPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Font font = new Font("saxmono", Font.PLAIN, 36);
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        String[] buttonsContent = {"7", "8", "9", "AC", "4", "5", "6", "+", "1", "2", "3", "-", "0", "*", "/", "="};


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        JLabel result = new JLabel("0", SwingConstants.CENTER);
        result.setFont(font);
        result.setPreferredSize(new Dimension(560, 80));
        CalculatorPanel.add(result, gridBagConstraints);

        int gridy = 1;
        int gridx = 0;
        for (int i = 0; i < 16; i += 1) {

            gridBagConstraints.gridx = gridx;
            gridBagConstraints.gridy = gridy;
            gridBagConstraints.gridwidth = 1;
            JButton button = new JButton(buttonsContent[i]);
            button.setFont(font);
            button.setPreferredSize(new Dimension(140, 80));
            CalculatorPanel.add(button, gridBagConstraints);
            if ((i + 1) % 4 == 0) {
                gridy++;
                gridx = 0;
            } else
                gridx += 1;
        }



/*

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton two = new JButton("2");
        two.setFont(font);
        two.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(two,gridBagConstraints);



        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton three = new JButton("3");
        three.setFont(font);
        three.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(three,gridBagConstraints);


        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton four = new JButton("4");
        four.setFont(font);
        four.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(four,gridBagConstraints);





        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton four = new JButton("4");
        four.setFont(font);
        four.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(four,gridBagConstraints);




        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton four = new JButton("4");
        four.setFont(font);
        four.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(four,gridBagConstraints);







        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton four = new JButton("4");
        four.setFont(font);
        four.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(four,gridBagConstraints);








        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton four = new JButton("4");
        four.setFont(font);
        four.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(four,gridBagConstraints);








        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        JButton four = new JButton("4");
        four.setFont(font);
        four.setPreferredSize(new Dimension(140, 80));
        CalculatorPanel.add(four,gridBagConstraints);

*/

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
                "7", "8", "9", "AC", "4", "5",
                "6", "+", "1", "2", "3", "-",
                "0", "*", "/", "=","cos","sin",
                "tan","e","ln","abs","x!","sinh",
                "cosh","tanh","1/x","rad","deg","rand",
                "%",".","x^2","x^3","pi","phi",
                "e^x","^","log","arcsin","arccos","arctan",

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
                "0", "*", "/", "=","tobin","todec",
                "tohex","and","or","not","xor","nor",
                "nand","tanh",">>","<<","1's","2's",
                "x<<y","y<<x","A","B","C","D",
                "E","F","00","FF","RoR","RolL",

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


    


}