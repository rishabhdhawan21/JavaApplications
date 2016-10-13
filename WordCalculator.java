package javaapplicationwindow;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.Border;
import java.awt.event.*;

public class WordCalculator implements ActionListener{
    //declaring components of the app frame
    int count1=0;
    int count2=0;
    JFrame master;
    JPanel p1;
    JLabel l1,l2,l3;
    JTextArea t1,t2,t3;
    JButton b1;
    public void init()//memory allocation of the components declared earlier
    {
        master=new JFrame();
        p1=new JPanel();
        l1=new JLabel("Enter The Paragraph Below");
        l2=new JLabel("Number Of Words:");
        l3=new JLabel("Number Of Characters:");
        t1=new JTextArea();
        t1.setLineWrap(true);
        b1=new JButton("Submit");
        t2=new JTextArea();
        t3=new JTextArea();
        
    }
    public void properties()//set the properties of the frame
    {
        Border border1 = BorderFactory.createLineBorder(Color.BLUE,10);
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,3);
        p1.setBorder(border1);
        master.setVisible(true);
        master.setSize(650,650);
        p1.setSize(634,610);
        p1.setLayout(null);
        master.setLayout(null);
        master.add(p1);
        t1.setBorder(border);
        t2.setBorder(border);
        t3.setBorder(border);
        b1.addActionListener(this);
        master.setTitle("****Word Count Tool****");
    }
    public void positioning()//set the position of the components in frame
    {
        l1.setBounds(65, 30, 550, 50);
        t1.setBounds(38, 90, 550, 275);
        b1.setBounds(265, 400, 90, 40);
        l2.setBounds(38, 470, 230, 30);
        l3.setBounds(38,530, 230, 30);
        t2.setBounds(280, 470, 70, 30);
        t3.setBounds(280,530, 70, 30);
    
           
    }
    public void formatting()//format the appearence of the app
    {
        l1.setFont(new Font("ALGERIAN",Font.BOLD,30));
        l1.setForeground(Color.BLUE);
        t1.setFont(new Font("ALGERIAN",Font.ITALIC,15));
        t1.setForeground(Color.RED);
        l2.setFont(new Font("ALGERIAN",Font.BOLD,15));
        l2.setForeground(Color.BLUE);
        l3.setFont(new Font("ALGERIAN",Font.BOLD,15));
        l3.setForeground(Color.BLUE);
        t2.setFont(new Font("ALGERIAN",Font.BOLD,15));
        t3.setFont(new Font("ALGERIAN",Font.BOLD,15));
    }
    public void add()//adding components into the panel
    {
       p1.add(l1);
       p1.add(t1);
       p1.add(l2);
       p1.add(b1);
       p1.add(l3);
       p1.add(t2);
       p1.add(t3);
     
    }
        public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==b1)
     {
         String str=t1.getText();
         char ch[]=new char[str.length()];
         char ch1[]=new char[str.length()];
         for(int i=0;i<str.length();i++)
        {
            ch[i]= str.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            count1++;
        }
         t2.setText(""+count1);
         for( int j=0; j<str.length(); j++ ) {
             if (Character.isLetter(str.charAt(j)))
        count2++;}
    t3.setText(""+count2);
}
         
}
    public  void callWordCalculator()
    {
        WordCalculator obj=new WordCalculator();
        obj.init();
        obj.properties();
        obj.positioning();
        obj.formatting();
        obj.add();
    }
         
}
            
    

