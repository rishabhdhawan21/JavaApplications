package javaapplicationwindow;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class QuizApp implements ActionListener{
    //declaration of frame elements
    JFrame master=new JFrame();
    JPanel p1=new JPanel();
    JRadioButton b2,b3,b4,b5;
    ButtonGroup g1;
    JButton b1;
    JLabel l1;
    int score=0;
    int operation=0;
    int j=0;
    int k=1;
     String questions[][]={{"Q1. What is the default value of Boolean variable?"},
        {"Q2. What is an Interface?"}, 
        {"Q3. What is the size of boolean variable?"},
        {"Q4. What is function overloading?"},
        {"Q5. which operator is considered to be with highest precedence?"},
        {"Q6. Which of the following is not a keyword in java?"},
        {"Q7.Dynamic binding uses which information for binding?"},
        {"Q8.Which of the following is Faster, StringBuilder or StringBuffer?"},
        {"Q9.What are Wrapper classes?"},
        {"Q10.Which arithmetic operations can result in the throwing of an ArithmeticException?"},};
    
     String options[][]={{"True","False","Null","Not Defined"},
        {"An interface is a collection of abstract methods.","Interface is an abstract class.","Interface is an concrete class.","None of the above."},
        {"8 bits","16 bits","32 bits","Not Defined"},
        {"Methods with same name but different parameters.","Methods with same name but different return types.","Methods with same name, same parameter types but different parameter names.","None of the above."},
        {"[] ()","=","?;","%"},
        {"Static","Boolean","Void","Private"},
        {"Type","Objects","Both of th above","None of the above"},
        {"StringBuilder","StringBuffer","Both of the above","None of the above"},
        {"These are classes that allow primitive types to be accessed as objects.","These are classes that wraps functionality of an existing class."," Both of the above.","None of the above"},
        {"/ , %","*, +","!, -",">>, <<"}};
     String answers[]={"b3","b2","b2","b2","b2","b3","b3","b2","b2","b2"};
    public void init()//memory allocation of frame elements
    {
        master=new JFrame();
        p1=new JPanel();
        l1=new JLabel();
        b2=new JRadioButton();
        b3=new JRadioButton();
        b4=new JRadioButton();
        b5=new JRadioButton();
        g1=new ButtonGroup();
        b1=new JButton("Next");
    }
    public void properties()//setting properties of the frame
    {
        Border border = BorderFactory.createLineBorder(Color.GREEN,10);
        p1.setBorder(border);
        master.setTitle("****QUIZ APP****");
        master.setSize (1100, 400);
        master.setVisible(true);
        for(int i=0;i<4;i++)
        p1.setSize(1200, 400);
        master.add(p1);
        p1.setLayout(null);
        g1.add(b2);
        g1.add(b3);
        g1.add(b5);
        g1.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    
    
   
    public void positioning()//setting the required positions of the elements in th frame
    {
        l1.setBounds(10, 30, 1000, 30);
        b2.setBounds(10,100,1000,30);
        b3.setBounds(10,150,1000,30);
        b4.setBounds(10,200,1000,30);
        b5.setBounds(10,250,1000,30);
        b1.setBounds(450, 300, 100, 50);

    }
    public void formatting()//to format the appearence of the elements of the frame
    {
        l1.setFont(new Font("Harlow Solid Italic",Font.BOLD,26));
        l1.setForeground(Color.RED);
        l1.setText(""+questions[0][0]);
        b2.setForeground(Color.blue);
        b3.setForeground(Color.blue);
        b4.setForeground(Color.blue);
        b5.setForeground(Color.blue);
        b2.setText(""+options[0][0]);
        b3.setText(""+options[0][1]);
        b4.setText(""+options[0][2]);
        b5.setText(""+options[0][3]);
        b2.setFont(new Font("Verdana",Font.BOLD,20));
        b3.setFont(new Font("Verdana",Font.BOLD,20));
        b4.setFont(new Font("Verdana",Font.BOLD,20));
        b5.setFont(new Font("Verdana",Font.BOLD,20));
        
           
    }
    
    public void add()//adding the elements inside the panel
    {
        p1.add(l1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b1);
        


    }
    public void actionPerformed(ActionEvent e)//defining the action when a button is pressed
    {
        
        
      
        if(j<10)
        {
        {
        if(e.getSource()==b2 && "b2"==answers[j])
        {
         score=score+10;
         j++;
         b2.setForeground(Color.green);}
        else if(e.getSource()==b2 && "b2"!=answers[j])
         {
         j++;
         b2.setForeground(Color.green);}
         
        }
        if(e.getSource()==b3 && "b3"==answers[j])
        {
         score=score+10;
         j++;
         b3.setForeground(Color.green);}
        else if(e.getSource()==b3 && "b3"!=answers[j])
        {j++;
         b3.setForeground(Color.green);}
        
        if(e.getSource()==b4 && "b4"==answers[j])
        {
         score=score+10;
         j++;
         b4.setForeground(Color.green);
        }
        else if(e.getSource()==b4 && "b4"!=answers[j]){j++;
         b4.setForeground(Color.green);
        }
        if(e.getSource()==b5 && "b5"==answers[j])
        {
         score=score+10;
         j++;
         b5.setForeground(Color.green);
         
        }
        else if(e.getSource()==b5 && "b5"!=answers[j]){j++;
         b5.setForeground(Color.green);
        }
        }
        
        
        
    
        if(k<=9){
        
        if(e.getSource()==b1)
        {
            
            b2.setText(""+options[k][operation]);
            b3.setText(""+options[k][operation+1]);
            b4.setText(""+options[k][operation+2]);
            b5.setText(""+options[k][operation+3]);
            b2.setForeground(Color.BLACK);
            b3.setForeground(Color.BLACK);
            b4.setForeground(Color.BLACK);
            b5.setForeground(Color.BLACK);
            g1.clearSelection();
            l1.setText(""+questions[k][0]);
            
            k++;
           
        }
}   
        if(k==10)
        {
        if(e.getSource()==b2 || e.getSource()==b3 || e.getSource()==b4 || e.getSource()==b5)
        {b1.setVisible(false);
        
           k++;}
        }
        
        if(k==11)
        {
            if(score>=70)
         JOptionPane.showMessageDialog(null,"Excellent! your score is "+score );  
            else
            if(score<70 && score>50)
        JOptionPane.showMessageDialog(null,"Well Tried! your score is "+score );
            else
            JOptionPane.showMessageDialog(null,"Poor Performance! your score is "+score );
        }
         
        }
        
    
    public  void callQuizApp()
    {
        QuizApp obj=new QuizApp();
        obj.init();
        obj.properties();
        obj.positioning();
        obj.formatting();
        obj.add();
    }
}