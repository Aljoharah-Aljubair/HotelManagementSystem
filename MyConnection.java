
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MyConnection {
  
    
    public static Connection getConnection(){
       Connection con = null;
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //com.mysql.cj.jdbc.Driver
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","123456");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
}
