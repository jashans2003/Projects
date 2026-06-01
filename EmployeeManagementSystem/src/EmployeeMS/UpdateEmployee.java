package EmployeeMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    
    JTextField tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JLabel lblempId;
    JButton update, back;
    String empId;
    
    UpdateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(new Color(0xDDD0C8));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());
        
        JLabel heading = new JLabel("Update Employee Details");
        heading.setBounds(115, 25, 1200, 150);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 90));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(170, 225, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(new Color(0x323232));
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(320, 225, 150, 30);
        add(lblname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(750, 225, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        labelfname.setForeground(new Color(0x323232));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(920,225, 150, 30);
        add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(170, 275, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        labeldob.setForeground(new Color(0x323232));
        add(labeldob);
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(320,275, 150, 30);
        add(lbldob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(750, 275, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        labelsalary.setForeground(new Color(0x323232));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(920, 275, 150, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(170, 325, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        labeladdress.setForeground(new Color(0x323232));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(320, 325, 150, 30);
        add(tfaddress);
        
          
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(750, 325, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        labelphone.setForeground(new Color(0x323232));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(920, 325, 150, 30);
        add(tfphone);

       JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(170, 375, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        labelemail.setForeground(new Color(0x323232));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(320, 375, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(750, 375, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        labeleducation.setForeground(new Color(0x323232));
        add(labeleducation);
        
        tfeducation = new JTextField();
        tfeducation.setBounds(920,375, 150, 30);
        add(tfeducation);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(170, 425, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        labeldesignation.setForeground(new Color(0x323232));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(320, 425, 150, 30);
        add(tfdesignation);

        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(750, 425, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        labelaadhar.setForeground(new Color(0x323232));
        add(labelaadhar);
        
        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(920,425, 150, 30);
        add(lblaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(170, 550, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 24));
        labelempId.setForeground(new Color(0x323232));
        add(labelempId);
        
        lblempId = new JLabel();
        lblempId.setBounds(335, 550, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 24));
        lblempId.setForeground(new Color(0x323232));
        add(lblempId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        update = new JButton("Update Details");
        update.setBounds(700, 550, 250, 40);
        update.addActionListener(this);
        update.setBackground(new Color(0x323232));
        update.setForeground(new Color(0xDDD0c8));
        update.setFont(new Font("sans-sarif", Font.BOLD,26));
        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(update);
        
        back = new JButton("Back");
        back.setBounds(1000, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(new Color(0x323232));
        back.setForeground(new Color(0xDDD0c8));
        back.setFont(new Font("sans-sarif", Font.BOLD,26));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(back); 
        
        setSize(900, 650);
        //setLocation(250, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == update) {
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
        new UpdateEmployee("");
    }
}
