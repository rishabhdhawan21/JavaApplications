package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class QuizRules implements ActionListener {
    JFrame master;
    JPanel p1;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1;
    public void init()//memory allocation
    {
         master=new JFrame();
         p1=new JPanel();
         l1=new JLabel("About The Quiz");
         ImageIcon img1 = new ImageIcon("C:\\Users\\Dell\\Downloads\\download.png");
         l2=new JLabel(img1);
         l3=new JLabel("1.) The quiz contains 10 questions about java.");
         l4=new JLabel("2.) Each question worths 10 marks.");
         l5=new JLabel("3.) There is no negetive marking.");
         l6=new JLabel("4.) Passing percentage is 70 percent.");
         b1=new JButton("Proceed");
    }
    public void properties()//set the properties of the frame
    {
        master.setVisible(true);
        master.setSize(500,600);
        p1.setSize(500,600);
        p1.setLayout(null);
        master.add(p1);
        master.setTitle("****Quiz Rules****");
        b1.addActionListener(this);
    }
    public void coordinates()//set the position of the components in frame
    {
        l1.setBounds(120, 10, 420, 50);
        l2.setBounds(160, 60, 150, 170);
        l3.setBounds(10, 270, 480, 40);
        l4.setBounds(10, 310, 480, 40);
        l5.setBounds(10, 350, 480, 40);
        l6.setBounds(10, 390, 480, 40);
        b1.setBounds(180, 460, 100, 60);
        
    }
    public void format()//format the appearence of the app
    {
        l1.setFont(new Font("MS Gothic",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l3.setFont(new Font("MS Gothic",Font.BOLD,18));
        l3.setForeground(Color.RED);
        l4.setFont(new Font("MS Gothic",Font.BOLD,18));
        l4.setForeground(Color.RED);
        l5.setFont(new Font("MS Gothic",Font.BOLD,18));
        l5.setForeground(Color.RED);
        l6.setFont(new Font("MS Gothic",Font.BOLD,18));
        l6.setForeground(Color.RED);
    }
    public void add()//adding components into the panel
    {
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(b1);
    }
    public void actionPerformed(ActionEvent e)
    {
        QuizApp obj1=new QuizApp();
        obj1.callQuizApp();
        
    }
    public void callQuizRules()
    {
        QuizRules obj=new QuizRules();
        obj.init();
        obj.properties();
        obj.coordinates();
        obj.format();
        obj.add();
        
        
    }
}
