package javaapplicationwindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Point;
import net.proteanit.sql.DbUtils;


public class AdressBookWindow extends JComponent implements ActionListener {
    JFrame master;
    
    JLabel head,l1,l2,l3,l4,l5,l6;
     JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2,b3,b4,b5,b6;
    static final String USER = "root";
 static final String PASS = "123456";
 Connection conn=null;
 Statement stmt=null;
 ResultSet rs=null;
 PreparedStatement ps=null,sp=null;
 JTable table1;
 JScrollPane pane;
 JPanel p1;
 
    public void init()
    {
        
        master=new JFrame();
        String col[]={"Name","Phone number","Email","Address"};
        String [][]row={};
        
        table1=new JTable(row,col);
        p1=new JPanel();
        pane=new JScrollPane(table1);
        l5=new JLabel("Search Contact");
        head=new JLabel("Enter The Following Details");
        l1=new JLabel("Name:");
        l2=new JLabel("Phone No.:");
        l3=new JLabel("Email:");
        l4=new JLabel("Address:");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        b3=new JButton("Reset");
        b2=new JButton("Add");
        ImageIcon img3 = new ImageIcon("C:\\Users\\Dell\\Downloads\\contacts-xxl.png");
        b1=new JButton(img3);
        b4=new JButton("Search");
        b5=new JButton("Delete");
        l6=new JLabel("Delete Contact");
        b6=new JButton("View Book");
        
    }
    public void properties()
    {
        
       
         Border border = BorderFactory.createLineBorder(Color.BLACK,15);
        master.setTitle("****AdressBook Window****");
        master.setVisible(true);
        master.setSize(1300, 700);
       
       master.add(p1);
       
        p1.setBorder(border);
        p1.setLayout(null);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        
           }
    public void positioning()
    {
        //table1.setBounds(550, 30, 900, 600);
        p1.setBounds(0, 0,900 , 900);
        b1.setBackground(Color.BLACK);
        b1.setBounds(275, 30, 230, 230);
        b2.setBounds(60, 560, 110, 50);
        b3.setBounds(180, 560, 110, 50);
        b6.setBounds(300, 560, 110, 50);
        head.setBounds(80, 270, 500,50);
        l1.setBounds(40, 320, 300,40);
        t1.setBounds(220, 320, 200, 40);
        l2.setBounds(40, 380, 300,40);
        t2.setBounds(220, 380, 200,40);
        l3.setBounds(40, 440, 300,40);
        t3.setBounds(220, 440, 200,40);
        l4.setBounds(40, 500, 300,40);
        t4.setBounds(220, 500, 200,40);
        l5.setBounds(560, 270, 300, 50);
        t5.setBounds(500, 330, 300,40);
        b4.setBounds(570, 390, 135, 50);
        l6.setBounds(565, 480, 300, 50);
         t6.setBounds(500, 530, 300,40);
         b5.setBounds(570, 590 ,135, 50);
    }
    public void formatting()
    {
        b5.setFont(new Font("Verdana",Font.BOLD,10));
     b2.setFont(new Font("Verdana",Font.BOLD,10));
     b6.setFont(new Font("Verdana",Font.BOLD,10));
     b3.setFont(new Font("Verdana",Font.BOLD,10));
     b4.setFont(new Font("Verdana",Font.BOLD,10));
     //b5.setFont(new Font("Verdana",Font.BOLD,10));
     head.setFont(new Font("Playbill",Font.BOLD,35));
    head.setForeground(Color.ORANGE);
    l5.setFont(new Font("Playbill",Font.BOLD,35));
    l6.setFont(new Font("Playbill",Font.BOLD,35));
    l6.setForeground(Color.ORANGE);
    l5.setForeground(Color.ORANGE);
    l1.setFont(new Font("Ravie",Font.BOLD,20));
    l2.setFont(new Font("Ravie",Font.BOLD,20));
    l3.setFont(new Font("Ravie",Font.BOLD,20));
    l4.setFont(new Font("Ravie",Font.BOLD,20));
    t1.setFont(new Font("Ravie",Font.BOLD,15));
    t2.setFont(new Font("Ravie",Font.BOLD,15));
    t3.setFont(new Font("Ravie",Font.BOLD,15));
    t4.setFont(new Font("Ravie",Font.BOLD,15));
    t5.setFont(new Font("Ravie",Font.BOLD,15));
    t6.setFont(new Font("Ravie",Font.BOLD,15));
    p1.setBackground(Color.GRAY);
    
     
    }
    public void add()
    {
        p1.add(b1);
        p1.add(b2);
        p1.add(l1);
    p1.add(head);
    p1.add(l2);
    p1.add(l3);
    p1.add(l4);
    p1.add(t1);
    p1.add(t2);
    p1.add(t3);
    p1.add(t4);    
    p1.add(b3);
    p1.add(l5);
    p1.add(t5);
    p1.add(b4);
    p1.add(l6);
    p1.add(t6);
    p1.add(b5);
    p1.add(b6);
    pane.getViewport().setViewPosition(new Point(500,500));
    master.add(pane,BorderLayout.EAST);
    }
    
    
        public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b6)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rishabh",USER,PASS);
            stmt = conn.createStatement();
            sp=conn.prepareStatement("SELECT * FROM contacts");
            rs=sp.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
    }
         catch (Exception ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }
    }
    if(e.getSource()==b2)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rishabh",USER,PASS);
            stmt = conn.createStatement();
            String sql="INSERT INTO contacts(Name,Phone_no,Email,Adress) VALUES(?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,t1.getText());
            ps.setString(2,t2.getText());
            ps.setString(3,t3.getText());
            ps.setString(4,t4.getText());
            ps.execute();
           
            conn.close();
            JOptionPane.showMessageDialog(null,"Saved");
             
        }
         catch (Exception ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }}
    if(e.getSource()==b4)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rishabh",USER,PASS);
            stmt = conn.createStatement();
            String sql="SELECT * FROM contacts WHERE Name=?"; 
                        ps=conn.prepareStatement(sql);
                                    ps.setString(1,t5.getText());
                                rs=ps.executeQuery();
                                table1.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
                                    


        }
         catch (Exception ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }}
    if(e.getSource()==b5)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rishabh",USER,PASS);
            stmt = conn.createStatement();
            String sql="DELETE FROM contacts WHERE Name=?"; 
                        ps=conn.prepareStatement(sql);
                                    ps.setString(1,t6.getText());
                                
                                rs.getInt(ps.executeUpdate());
                                
                               // table1.setModel(DbUtils.resultSetToTableModel(rs));
                                     conn.close();
                                JOptionPane.showMessageDialog(null, "Deleted Contact Successfully");
            
                                    


        }
         catch (Exception ae)
        {
           JOptionPane.showMessageDialog(null,"Deleted Contact Successfully");
        }}
        
    
         if(e.getSource()==b3)
         {
             t1.setText(null);
             t2.setText(null);
             t3.setText(null);
             t4.setText(null);
         }}
   
        
    

    
    public  void callAdressBookWindow()
    {
        AdressBookWindow obj=new AdressBookWindow();
        obj.init();
        obj.properties();
        obj.positioning();
        obj.formatting();
        obj.add();
    }
}

