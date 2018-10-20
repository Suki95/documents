import java.sql.*;

public class TestEmpSelectDemo 
{

	public static void main(String[] args)
	{
		Connection con=null;
		Statement st= null;
		ResultSet rs=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G","lab1btrg35","lab1boracle");
			st=con.createStatement();
			rs=st.executeQuery("SELECT * FROM emp_157737");
			while(rs.next())
			{
			    System.out.println("Employee Id : "+rs.getInt("emp_Id")+", Employee Name : "+rs.getString("emp_name")+", Employee Salary : "+rs.getInt("emp_sal"));
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
