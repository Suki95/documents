import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestEmpSelectDemo2
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pst= null;
		ResultSet rs=null;
		sc = new Scanner(System.in);
		System.out.println("Enter Minimum sal :");
		int minSal=sc.nextInt();
		System.out.println("Enter Maximum sal :");
		int maxSal=sc.nextInt();
		String query="SELECT * FROM emp_157737 where "
				+ " emp_sal>=? and emp_sal<=?";
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G","lab1btrg35","lab1boracle");
			pst=con.prepareStatement(query);
			pst.setInt(1, minSal);
			pst.setInt(2, maxSal);
			rs=pst.executeQuery();
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
