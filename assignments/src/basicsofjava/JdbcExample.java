package basicsofjava;
import java.sql.*;

public class JdbcExample {

    // JDBC URL, username, and password of MySQL server

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Atharv@1316";

    public static void main(String[] args) {
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

            // Step 2: Creating a Statement
            try (Statement statement = connection.createStatement()) {

                // Step 3: Executing a Query
                String query = "SELECT * FROM users";
                try (ResultSet resultSet = statement.executeQuery(query)) {

                    // Step 4: Processing the ResultSet
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String username = resultSet.getString("username");
                        String email = resultSet.getString("email");

                        System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
