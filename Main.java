import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(121,153,195,354);


        JLabel label = new JLabel();
        label.setVisible(true);
        label.setText("Hello World!");
        frame.add(label);

    }

}