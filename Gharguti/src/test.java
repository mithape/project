import java.sql.Connection;
import java.sql.DriverManager;

public class test {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://databases.000webhost.com:3306/id5806190_gharguti","id5806190_gharguti","gharguti");
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
