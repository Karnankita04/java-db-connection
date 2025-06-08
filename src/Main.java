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
        String sql = "SELECT * FROM Student\n" +
                "WHERE id = 2;";

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        System.out.println("Statement is created");

        ResultSet rs = st.executeQuery(sql); // to fetch data (executeQuery)
        System.out.println(rs.next());

        con.close();
        System.out.println("Connection closed");




    }
}
