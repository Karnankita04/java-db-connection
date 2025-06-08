import org.postgresql.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*
        Steps
        1. Import packages
        2. load and register
        3. create connection
        4. create statement
        5. execute statement
        6. process the result
         */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String password = "Ankitakarn";
        String sql = "SELECT * FROM Student";

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        System.out.println("Statement is created");

        ResultSet rs = st.executeQuery(sql); // to fetch data (executeQuery)

//        rs.next();
//        String name = rs.getString("name");
//        System.out.println("Name of a student is : " + name);

        while(rs.next()){
            System.out.print(rs.getInt("id") + " - ");
            System.out.print(rs.getString("name") + " - ");
            System.out.println(rs.getInt("age"));

        }

        con.close();
        System.out.println("Connection closed");
    }
}
