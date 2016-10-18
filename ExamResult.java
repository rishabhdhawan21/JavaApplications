package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static javaapplicationwindow.ViewDatabase.USER;
public class ExamResult implements ActionListener {
   static final String USER = "root";
   static final String PASS = "123456";
   Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    JFrame master;
    JPanel p1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
    JButton b1,b2,b3; 
    JTextArea t1;
    JPasswordField a1;

public void init()
{
master=new JFrame();
p1=new JPanel();
l1=new JLabel("Student Login");
l2=new JLabel("Enrollment No:");
l3=new JLabel("Password:");
l4=new JLabel();
l5=new JLabel();
l6=new JLabel();
l7=new JLabel();
l8=new JLabel();
l9=new JLabel();
l10=new JLabel();
l11=new JLabel();
l12=new JLabel();
l13=new JLabel();
l14=new JLabel();
l15=new JLabel();
l16=new JLabel();
l17=new JLabel();
l18=new JLabel();
l19=new JLabel();
l20=new JLabel();
l21=new JLabel();
l22=new JLabel();
l23=new JLabel();
b1=new JButton("Get Result");
b2=new JButton("Reset");
ImageIcon img=new ImageIcon("C:\\Users\\Dell\\Downloads\\download (1).jpg");
b3=new JButton(img);
t1=new JTextArea();
a1=new JPasswordField();
l24=new JLabel();
}
public void properties()
{
master.setVisible(true);
master.setSize(800, 750);
p1.setSize(775,725);
p1.setLayout(null);
master.add(p1);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void positioning()
{
l1.setBounds(316, 5, 300, 40);
l2.setBounds(250, 70, 180, 30);
t1.setBounds(400, 70, 180, 30);
l3.setBounds(250, 110, 180, 30);
a1.setBounds(400, 110, 180, 30);
b1.setBounds(280, 170, 100, 40);
b2.setBounds(400, 170, 100, 40);
l4.setBounds(337, 240, 160, 40);
l5.setBounds(80, 290, 100, 40);
l6.setBounds(80, 320, 180, 40);
l7.setBounds(555, 290, 300, 40);
l8.setBounds(555, 320, 300, 40);
l24.setBounds(200, 370, 300, 40);
l9.setBounds(200, 410, 300, 40);
l10.setBounds(200, 450, 300, 40);
l11.setBounds(200, 490, 300, 40);
l12.setBounds(200, 530, 300, 40);
l13.setBounds(200, 570, 300, 40);
l14.setBounds(500, 370, 300, 40);
l15.setBounds(500, 410, 300, 40);
l16.setBounds(500, 450, 300, 40);
l17.setBounds(500, 490, 300, 40);
l18.setBounds(500, 530, 300, 40);
l19.setBounds(500, 570, 300, 40);
l20.setBounds(100, 620, 300, 40);
l21.setBounds(200, 620, 300, 40);
l22.setBounds(500, 620, 300, 40);
l23.setBounds(600, 620, 300, 40);
}
public void formatting()
{
    l1.setFont(new Font("Playbill",Font.BOLD,45));
    l1.setForeground(Color.MAGENTA);
    l2.setFont(new Font("Playbill",Font.BOLD,30));
    l3.setFont(new Font("Playbill",Font.BOLD,30));
    b1.setFont(new Font("Times New Roman",Font.BOLD,12));
    b2.setFont(new Font("Times New Roman",Font.BOLD,12));
    l4.setFont(new Font("Playbill",Font.BOLD,45));
    l4.setForeground(Color.ORANGE);
    l5.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l6.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l7.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l8.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l7.setForeground(Color.MAGENTA);
    l8.setForeground(Color.MAGENTA);
    l24.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l9.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l10.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l11.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l12.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l13.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l24.setForeground(Color.BLUE);
    l14.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l14.setForeground(Color.BLUE);
    l15.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l16.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l17.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l18.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l19.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l15.setForeground(Color.GREEN);
    l16.setForeground(Color.GREEN);
    l17.setForeground(Color.GREEN);
    l18.setForeground(Color.GREEN);
    l19.setForeground(Color.GREEN);
    l20.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l20.setForeground(Color.RED);
    l21.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l21.setForeground(Color.RED);
    l22.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l22.setForeground(Color.RED);
    l23.setFont(new Font("Showcard Gothic",Font.BOLD,18));
    l23.setForeground(Color.RED);
}
public void add()
{
    p1.add(a1);
    
    p1.add(l1);
    p1.add(l2);
    p1.add(l3);
    p1.add(l4);
    p1.add(l5);
    p1.add(l6);
    p1.add(l7);
    p1.add(l8);
    p1.add(l9);
    p1.add(l10);
    p1.add(l12);
    p1.add(l13);
    p1.add(l14);
    p1.add(l15);
    p1.add(l16);
    p1.add(l17);
    p1.add(l18);
    p1.add(l19);
    p1.add(l20);
    p1.add(l21);
    p1.add(l22);
    p1.add(l23);
    p1.add(b3);
    p1.add(b2);
    p1.add(b1);
    p1.add(t1);
    p1.add(l24);
    p1.add(l11);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b2)
    {
        a1.setText(null);
        t1.setText(null);
        l4.setText(null);
        l5.setText(null);
        l6.setText(null);
        l7.setText(null);
        l8.setText(null);
        l9.setText(null);
        l10.setText(null);
        l11.setText(null);
        l12.setText(null);
        l13.setText(null);
        l14.setText(null);
        l15.setText(null);
        l16.setText(null);
        l17.setText(null);
        l18.setText(null);
        l19.setText(null);
        l20.setText(null);
        l21.setText(null);
        l22.setText(null);
        l23.setText(null);
        l24.setText(null);
    }
    if(e.getSource()==b1)
    {
         try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam results",USER,PASS);
        stmt=conn.createStatement();
        String sql="SELECT * FROM result WHERE Enrollno=? AND PassWord=?";
       ps=conn.prepareStatement(sql);
        ps.setString(1,t1.getText());
        ps.setString(2,a1.getText());
        rs=ps.executeQuery();
        rs.next();
        
        l7.setText(rs.getString("Name"));
        l8.setText(rs.getString("Enrollno"));
        l4.setText("Marksheet");
        l5.setText("Name :");
        l6.setText("Enrollment No:");
        l9.setText("Maths");
        l10.setText("English");
        l11.setText("Science");
        l12.setText("Hindi");
        l13.setText("SST");
        l14.setText("CGPA");
        l20.setText("Result");
        l22.setText("AGG :");
        l15.setText(rs.getString("Maths"));
        l16.setText(rs.getString("English"));
        l17.setText(rs.getString("Science"));
        l18.setText(rs.getString("Hindi"));
        l19.setText(rs.getString("SST"));
        l21.setText(rs.getString("Rstatus"));
        l23.setText(rs.getString("agg"));
        l24.setText("Subjects");
        conn.close();

    }
         catch(Exception ae)
         {
             JOptionPane.showMessageDialog(null,"Invalid Enrollment Number or Password!!");
         }
}}
public void callExamResult()
{
    ExamResult obj=new ExamResult();
    obj.init();
    obj.properties();
    obj.positioning();
    obj.formatting();
    obj.add();
}
}