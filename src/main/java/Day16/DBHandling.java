package Day16;

import java.sql.*;

public class DBHandling {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //MYSQL DATABASE
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningdb", "root", "Hello@12345");

            if (con != null) {
                System.out.println("Connection is established");
            } else {
                System.out.println("Connection is not established");
            }

            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("select * from learningdb.emp");

            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();


            while (result.next()) {

                for (int iCol = 1; iCol <= columnCount; iCol++) {
                    String columnName = metaData.getColumnLabel(iCol);
                    String rowValue = result.getString(iCol);
                    System.out.println(columnName + "<<<<>>>>" + rowValue);
                }
            }
        }catch(Exception e){
            System.out.println("Exeption is " + e.toString());
        }finally {
            if(con!=null && !con.isClosed()) {
                System.out.println("Connection is closed");
                con.close();
            }
        }


    }

}
