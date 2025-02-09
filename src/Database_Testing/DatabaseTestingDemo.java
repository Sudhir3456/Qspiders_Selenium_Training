package Database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;     // change the databse and table
import java.sql.ResultSet;

public class DatabaseTestingDemo {
	

	// Connection object
	static Connection con = null;
	// Statement Object
	private static java.sql.Statement stmt;
	// Constant for Database Url
	public static String url = "Jdbc:mysql://localhost:3306/student_manage";
	// Constant for Database User_name
	public static String user = "root";
	// Constant for Database password
	public static String password = "Sudhir@0108";

	// @BeforeTest
	public void setup() throws Exception {
		try {
			// make the database connection
			String dbClass = "com.mysql.cj.jdbc.Driver";
			Class.forName(dbClass).newInstance();

			// get Connection to DB
			Connection con = DriverManager.getConnection(url, user, password);

			// Statement object to send the Sql Statement to the Database
			stmt = con.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//@Test
	public void test() {
		try {
			String query = "select * from student_manage";
			// Get the contents of userinfo table from DB
			ResultSet res = stmt.executeQuery(query);

			// print the result untill all the records are printed res.next() returns true
			// if there is any next record else return false
			while (res.next()) {
				System.out.println("  " + res.getString(1));
				System.out.println("   " + res.getString(2));
				System.out.println("   " + res.getString(3));
				System.out.println("   " + res.getString(4));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// @AfterTest
	public void tearDown() throws Exception {
		if (con != null) {
			con.close();
		}
	}

}