import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
			
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
			"root", "12345");
	
	
	//System.out.println("connected to database");
			
	Statement statement = connection.createStatement();//method
	String query= "insert into studentdata values(105,'amar', 'verma',5,'c+')";//query
	
	int val= statement.executeUpdate(query); // to execute query
	
	if (val>0)
		System.out.println("record inserted");
	else
		System.out.println("record not inserte");
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}}	
	
	
	
	
	
	

