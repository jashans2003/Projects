package EmployeeMS;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener {
    
    Choice cEmpId;
    JButton delete, back;
    
    RemoveEmployee() {
        getContentPane().setBackground(new Color(0xDDD0C8));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());
        
        JLabel labelempId = new JLabel("Employee Id");
        labelempId.setBounds(100, 175, 200, 30);
        labelempId.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(labelempId);
        
        cEmpId = new Choice();
        cEmpId.setBounds(300, 180, 130, 50);
        add(cEmpId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                cEmpId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel heading = new JLabel("<html> Remove <br> Employee </html>");
        heading.setBounds(700, 55, 600, 500);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 110));
        add(heading);
        
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(100, 250, 100, 30);
        labelname.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(300, 250, 200, 30);
        lblname.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(lblname);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(100, 325, 100, 30);
        labelphone.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(300, 325, 200, 30);
        lblphone.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(lblphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(100, 400, 100, 30);
        labelemail.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(labelemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(300, 400, 300, 30);
        lblemail.setFont(new Font("sans-sarif", Font.BOLD, 24));
        add(lblemail);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "select * from employee where empId = '"+cEmpId.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) {
                        lblname.setText(rs.getString("name"));
                        lblphone.setText(rs.getString("phone"));
                        lblemail.setText(rs.getString("email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        delete = new JButton("Remove");
        delete.setBounds(120, 500, 150,40);
        delete.setFont(new Font("sans-sarif", Font.BOLD,26));
        delete.setBackground(new Color(0x323232));
        delete.setForeground(new Color(0xDDD0C8));
        delete.setCursor(new Cursor(Cursor.HAND_CURSOR));
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton("Back");
        back.setBounds(320, 500, 150,40);
        back.setFont(new Font("sans-sarif", Font.BOLD,26));
        back.setBackground(new Color(0x323232));
        back.setForeground(new Color(0xDDD0C8));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(this);
        add(back);
        
        setSize(600, 400);
        setLocation(125, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == delete) {
            try {
                Conn c = new Conn();
                String query = "delete from employee where empId = '"+cEmpId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Sucessfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}

