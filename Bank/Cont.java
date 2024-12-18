package Bank;

import java.sql.*;

public class Cont {
    Connection connection;
    java.sql.Statement statement;
    public Cont(){
        try{

            
            connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankSystem", "root", "root123456");
            statement=connection.createStatement();
            

        }catch(Exception e)    {
            e.printStackTrace();
        }
    
    }
    
}
