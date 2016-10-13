package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class TemperatureConvertor implements ActionListener {
    //declaration of gui components
    double celcius,fahrenite,kelvin;
    int operation;
    JFrame master;
    JPanel p1;
    ButtonGroup bg;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4,l5;
    JButton b1;
    JRadioButton b2,b3,b4;
    public void memoryAllocation()//defination and allocation of gui components
    {
        master=new JFrame();
        p1=new JPanel();
        bg=new ButtonGroup();
        l1=new JLabel("Enter The Temperature And Select Unit");
        l2=new JLabel("In Celcius:");
        l3=new JLabel("In Fahrenite:");
        l4=new JLabel("In Kelvin:");
        b1=new JButton("Convert");
        b2=new JRadioButton("celcius");
        b3=new JRadioButton("fahrenite");
        b4=new JRadioButton("kelvin");
        t1=new JTextField(30);
        t2=new JTextField(30);
        t3=new JTextField(30);
        t4=new JTextField(30);
        ImageIcon img=new ImageIcon("C:\\Users\\Dell\\Downloads\\images.png");
        l5=new JLabel(img);
        
    }
    public void properties()//set properties of the components
    {
        Border border1 = BorderFactory.createLineBorder(Color.BLACK,10);
        p1.setBorder(border1);
        master.setSize(600, 600);       
        master.setVisible(true);
        master.add(p1);
        master.setTitle("****Temperature Convertor****");
        p1.setSize(600,600);
        p1.setLayout(null);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,3);
        t1.setBorder(border);
        t2.setBorder(border);
        t3.setBorder(border);
        t4.setBorder(border);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void setCoordinates()//positioning of components
    {
        l1.setBounds(22, 10, 550, 100);
        b2.setBounds(100, 140, 90, 60);
        b3.setBounds(220, 140, 110, 60);
        b4.setBounds(350, 140, 90, 60);
        t1.setBounds(120,100,300,30);
        b1.setBounds(200, 200, 150, 50);
        l2.setBounds(60,300,150,30);
        t2.setBounds(250,300,80,30);
        l3.setBounds(60,350,150,30);
        t3.setBounds(250,350,80,30);
        l4.setBounds(60,400,150,30);
        t4.setBounds(250,400,80,30);
        l5.setBounds(375,250,125,250);
    }
    public void formatting()//formating the appearence of components
    {
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setForeground(Color.RED);
        b2.setFont(new Font("Times New Roman",Font.BOLD,20));
        b3.setFont(new Font("Times New Roman",Font.BOLD,20));
        b4.setFont(new Font("Times New Roman",Font.BOLD,20));
        l2.setFont(new Font("Times New Roman",Font.BOLD,20));
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        t2.setFont(new Font("Times New Roman",Font.BOLD,20));
        t3.setFont(new Font("Times New Roman",Font.BOLD,20));
        t4.setFont(new Font("Times New Roman",Font.BOLD,20));
    }
    public void add()//to add the components to the panel
    {
        p1.add(l1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            operation=1;
        }
        if(e.getSource()==b3)
        {
            operation=2;
        }
        if(e.getSource()==b4)
        {
            operation=3;
        }
        switch(operation)
        {
            case 1:
                celcius=Double.parseDouble(t1.getText());
                kelvin=celcius+273;
                fahrenite=(celcius*1.8)+32;
                break;
            case 2:
                fahrenite=Double.parseDouble(t1.getText());
                celcius=(fahrenite-32)*0.555555;
                kelvin=((fahrenite-32)/1.8)+273;
                break;
            case 3:
                kelvin=Double.parseDouble(t1.getText());
                celcius=kelvin-273;
                fahrenite=(1.8*(kelvin - 273)) + 32;
                break;
            default:
                kelvin=0;
                celcius=0;
                fahrenite=0;
                
        }
        if(e.getSource()==b1)
        {
            t2.setText(""+celcius);
            t3.setText(""+fahrenite);
            t4.setText(""+kelvin);
        }
        
        
    }
    
    public static void callTemperatureConvertor()
    {
    TemperatureConvertor obj=new TemperatureConvertor();
    obj.memoryAllocation();
    obj.properties();
    obj.setCoordinates();
    obj.formatting();
    obj.add();
    
}
}
    

