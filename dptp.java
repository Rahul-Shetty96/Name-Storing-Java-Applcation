import java.sql.*;

class dptp{
	
	public static void main(String args[])
    {
		try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
		}
			  catch(ClassNotFoundException e){
			System.out.println("1ESAd");
		}
		try{
			  Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYS as sysdba","bestcoder091196");
			  
			  Statement s = c.createStatement();
			  
			  ResultSet rs = s.executeQuery("select rollno,name from list");
			  
			  while(rs.next())
              {
				  System.out.println(rs.getInt(1) +"   " + rs.getString(2));
			  }

			  rs.close();
			  s.close();
			  c.close();

		}
		catch(SQLException e){
			System.out.println(e);
		}
	}
}