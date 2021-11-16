package Day16;

import java.sql.*;

public class DML {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //MYSQL DATABASE
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningdb", "root", "Hello@12345");
        if(con!=null){
            System.out.println("Connection is established");
        }else{
            System.out.println("Connection is not established");
        }

        Statement stmt = con.createStatement();
        stmt.executeUpdate("update  learningdb.emp  set empName='Rajesh' where empName='Abi'");

        con.close();

    }

}
