package cos.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTables {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("java.sql.Driver");
		System.out.println("Driver loading success!");

		Connection connection = null;

		connection = DriverManager.getConnection(CreatingConnection.url_company,
				CreatingConnection.name, CreatingConnection.password);
		System.out.println("DB Connection!");
		Statement statement = connection.createStatement();
		statement.executeUpdate("DROP TABLE workers");
		statement.executeUpdate("DROP TABLE departaments");
		statement.executeUpdate("DROP TABLE companies");
		connection.close();
		System.out.println("DB Disconnected.");

	}

}
