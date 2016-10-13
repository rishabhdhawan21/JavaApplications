package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class PuzzleApp implements ActionListener{
    JFrame master;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JPanel p1;
    int count=0;
    String str="";

public void init()
{
    master=new JFrame();
    l1=new JLabel("Total Swaps:");
    l2=new JLabel("0");
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("4");
    p1=new JPanel();

}
public void properties()
        
{
    master.setTitle("****PUZZLE****");
    Border border1 = BorderFactory.createLineBorder(Color.BLACK,10);
    master.setVisible(true);
    master.setSize(600, 600);
    master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    master.add(p1);
    p1.setSize(570, 570);
    p1.setLayout(null);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    p1.setBorder(border1);
}
public void positioning()
{
    l1.setBounds(200, 20, 350, 70);
    l2.setBounds(400, 20, 100, 70);
    b1.setBounds(150, 150, 80, 80);
    b2.setBounds(250, 150, 80, 80);
    b3.setBounds(350, 150, 80, 80);
    b4.setBounds(150, 250, 80, 80);
    b5.setBounds(250, 250, 80, 80);
    b6.setBounds(350, 250, 80, 80);
    b7.setBounds(150, 350, 80, 80);
    b8.setBounds(250, 350, 80, 80);
    b9.setBounds(350, 350, 80, 80);
    
}   
public void format()
{
    l1.setFont(new Font("Harlow Solid Italic",Font.BOLD,30));
    l2.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b1.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b2.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b3.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b4.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b5.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b6.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b7.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b9.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b8.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    b1.setForeground(Color.WHITE);
    b1.setBackground(Color.BLACK);
    b2.setForeground(Color.BLACK);
    b2.setBackground(Color.WHITE);
    b3.setForeground(Color.WHITE);
    b3.setBackground(Color.BLACK);
    b4.setForeground(Color.BLACK);
    b4.setBackground(Color.WHITE);
    b5.setForeground(Color.WHITE);
    b5.setBackground(Color.BLACK);
    b6.setForeground(Color.BLACK);
    b6.setBackground(Color.WHITE);
    b7.setForeground(Color.WHITE);
    b7.setBackground(Color.BLACK);
    b8.setForeground(Color.BLACK);
    b8.setBackground(Color.WHITE);
    b9.setForeground(Color.WHITE);
    b9.setBackground(Color.BLACK);
}

public void add()
{
    p1.add(l1);
    p1.add(l2);
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    
    
    
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        count++;
        l2.setText(""+count);
        str=b1.getText();
        if(b2.getText()=="")
        {   b1.setText("");
            b2.setText(str);}
        if(b4.getText()==""){
            b1.setText("");
            b4.setText(str);}
    }
    if(e.getSource()==b2)
    {
        count++;
        l2.setText(""+count);
        str=b2.getText();
        if(b1.getText()=="")
        {
            b2.setText("");
            b1.setText(str);
        }
        if(b3.getText()=="")
        {
            b2.setText("");
            b3.setText(str);
        }
        if(b5.getText()=="")
        {
            b2.setText("");
            b5.setText(str);
        }
        
    }
    if(e.getSource()==b3)
    {
        count++;
        l2.setText(""+count);
        str=b3.getText();
        if(b2.getText()=="")
        {
            b3.setText("");
            b2.setText(str);
        }
        if(b6.getText()=="")
        {
            b3.setText("");
            b6.setText(str);
        }
    }
    if(e.getSource()==b4)
    {
        count++;
        l2.setText(""+count);
        str=b4.getText();
        if(b1.getText()=="")
        {
            b4.setText("");
            b1.setText(str);
        }
        if(b5.getText()=="")
        {
            b4.setText("");
            b5.setText(str);
        }
        if(b7.getText()=="")
        {
            b4.setText("");
            b7.setText(str);
        }
    }
    if(e.getSource()==b5)
    {
        count++;
        l2.setText(""+count);
        str=b5.getText();
        if(b2.getText()=="")
        {
            b5.setText("");
            b2.setText(str);
        }
        if(b4.getText()=="")
        {
            b5.setText("");
            b4.setText(str);
        }
        if(b8.getText()=="")
        {
            b5.setText("");
            b8.setText(str);
        }
        if(b6.getText()=="")
        {
            b5.setText("");
            b6.setText(str);
        }
    }
        if(e.getSource()==b6)
        {
            count++;
            l2.setText(""+count);
            str=b6.getText();
            if(b3.getText()=="")
            {
                b6.setText("");
                b3.setText(str);
            }
            if(b5.getText()=="")
            {
                b6.setText("");
                b5.setText(str);
            }
            if(b9.getText()=="")
            {
                b6.setText("");
                b9.setText(str);
            }
        }
        if(e.getSource()==b7)
            {
                count++;
                l2.setText(""+count);
                str=b7.getText();
                if(b4.getText()=="")
                {
                    b7.setText("");
                    b4.setText(str);
                }
                if(b8.getText()=="")
                {
                    b7.setText("");
                    b8.setText(str);
                }
                
                    
            }
         if(e.getSource()==b8)
            {
                count++;
                l2.setText(""+count);
                str=b8.getText();
                if(b7.getText()=="")
                {
                    b8.setText("");
                    b7.setText(str);
                }
                if(b9.getText()=="")
                {
                    b8.setText("");
                    b9.setText(str);
                }
                if(b5.getText()=="")
                {
                    b8.setText("");
                    b5.setText(str);
                }
            }
         if(e.getSource()==b9)
         {
             count++;
             l2.setText(""+count);
             str=b9.getText();
             if(b8.getText()=="")
             {
                 b9.setText("");
                 b8.setText(str);
             }
             if(b6.getText()=="")
             {
                 b9.setText("");
                 b6.setText(str);
             }
         }
         if(b1.getText()=="1" && b2.getText()=="2" && b3.getText()=="3" && b4.getText()=="4" && b5.getText()=="5" && b6.getText()=="6" && b7.getText()=="7" && b8.getText()=="8" && b9.getText()=="")
         {
             JOptionPane.showMessageDialog(null,"You Won!!");
         }  
    }
         
    
    

public  void callPuzzleApp()
{
    PuzzleApp obj=new PuzzleApp();
    obj.init();
    obj.properties();
    obj.positioning();
    obj.format();
    obj.add();
}
}