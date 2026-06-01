package EmployeeMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        setTitle("HOME");
        //setUndecorated(true);
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(new Color(125,50,250));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(125,50,250));
        setContentPane(contentPane);        
        setLayout(null);
        
       
        JLabel heading = new JLabel("<html> Employee <br> Management <br> System </html>");
        heading.setBounds(70, 0, 800, 600);
        heading.setFont(new Font("Raleway", Font.BOLD, 100));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        add = new JButton("ADD EMPLOYEE");
        add.setBounds(900, 160, 320, 55);
        add.setForeground(new Color(120,45,240));
        add.setBackground(Color.WHITE);
        add.setFont(new Font("Sans-serif", Font.BOLD, 20));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add.addActionListener(this);
        add(add);
        
        view = new JButton("VIEW EMPLOYEES");
        view.setBounds(900, 260, 320, 55);
        view.setForeground(new Color(120,45,240));
        view.setBackground(Color.WHITE);
        view.setFont(new Font("Sans-serif", Font.BOLD, 20));
        view.setCursor(new Cursor(Cursor.HAND_CURSOR));
        view.addActionListener(this);
        add(view);
        
        update = new JButton("UPDATE EMPLOYEE");
        update.setBounds(900, 360, 320, 55);
        update.setForeground(new Color(120,45,240));
        update.setBackground(Color.WHITE);
        update.setFont(new Font("Sans-serif", Font.BOLD, 20));
        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
        update.addActionListener(this);
        add(update);
        
        remove = new JButton("REMOVE EMPLOYEE");
        remove.setBounds(900, 460, 320, 55);
        remove.setForeground(new Color(120,45,240));
        remove.setBackground(Color.WHITE);
        remove.setFont(new Font("Sans-serif", Font.BOLD, 20));
        remove.setCursor(new Cursor(Cursor.HAND_CURSOR));
        remove.addActionListener(this);
        add(remove);
        
        setSize(1120, 630);
        //setLocation(100, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}

