package javaapplicationwindow;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
public class JavaApplicationWindow implements ActionListener {
    //component declaration of main app window
    JFrame master;//the master frame
    JLabel heading;//main heading
    JPanel one,two;//panel in frame
    JLabel welcome;//the welcome label
    JButton b1,b2,b3,b4,b5,b6,b7,b8;//buttons for applications
    
    public void memory()//dynamic memory allocation
    {
        master=new JFrame();
        one=new JPanel();
        heading=new JLabel("Java Application Window");
        welcome=new JLabel("Welcome To The World Of Java Applications");
        ImageIcon img1=new ImageIcon("C:\\Users\\Dell\\Downloads\\Calculator-icon.png");
        ImageIcon img2 = new ImageIcon("C:\\Users\\Dell\\Downloads\\Address-book-icon.png");
        
        ImageIcon img3 = new ImageIcon("C:\\Users\\Dell\\Downloads\\unnamed.png");
        ImageIcon img4 = new ImageIcon("C:\\Users\\Dell\\Desktop\\JApps Project\\JApps\\bin\\com\\javatpoint\\wct.jpg");
        ImageIcon img5 = new ImageIcon("C:\\Users\\Dell\\Downloads\\icon128-2x.png");
        ImageIcon img6 = new ImageIcon("C:\\Users\\Dell\\Downloads\\biz.mtoy.blockpuzzle.revolution.png");
        ImageIcon img7 = new ImageIcon("C:\\Users\\Dell\\Downloads\\unnamed (1).png");
        b1=new JButton(img1);
        b2=new JButton(img2);
        b3=new JButton(img3);
        b4=new JButton(img4);
        b5=new JButton(img5);
        b6=new JButton(img6);
        b7=new JButton(img7);
        b8=new JButton();
        
    }
    public void properties()//to set the properties of components
    {
        
        Border border = BorderFactory.createLineBorder(Color.RED,10);
        one.setBorder(border);
        master.setSize(1250, 750);
        master.setVisible(true);
        master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        one.setSize(1200, 650);
        one.setLayout(null);
        master.add(one);
        b1.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b6.addActionListener(this);
        b2.addActionListener(this);
        b7.addActionListener(this);

    }
    public void setCoordinates()//to set the position of components
    {
        heading.setBounds(240, 5, 770, 100);
        welcome.setBounds(345, 90, 770, 30);
        b1.setBounds(60, 150, 250, 250);
        b2.setBounds(340, 150, 250, 250);
        b3.setBounds(625, 150, 250, 250);
        b6.setBounds(60, 425, 250, 250);
        b5.setBounds(340, 425, 250, 250);
        b4.setBounds(625, 425, 250, 250);
        b7.setBounds(915, 150, 250, 250);
        b8.setBounds(915, 425, 250, 250);
    }
    public void format()//formatting of components
    {
        b7.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b1.setBackground(Color.BLACK);
        master.setTitle("****Java Applications****");
        heading.setFont(new Font("Harlow Solid Italic",Font.BOLD,60));
        heading.setForeground(Color.BLUE);
        welcome.setFont(new Font("Times New Roman",Font.BOLD,25));
        welcome.setForeground(Color.RED);
        one.setBackground(Color.DARK_GRAY);
    }
    public void add()//to add components to the frame
    {
        one.add(heading);
        one.add(welcome);
        one.add(b1);
        one.add(b2);
        one.add(b3);
        one.add(b4);
        one.add(b5);
        one.add(b6);
        one.add(b7);
        one.add(b8);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            Calculator obj=new Calculator();
            obj.callCalculator();
        }
        if(e.getSource()==b5)
        {
            TemperatureConvertor obj=new TemperatureConvertor();
            obj.callTemperatureConvertor();
        }
        if(e.getSource()==b4)
        {
            WordCalculator obj=new WordCalculator();
            obj.callWordCalculator();
        }
        if(e.getSource()==b3)
        {
            QuizRules obj=new QuizRules();
            obj.callQuizRules();
        }
        if(e.getSource()==b6)
        {
            PuzzleRules obj=new PuzzleRules();
            obj.callPuzzleRules();
        }
        if(e.getSource()==b2)
        {
            AdressBookWindow obj=new AdressBookWindow();
            obj.callAdressBookWindow();
        }
        if(e.getSource()==b7)
        {
            QRCodeGenerator obj=new QRCodeGenerator();
            obj.callQRCodeGenerator();
        }

            }

    public static void main(String[] args)// the main function 
    {
        JavaApplicationWindow obj=new JavaApplicationWindow();
        obj.memory();
        obj.properties();
        obj.setCoordinates();
        obj.format();
        obj.add();
            
    }
    
}
