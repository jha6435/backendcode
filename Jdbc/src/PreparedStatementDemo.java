import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
				"root", "12345");
		
				//System.out.println("connected to database");
		
		String query= "insert into studentdata values(?,?,?,?,?)";
		
		PreparedStatement preparedStatement= connection.prepareStatement(query); //obj creatation
		
		preparedStatement.setInt(1, 112);
		preparedStatement.setString(2, "Ranveer");		// query 
		preparedStatement.setString(3, "Singh");
		preparedStatement.setInt(4, 12);
		preparedStatement.setString(5, "b+");
		
		int val= preparedStatement.executeUpdate();
		if(val>0)
			System.out.println("record inserted");
		else
			System.out.println("record not inserted");
	
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
}
