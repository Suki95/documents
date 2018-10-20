import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmpDeserDemo 
{

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try 
		{
			fis=new FileInputStream("EmpObjs.obj");
			ois=new ObjectInputStream(fis);
			Employee ee=(Employee)ois.readObject();
			System.out.println("Emp Info from file :"+ee);
		}
		catch (ClassNotFoundException | IOException e) 
		{
			e.printStackTrace();
		} 
		
	}

}
