package EmployeeMS;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener{

    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;
    
    ViewEmployee() {
        getContentPane().setBackground(new Color(0xDDD0C8));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        ImageIcon logo = new ImageIcon("src/icons/logo2.png");
        setIconImage(logo.getImage());
        
        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(105, 37, 290, 40);
        searchlbl.setFont(new Font("sans-sarif", Font.BOLD, 25));
        add(searchlbl);
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(400, 50, 150, 40);
        add(cemployeeId);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while(rs.next()) {
                cemployeeId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1300, 600);
        jsp.setBackground(Color.WHITE);
        add(jsp);
        
        search = new JButton("Search");
        search.setBounds(620, 40, 100, 30);
        search.setBackground(new Color(0x323232));
        search.setForeground(new Color(0xDDD0c8));
        search.setFont(new Font("sans-sarif", Font.BOLD,17));
        search.setCursor(new Cursor(Cursor.HAND_CURSOR));
        search.addActionListener(this);
        add(search);
        
        print = new JButton("Print");
        print.setBounds(750, 40, 100, 30);
        print.setBackground(new Color(0x323232));
        print.setForeground(new Color(0xDDD0c8));
        print.setFont(new Font("sans-sarif", Font.BOLD,17));
        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(880, 40, 100, 30);
        update.setBackground(new Color(0x323232));
        update.setForeground(new Color(0xDDD0c8));
        update.setFont(new Font("sans-sarif", Font.BOLD,17));
        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBounds(1010, 40, 100, 30);
        back.setBackground(new Color(0x323232));
        back.setForeground(new Color(0xDDD0c8));
        back.setFont(new Font("sans-sarif", Font.BOLD,17));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(this);
        add(back);
        
        setSize(900, 600);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from employee where empId = '"+cemployeeId.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
            setVisible(false);
            new UpdateEmployee(cemployeeId.getSelectedItem());
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
