import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResulstSetDemo {

	public static void main(String[] args) {
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
				"root", "12345");
		
				//System.out.println("connected to database");
		
		
		String query = "select*from studentdata";
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next())
		{
		int rollNo = resultSet.getInt(1);
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString(3);
		int standard = resultSet.getInt(4);
		String grade = resultSet.getString(5);
		
		System.out.println("roll no " + rollNo);
		System.out.println("first name " + firstName);
		System.out.println("last name " + lastName);
		System.out.println("Standard " + standard);
		System.out.println("grade " + grade);
		System.out.println("**************************************************************");
			
			
		}
								
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
}
