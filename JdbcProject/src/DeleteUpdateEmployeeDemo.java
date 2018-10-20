import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUpdateEmployeeDemo 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		Connection con=null;
		PreparedStatement pst=null;
		Statement st= null;
		ResultSet rs=null;
		ResultSet rs1=null;
		System.out.println("Enter \n1. Delete record \n2. Update Record");
		int i=sc.nextInt();
		int id=0;
		switch(i)
		{
		case 1:
			System.out.println("Enter Id no to be deleted");
			id=sc.nextInt();
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G","lab1btrg35","lab1boracle");
				String deleteQuery="DELETE FROM emp_157737 WHERE emp_id="+id;
				String query="SELECT * FROM emp_157737 WHERE emp_id="+id;
				st=con.createStatement();
				rs=st.executeQuery(query);
				rs.next();
				System.out.println("Employee Id : "+rs.getInt("emp_Id")+", Employee Name : "+rs.getString("emp_name")+", Employee Salary : "+rs.getInt("emp_sal"));
				pst=con.prepareStatement(deleteQuery);
				rs1=pst.executeQuery();
			} 
			catch (ClassNotFoundException | SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter Id no to be updated");
			id=sc.nextInt();
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G","lab1btrg35","lab1boracle");
			}
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			} 

		}
	}

}
