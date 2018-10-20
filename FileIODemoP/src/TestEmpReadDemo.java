import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEmpReadDemo
{

	public static void main(String[] args)
	{
		try
		{
		    InputStreamReader isr=new InputStreamReader(System.in);
		    BufferedReader br=new BufferedReader(isr);
		    System.out.println("enter Emp Id:");
		    int eid=Integer.parseInt(br.readLine());
		    System.out.println("Enter Emp Name:");
		    String ename=br.readLine();
		    System.out.println("Enter Emp Sal:");
		    float esal=Float.parseFloat(br.readLine());
		    System.out.println(eid+" : "+ename+" : "+esal);
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
	}
}