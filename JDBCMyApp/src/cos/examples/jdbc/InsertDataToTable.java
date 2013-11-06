package cos.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataToTable {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("java.sql.Driver");
		System.out.println("Driver loading success!");

		Connection connection = null;

		connection = DriverManager.getConnection(CreatingConnection.url_company,
				CreatingConnection.name, CreatingConnection.password);
		System.out.println("DB Connection!");
		Statement statement = connection.createStatement();
		statement
				.executeUpdate("INSERT INTO companies (company) VALUES ('ITCompany')");
		statement
				.executeUpdate("INSERT INTO companies (company) VALUES ('PhoneCompany')");
		statement
				.executeUpdate("INSERT INTO companies (company) VALUES ('TeleCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('IT_TeleCompany', 'TeleCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('Accounting_TeleCompany', 'TeleCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('HR_TeleCompany', 'TeleCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('IT_PhoneCompany', 'PhoneCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('Accounting_PhoneCompany', 'PhoneCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('HR_PhoneCompany', 'PhoneCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('IT_ITCompany', 'ITCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('Accounting_ITCompany', 'ITCompany')");
		statement
				.executeUpdate("INSERT INTO departaments (departament, company) VALUES ('HR_ITCompany', 'ITCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Eric', 'IT_TeleCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Nick', 'Accounting_TeleCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Nika', 'HR_TeleCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Tom', 'IT_ITCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Tony', 'Accounting_ITCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Sonya', 'HR_ITCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Sasha', 'IT_PhoneCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Tanya', 'Accounting_PhoneCompany')");
		statement
				.executeUpdate("INSERT INTO workers (name, departament) VALUES ('Tina', 'HR_PhoneCompany')");
		connection.close();
		System.out.println("DB Disconnected.");

	}

}
