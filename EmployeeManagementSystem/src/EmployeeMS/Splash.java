package EmployeeMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Employee Management System");
        setBounds(100, 40, 1300, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(125,50,250));
        setContentPane(contentPane);        
        setLayout(null);

        JLabel headingLabel = new JLabel("<html>EMPLOYEE <br> MANAGEMENT <br> SYSTEM</html>");
        headingLabel.setFont(new Font("Sans-serif", Font.BOLD, 90));
        headingLabel.setBounds(10, 10, getWidth() - 20, 370);
        headingLabel.setVerticalAlignment(JLabel.BOTTOM);
        headingLabel.setHorizontalAlignment(JLabel.LEFT);
        headingLabel.setForeground(Color.WHITE);
        add(headingLabel);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(getWidth() - 500, getHeight() - 80, 350, 50);
        clickhere.setBackground(Color.white);
        clickhere.setForeground(new Color(123, 50, 250));
        clickhere.addActionListener(this);
        clickhere.setFont(new Font("Dialog", Font.PLAIN, 20));
        clickhere.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(clickhere);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String args[]) {
        new Splash();
    }
}
