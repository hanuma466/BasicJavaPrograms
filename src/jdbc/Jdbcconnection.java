package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("url", "username", "password");
		try {
		
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select * from table_name where cond=''");
		while(r.next()) {
			System.out.println(r.getInt(1)+"  "+r.getString(1)+"  "+r.getString(1));
		}
		
		}catch(SQLException sql) {
			System.out.println("SQL exception occured");
		}catch(Exception e) {
			System.out.println("exception occured..");
		}finally {
			c.close();
		}
	}

}
