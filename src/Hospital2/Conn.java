package Hospital2;

import java.sql.*;

public class Conn 
{
    Connection c;
    Statement s;
    ResultSet rs;
    Conn()
    {
        try
        {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","animesh123");
            s=c.createStatement();
            rs=s.executeQuery("select *from patient");
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}
