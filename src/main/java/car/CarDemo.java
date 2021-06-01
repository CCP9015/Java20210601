package car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton sendButton;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new CarDemo().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }

}
