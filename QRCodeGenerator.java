package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.Border;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class QRCodeGenerator implements ActionListener{
JFrame master;
JLabel l1,l2;
JButton b1,b2,b3;
JTextArea t1;
JPanel p1;
JScrollPane sp;
public void init()
{
    master=new JFrame();
    l1=new JLabel("Enter The Text Below");
    l2=new JLabel("Click on The QRCode to get the path of code generated");
    b1=new JButton("Generate QRCode");
    b2=new JButton("Reset");
    b3=new JButton();
    t1=new JTextArea();
    p1=new JPanel();
    
}
public void properties()
{
 master.setSize(800, 600);
 master.setVisible(true);
 p1.setSize(775, 575);
 master.add(p1);
 master.setTitle("****QRCode Generator****");
 Border border = BorderFactory.createLineBorder(Color.BLUE,10);
 p1.setBorder(border);
 p1.setLayout(null);
 t1.setLineWrap(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
}
public void positioning()
{
    l1.setBounds(55,30,400,50);
    t1.setBounds(25, 100, 360, 350);
    b1.setBounds(40, 470, 140, 50);
    b2.setBounds(220, 470, 140, 50);
    b3.setBounds(500, 200, 125, 125);
    l2.setBounds(420, 350, 320, 30);
}
public void formatting()
{
    l1.setFont(new Font("Haettenschweiler",Font.BOLD,40));
    l1.setForeground(Color.blue);
    t1.setFont(new Font("Verdana",Font.BOLD,13));
    t1.setForeground(Color.ORANGE);
    b1.setFont(new Font("Verdana",Font.ITALIC,11));
    b2.setFont(new Font("Verdana",Font.ITALIC,11));
    b1.setForeground(Color.WHITE);
    b2.setForeground(Color.WHITE);
    b1.setBackground(Color.BLUE);
    b2.setBackground(Color.BLUE);
    b3.setBackground(Color.WHITE);
    l2.setForeground(Color.RED);
}
public void add()
{
    p1.add(l1);
    p1.add(l2);
    p1.add(t1);
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    
}
public void actionPerformed(ActionEvent e) 
{
    
    if(e.getSource()==b1){
        try
    {
     String details=t1.getText();
     ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
     File f=new File("D:\\QRcode\\MyImage.jpg");
     FileOutputStream fos =new FileOutputStream(f);
     fos.write(out.toByteArray());
     fos.flush();
     ImageIcon img1 = new ImageIcon("D:\\QRcode\\MyImage.jpg");
     b3.setIcon(img1);
    }
    catch(Exception ea)
            {
            JOptionPane.showMessageDialog(null, "Error!");
            }
    }
    if(e.getSource()==b2)
    {
        t1.setText("");
        b3.setIcon(null);
    }
    if(e.getSource()==b3)
    {
        JOptionPane.showMessageDialog(null,"QRCode Path:-D:\\QRcode\\MyImage.jpg");
    }
}
public  void callQRCodeGenerator()
{
  QRCodeGenerator obj=new QRCodeGenerator();
  obj.init();
  obj.properties();
  obj.positioning();
  obj.formatting();
  obj.add();
}}