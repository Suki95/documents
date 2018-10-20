import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestEmpSerializationDemo 
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
		ObjectOutputStream oos=null;
		Employee e1=new Employee(eid,enm,esl);
		try 
		{
			fos=new FileOutputStream("EmpObjs.obj");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			System.out.println("Employee E1 is written in the file.");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
