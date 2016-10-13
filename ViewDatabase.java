package javaapplicationwindow;
import javax.swing.*;
import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class ViewDatabase {
    static final String USER = "root";
   static final String PASS = "123456";
   JTable table;
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
    public  void properties()
    {
          
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
public void fetch()
{
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rishabh",USER,PASS);
        String q="SELECT * FROM contacts ";
        ps=conn.prepareStatement(q);
        rs=ps.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch (Exception e)
    {
        
    }
    
    

   
}
    
    public static void main(String args[])
    {
        ViewDatabase obj=new ViewDatabase();
        obj.properties();
        obj.fetch();
    }
}
  
    

