package javaapplicationwindow;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
public class Calculator implements ActionListener 
{
    //declaration of components of the calculator app
      static double a=0,b=0,result=0,c=0;
    static int operator=0;
    JFrame master1;
    JPanel p1;
    JTextField t1;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bac,bdel,badd,bsub,bmul,bdiv,bmod,breciprocal,bpower,bdot,bequal,blog,bsin,bcos,btan;
    public void memoryAllocation()//allocation of memory for different components
    {
        master1=new JFrame();
        p1=new JPanel();
        t1=new JTextField(100);
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        bac=new JButton("AC");
        bdel=new JButton("Delete");
        badd=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("*");
        bdiv=new JButton("/");
        bmod=new JButton("mod");
        breciprocal=new JButton("1/x");
        bpower=new JButton("^");
        bdot=new JButton(".");
        bequal=new JButton("=");
        blog=new JButton("ln x");
        bsin=new JButton("sin");
        bcos=new JButton("cos");
        btan=new JButton("tan");
    }
    public void properties()//setting properties of the frame
    {
        Border border = BorderFactory.createLineBorder(Color.BLACK,10);
        p1.setBorder(border);
        master1.add(p1);
        master1.setTitle("****Calculator****");
        master1.setSize(590, 500);
        master1.setVisible(true);
        p1.setSize(560,470);
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
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        breciprocal.addActionListener(this);
        bac.addActionListener(this);
        bdel.addActionListener(this);
        bdot.addActionListener(this);
        bequal.addActionListener(this);
        blog.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        
    }
    public void positioning()//set the position of the components in the frame
    {
        p1.setBackground(Color.WHITE);
        t1.setBounds(45,30,480,50);
        b1.setBounds(40,100,50,50);
        b2.setBounds(120,100,50,50);
        b3.setBounds(200,100,50,50);
        blog.setBounds(350,100 ,70 ,50 );
        badd.setBounds(280,100,50,50);
        bac.setBounds(440,100,90,50);
        b4.setBounds(40,180,50,50);
        b5.setBounds(120,180,50,50);
        b6.setBounds(200,180,50,50);
        bsub.setBounds(280,180,50,50);
        bmod.setBounds(440,180,90,50);
        b7.setBounds(40,260,50,50);
        b8.setBounds(120,260,50,50);
        b9.setBounds(200,260,50,50);
        bmul.setBounds(280,260,50,50);
        breciprocal.setBounds(440,260,90,50);
        b0.setBounds(40,340,50,50);
        bdot.setBounds(120,340,50,50);
        bequal.setBounds(200,340,50,50);
        bdiv.setBounds(280,340,50,50);
        bdel.setBounds(440,340,90,50);
        bsin.setBounds(350 ,180 ,70,50);
        bcos.setBounds(350 ,260 ,70,50);
        btan.setBounds(350 ,340 ,70,50);
    }
    public void formatting()//formatting of components
    {
        
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        b1.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setForeground(Color.WHITE);
        b7.setForeground(Color.WHITE);
        b8.setForeground(Color.WHITE);
        b9.setForeground(Color.WHITE);
        bac.setForeground(Color.WHITE);
        badd.setForeground(Color.WHITE);
        bsub.setForeground(Color.WHITE);
        bmul.setForeground(Color.WHITE);
        bdiv.setForeground(Color.WHITE);
        bequal.setForeground(Color.WHITE);
        bdot.setForeground(Color.WHITE);
        breciprocal.setForeground(Color.WHITE);
        bmod.setForeground(Color.WHITE);
        bsin.setForeground(Color.WHITE);
        bcos.setForeground(Color.WHITE);
        btan.setForeground(Color.WHITE);
        bdel.setForeground(Color.WHITE);
        blog.setForeground(Color.WHITE);
        t1.setFont(new Font("Times New Roman",Font.BOLD,30));
        b1.setFont(new Font("Times New Roman",Font.BOLD,20));
        b2.setFont(new Font("Times New Roman",Font.BOLD,20));
        b3.setFont(new Font("Times New Roman",Font.BOLD,20));
        b4.setFont(new Font("Times New Roman",Font.BOLD,20));
        b5.setFont(new Font("Times New Roman",Font.BOLD,20));
        b6.setFont(new Font("Times New Roman",Font.BOLD,20));
        b7.setFont(new Font("Times New Roman",Font.BOLD,20));
        b8.setFont(new Font("Times New Roman",Font.BOLD,20));
        b9.setFont(new Font("Times New Roman",Font.BOLD,20));
        b0.setFont(new Font("Times New Roman",Font.BOLD,20));
        bdot.setFont(new Font("Times New Roman",Font.BOLD,20));
        bequal.setFont(new Font("Times New Roman",Font.BOLD,20));
        badd.setFont(new Font("Times New Roman",Font.BOLD,20));
        bsub.setFont(new Font("Times New Roman",Font.BOLD,20));
        bmul.setFont(new Font("Times New Roman",Font.BOLD,20));
        bdiv.setFont(new Font("Times New Roman",Font.BOLD,20));
        breciprocal.setFont(new Font("Times New Roman",Font.BOLD,20));
        bmod.setFont(new Font("Times New Roman",Font.BOLD,20));
        bac.setFont(new Font("Times New Roman",Font.BOLD,20));
        bdel.setFont(new Font("Times New Roman",Font.BOLD,20));
        blog.setFont(new Font("Times New Roman",Font.BOLD,20));
        bsin.setFont(new Font("Times New Roman",Font.BOLD,20));
        bcos.setFont(new Font("Times New Roman",Font.BOLD,20));
        btan.setFont(new Font("Times New Roman",Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        bsin.setBackground(Color.BLACK);
        bcos.setBackground(Color.BLACK);
        btan.setBackground(Color.BLACK); 
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.BLACK);
        b6.setBackground(Color.BLACK);
        b7.setBackground(Color.BLACK);
        b8.setBackground(Color.BLACK);
        b9.setBackground(Color.BLACK);
        b0.setBackground(Color.BLACK);
        badd.setBackground(Color.BLACK);
        bsub.setBackground(Color.BLACK);
        bmul.setBackground(Color.BLACK);
        blog.setBackground(Color.BLACK);
        bdiv.setBackground(Color.BLACK);
        bmod.setBackground(Color.BLACK);
        bdot.setBackground(Color.BLACK);
        breciprocal.setBackground(Color.BLACK);
        bac.setBackground(Color.BLACK);
        bdel.setBackground(Color.BLACK);
        bequal.setBackground(Color.BLACK);
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,3);
        t1.setBorder(border);
        
    }
    public void add()//to add components to the frame
    {
        p1.add(t1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b0);
        p1.add(bdot);
        p1.add(bequal);
        p1.add(badd);
        p1.add(bsub);
        p1.add(bmul);
        p1.add(bdiv);
        p1.add(bac);
        p1.add(breciprocal);
        p1.add(bmod);
        p1.add(bdel);
        p1.add(blog);
        p1.add(bsin);
        p1.add(bcos);
        p1.add(btan);
    }
    
    public void actionPerformed(ActionEvent e)//to define the functioning of buttons
    {
        if(e.getSource()==b1)
            t1.setText(t1.getText().concat("1"));
        
        if(e.getSource()==b2)
            t1.setText(t1.getText().concat("2"));
        
        if(e.getSource()==b3)
            t1.setText(t1.getText().concat("3"));
        
        if(e.getSource()==b4)
            t1.setText(t1.getText().concat("4"));
        
        if(e.getSource()==b5)
            t1.setText(t1.getText().concat("5"));
        
        if(e.getSource()==b6)
            t1.setText(t1.getText().concat("6"));
        
        if(e.getSource()==b7)
            t1.setText(t1.getText().concat("7"));
        
        if(e.getSource()==b8)
            t1.setText(t1.getText().concat("8"));
        
        if(e.getSource()==b9)
            t1.setText(t1.getText().concat("9"));
        
        if(e.getSource()==b0)
            t1.setText(t1.getText().concat("0"));
        
        if(e.getSource()==badd)
        {
           a=Double.parseDouble(t1.getText());
           operator=1;
           t1.setText("");
        }
        
        if(e.getSource()==bsub)
        {
           a=Double.parseDouble(t1.getText());
           operator=2;
           t1.setText("");
        }
        
        if(e.getSource()==bmul)
        {
           a=Double.parseDouble(t1.getText());
           operator=3;
           t1.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
           a=Double.parseDouble(t1.getText());
           operator=4;
           t1.setText("");
        }
        
        if(e.getSource()==bmod)
        {
           a=Double.parseDouble(t1.getText());
           operator=5;
           t1.setText("");
        }
        if(e.getSource()==blog)
        {
            a=Double.parseDouble(t1.getText());
            t1.setText(""+Math.log(a));
        }
        if(e.getSource()==bsin)
        {
            a=Double.parseDouble(t1.getText());
            c=Math.toRadians(a);
            t1.setText(""+Math.sin(c));
        }
        if(e.getSource()==bcos)
        {
            a=Double.parseDouble(t1.getText());
            c=Math.toRadians(a);
            t1.setText(""+Math.cos(c));
        }
        if(e.getSource()==btan)
        {
            a=Double.parseDouble(t1.getText());
            c=Math.toRadians(a);
            t1.setText(""+Math.tan(c));
        }
        if(e.getSource()==breciprocal)
        {
           a=Double.parseDouble(t1.getText());
           t1.setText(""+1/a);
        }
         if(e.getSource()==bequal)
        {
            b=Double.parseDouble(t1.getText());
        
        switch(operator)
        {
            case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
                    
                case 5: result=a%b;
                    break;
                
                default: result=0;
            }
        t1.setText(""+result);
        }
         if(e.getSource()==bdel)
         {
              String s=t1.getText();
            t1.setText("");
            for(int i=0;i<s.length()-1;i++)
            t1.setText(t1.getText()+s.charAt(i));
        }
         if(e.getSource()==bac)
         {
              String s=t1.getText();
            t1.setText("");
         }
         if(e.getSource()==bdot)
         {
             String str=t1.getText();
             t1.setText(str+".");
         }
     }
        
    
public static void callCalculator()
{
    Calculator obj=new Calculator();
    obj.memoryAllocation();
    obj.properties();
    obj.positioning();
    obj.formatting();
    obj.add();
    
}
}
