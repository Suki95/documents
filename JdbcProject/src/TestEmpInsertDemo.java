import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestEmpInsertDemo 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Emp Id :");
		int empId=sc.nextInt();
		System.out.println("Enter Emp Name :");
		String empName=sc.next();
		System.out.println("Enter Emp Sal :");
		int empSal=sc.nextInt();
		String insertQuery="INSERT INTO emp_157737 VALUES(?,?,?)";
		Connection con=null;
		PreparedStatement pst=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G","lab1btrg35","lab1boracle");
			pst=con.prepareStatement(insertQuery);
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setInt(3, empSal);
			
			int noOfRecAffected=pst.executeUpdate();
			System.out.println(noOfRecAffected+"Record is Inserted in the table.");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
