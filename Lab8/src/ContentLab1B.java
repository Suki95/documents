import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ContentLab1B
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Content in file:");
		String data=sc.nextLine();
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try
		{
		   fos=new FileOutputStream("ContentLab1B.txt");
		   dos=new DataOutputStream(fos);
		   dos.writeUTF(data);
		   System.out.println("All info written in the file.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
