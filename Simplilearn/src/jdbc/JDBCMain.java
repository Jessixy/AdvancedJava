package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {

    public static void main(String[] args) throws SQLException {
        System.out.println("JDBC Demo");
        jdbcConnection();
    }

    static void jdbcConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost/simplylearndb";
        String user = "postgres";
        String password = "admin";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgresDB");
            if( conn != null) {
                addStudent(conn);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

    }

    static void addStudent (Connection conn) throws SQLException {

        int rollno = 1;
        String name = "John Doe";
        int age = 42;

        try {
            String sql = "INSERT INTO student (rollno, name, age) VALUES (" + rollno + ", '" + name + "', " + age + ")";

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("Inserted Successfully");
            } else {
                System.out.println("Insertion failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }



}
