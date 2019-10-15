/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Rolando Andre
 */
public class Conection {
    
    public static Connection getConnection(){
        Connection conect=null;
        try {
          String connectionUrl = "jdbc:sqlserver://localhost;database=Software;user=Rolando;password=timbersaw123";
          //String connectionUrl2="jdbc:sqlserver://localhost;databaseName=Software","Rolando","timbersaw123"
          conect = DriverManager.getConnection(connectionUrl);
          
          //System.out.println("Conectado.");
        } 
        catch (SQLException ex) 
        {
          System.out.println("Error."+ex.getMessage());
        }
        return conect;
    }
    
    public static Connection getConnection2(){
        Connection cn=null;
        String url="jdbc:sqlserver://yousqlserver.database.windows.net:1433;"
                + "database=software;"
                + "user=azureuser@yousqlserver;"
                + "password=Rolandos$;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=(Connection) DriverManager.getConnection(url);
            System.out.println("Conexión establecida");
        }catch(Exception ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        return cn;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
            
}
