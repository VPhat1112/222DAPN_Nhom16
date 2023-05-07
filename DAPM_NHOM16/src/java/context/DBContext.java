package context;


import java.sql.*;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
            String dbUrl = "jdbc:jtds:sqlserver://DESKTOP-PQBKC3N:1433/Nhom16_ThietBiXayDung;";
            String user="sa";
            String password="123";
            return DriverManager.getConnection(dbUrl,user,password);
    }   
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    
    
}
 