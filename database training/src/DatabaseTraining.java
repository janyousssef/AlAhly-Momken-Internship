import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseTraining {

	public static void main(String[] args) throws Throwable {
		 try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:9999/testdb",
				"root", "asdsql456zxc123");
		PreparedStatement ps=con.prepareStatement("select * from images");  
		ResultSet rs=ps.executeQuery(); 
		rs.next();
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());
		con.close(); 
		FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");  
		fout.write(barr);  
	}catch (Exception e) {
		System.out.println(e);
	}
		 }

}
