package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class AddNewContact implements ActionListener {
 static final String USER = "root";
 static final String PASS = "123456";
 Connection conn=null;
 Statement stmt=null;
 ResultSet rs=null;
 PreparedStatement ps=null;
 JFrame master;
 JPanel p1;
 JLabel head,l1,l2,l3,l4;
 JTextField t1,t2,t3,t4;
 JButton b1;
public void init()
{
 
 master=new JFrame();
 p1=new JPanel();
 head=new JLabel("Enter The Following Details");
 l1=new JLabel("Name:");
 l2=new JLabel("Phone Number:");
 l3=new JLabel("Email:");
 l4=new JLabel("Address:");
 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();
 t4=new JTextField();
 b1=new JButton("Submit");
 
 
}
public void properties()
{
    master.setVisible(true);
    master.setSize(600, 600);
    
    master.add(p1);
    p1.setSize(575, 575);
    p1.setLayout(null);
    b1.addActionListener(this);
}
public void positioning()
{
    head.setBounds(45, 30, 500,50);
    l1.setBounds(40, 160, 300,40);
    t1.setBounds(250, 160, 200, 40);
    l2.setBounds(40, 220, 300,40);
    t2.setBounds(250, 220, 200,40);
    l3.setBounds(40, 280, 300,40);
    t3.setBounds(250, 280, 200,40);
    l4.setBounds(40, 340, 300,40);
    t4.setBounds(250, 340, 200,40);
    b1.setBounds(220, 400, 100,50);

}

public void formatting()
{
    head.setFont(new Font("Harlow Solid Italic",Font.BOLD,35));
    head.setForeground(Color.RED);
    l1.setFont(new Font("Times New Roman",Font.BOLD,25));
    l2.setFont(new Font("Times New Roman",Font.BOLD,25));
    l3.setFont(new Font("Times New Roman",Font.BOLD,25));
    l4.setFont(new Font("Times New Roman",Font.BOLD,25));
    t1.setFont(new Font("Verdana",Font.BOLD,15));
    t2.setFont(new Font("Verdana",Font.BOLD,15));
    t3.setFont(new Font("Verdana",Font.BOLD,15));
    t4.setFont(new Font("Verdana",Font.BOLD,15));
    
    
}
public void add()
{
    p1.add(l1);
    p1.add(head);
    p1.add(l2);
    p1.add(l3);
    p1.add(l4);
    p1.add(t1);
    p1.add(t2);
    p1.add(t3);
    p1.add(t4);
    p1.add(b1);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
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
            JOptionPane.showMessageDialog(null,"Saved");
             
        }
         catch (Exception ae)
        {
            System.out.println(ae);
        }

    }
}
public static void callAddNewContact()
{
    AddNewContact obj=new AddNewContact();
    obj.init();
    obj.properties();
    obj.positioning();
    obj.formatting();
    obj.add();
}
}