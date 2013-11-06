package cos.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		String createCompanyTableQuery = "CREATE TABLE companies (id serial, company varchar(80) primary key)";
		String createDepartamentTableQuery = "CREATE TABLE departaments (id serial, departament varchar(80) primary key, company varchar(80) references companies)";
		String createWorkerTableQuery = "CREATE TABLE workers (id serial, name varchar(80), departament varchar(80) references departaments)";
		Class.forName("java.sql.Driver");
		System.out.println("Driver loading success!");

		Connection connection = null;

		connection = DriverManager.getConnection(CreatingConnection.url_company,
				CreatingConnection.name, CreatingConnection.password);
		System.out.println("DB Connection!");
		Statement statement = connection.createStatement();
		statement.executeUpdate(createCompanyTableQuery);
		statement.executeUpdate(createDepartamentTableQuery);
		statement.executeUpdate(createWorkerTableQuery);
		connection.close();
		System.out.println("DB Disconnected.");

	}

}
