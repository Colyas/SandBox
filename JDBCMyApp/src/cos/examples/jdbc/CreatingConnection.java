package cos.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingConnection {
	
	static String url = "jdbc:postgresql://localhost:5432/";
	static String url_company = "jdbc:postgresql://localhost:5432/company";
	static String name = "postgres";
	static String password = "65536";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		String createDBQuery = "CREATE DATABASE company ENCODING = 'UTF8'";
		
		Class.forName("java.sql.Driver");
		System.out.println("Driver loading success!");

		Connection connection = null;
		
		connection = DriverManager
				.getConnection(url, name, password);
		System.out.println("DB Connection!");
		Statement statement = connection.createStatement();
		statement.executeUpdate(createDBQuery);
		connection.close();
		System.out.println("DB Disconnected.");

	}

}
