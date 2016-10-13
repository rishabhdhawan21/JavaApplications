package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class PuzzleRules implements ActionListener{
    //declaration of frame elements
    JFrame master;
    JPanel p1;
    JButton b1;
    JLabel l1,l2,l3;

public void init()
{
    master=new JFrame();
    p1=new JPanel();
    b1=new JButton("Play");
    l1=new JLabel("Welcome to the Number Puzzle Game");
    l2=new JLabel("Shuffle up the positions of the number blocks");
    l3=new JLabel("to develope the correct number sequence.");
}
public void properties()
{
    master.setTitle("****Number Puzzle****");
    master.setSize(500, 400);
    master.setVisible(true);
    master.add(p1);
    p1.setLayout(null);
    p1.setSize(500, 500);
    b1.addActionListener(this);
}
public void positioning()
{
    l1.setForeground(Color.RED);
    l1.setBounds(30,50,420,100);
    l2.setBounds(40,120,420,100);
    l3.setBounds(40,140,420,100);
    b1.setBounds(200,250,60, 40);
}
public void format()
{
    l1.setFont(new Font("Harlow Solid Italic",Font.BOLD,25));
    l2.setFont(new Font("Harlow Solid Italic",Font.BOLD,21));
    l3.setFont(new Font("Harlow Solid Italic",Font.BOLD,22));
}
public void add()
{
    p1.add(l1);
    p1.add(l2);
    p1.add(l3);
    p1.add(b1);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        PuzzleApp obj=new PuzzleApp();
        obj.callPuzzleApp();
    }
}
public  void callPuzzleRules()
{
    PuzzleRules obj=new PuzzleRules();
    obj.init();
    obj.properties();
    obj.positioning();
    obj.format();
    obj.add();
    
}
}