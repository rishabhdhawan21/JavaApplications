package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
public class AdressBookWindow implements ActionListener {
    JFrame master;
    JPanel p1;
    
    JButton b1,b2,b3;
    public void init()
    {
        
        master=new JFrame();
        p1=new JPanel();
        
        b3=new JButton("View Book");
        b2=new JButton("Add New Contact");
        ImageIcon img3 = new ImageIcon("C:\\Users\\Dell\\Downloads\\contacts-xxl.png");
        b1=new JButton(img3);
    }
    public void properties()
    {
         Border border = BorderFactory.createLineBorder(Color.BLACK,10);
        master.setTitle("****AdressBook Window****");
        master.setVisible(true);
        master.setSize(500, 500);
        master.add(p1);
        p1.setSize(475, 475);
        p1.setLayout(null);
        p1.setBorder(border);
        b2.addActionListener(this);
           }
    public void positioning()
    {
        b1.setBackground(Color.BLACK);
        b1.setBounds(130, 30, 230, 230);
        b2.setBounds(85, 350, 135, 50);
        b3.setBounds(260, 350, 135, 50);
    }
    public void formatting()
    {
     b2.setFont(new Font("Verdana",Font.BOLD,10));
     b3.setFont(new Font("Verdana",Font.BOLD,10));
     
    }
    public void add()
    {
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b2){
        AddNewContact obj=new AddNewContact();
        obj.callAddNewContact();}
    }
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

