package EmployeeMS;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox<String> cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(0xDDD0C8)); 
        setSize(900, 650);
        setLayout(null);

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());
        
        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(195, 25, 1200, 150);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 90));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(170, 225, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(new Color(0x323232));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(320, 225, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(750, 225, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        labelfname.setForeground(new Color(0x323232));
        add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(920, 225, 150, 30);
        add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(170, 275, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        labeldob.setForeground(new Color(0x323232));
        add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(320, 275, 150, 30);
        add(dcdob);
        
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
        
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox<String>(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(920, 375, 150, 30);
        cbeducation.setForeground(new Color(0x323232));
        add(cbeducation);
        
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
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(920, 425, 150, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(170, 550, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 24));
        labelempId.setForeground(new Color(0x323232));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(335, 550, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 24));
        lblempId.setForeground(new Color(0x323232));
        add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(700, 550, 200, 40);
        add.addActionListener(this);
        add.setBackground(new Color(0x323232));
        add.setForeground(new Color(0xDDD0c8));
        add.setFont(new Font("sans-sarif", Font.BOLD,26));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(add);
        
        back = new JButton("Back");
        back.setBounds(950, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(new Color(0x323232));
        back.setForeground(new Color(0xDDD0c8));
        back.setFont(new Font("sans-sarif", Font.BOLD,26));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(back);      
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
        new AddEmployee();
    }
}

