package DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection connection;
	private static final String DB_URL;
	private static final String USER_NAME;
	private static final String PASSWORD;

	static {
		DB_URL = "jdbc:mysql://localhost:3306/acts_2024";
		USER_NAME = "root";
		PASSWORD = "Cdac";
	}

	public static Connection openConnection() throws SQLException {
		connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

		return connection;

	}

	public static void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
		System.out.println("db cn closed !");
	}

}
