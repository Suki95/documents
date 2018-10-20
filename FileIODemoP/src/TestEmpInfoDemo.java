import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestEmpInfoDemo
{

	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Emp Id:");
		int eid=sc.nextInt();
		System.out.println("Enter Emp Name:");
		String enm=sc.next();
		System.out.println("Enter Emp Sal:");
		float esl=sc.nextFloat();
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try
		{
		   fos=new FileOutputStream("EmpInfo.txt");
		   dos=new DataOutputStream(fos);
		   dos.writeInt(eid);
		   dos.writeUTF(enm);
		   dos.writeFloat(esl);
		   System.out.println("All info written in the file.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
