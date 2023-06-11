package arrays;

import java.sql.*;

public class arraytraining {

	public static void main(String args[]) throws SQLException {
		String sqlQuery="SELECT * FROM employees WHERE job LIKE '%java%'";
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:9999/webapp","root","asdsql456zxc123");  
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery(sqlQuery);
		rs.first();
		System.out.println("ID   | NAME   | JOB");
		System.out.println(rs.getString(1)+"     "+rs.getString(2)+"       "+rs.getString(3));
	}
}
