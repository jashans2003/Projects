package EmployeeMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword;
    
    Login() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(125,50,250));
        setLayout(null);
        setTitle("LOGIN");

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setForeground(Color.WHITE);
        lblusername.setBounds(450, 250, 100, 30);
        lblusername.setFont(new Font("Sans-serif", Font.BOLD, 18));
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(560, 250, 150, 27);
        tfusername.setBackground(new Color(117,45,240));
        tfusername.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setForeground(Color.WHITE);
        lblpassword.setBounds(450, 300, 100, 30);
        lblpassword.setFont(new Font("Sans-serif", Font.BOLD, 18));
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(560, 300, 150, 27);
        tfpassword.setBackground(new Color(117,45,240));
        tfpassword.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        login.setFont(new Font("Sans-serif", Font.BOLD, 22));
        login.setBounds(540, 400, 180, 45);
        login.setForeground(new Color(125,50,250));
        login.setBackground(Color.WHITE);
        login.addActionListener(this);
        add(login);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(740, 235, 220, 200);
        add(image);
        
        //setBounds(450, 200,600, 300); 
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}