import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestMetaDataDemo
{
	private static Scanner sc;

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
			System.out.println("----Result Set Meta Data----");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colCount=rsmd.getColumnCount();
			System.out.println("No of Colums :"+ colCount);
			for(int i=1;i<=colCount;i++)
			{
				System.out.println("Column Name : "+rsmd.getColumnName(i)+"; Column data Type : "+rsmd.getColumnTypeName(i));
				
			}
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
