import java.io.*;
import java.util.*;

public class ReadReverseWrite {

	public static void main(String[] args) throws IOException 
	{
		File myFile=new File("D:\\Vyankateshprasad_Kulkarni\\Lab8\\ContentLab1B.txt");
		FileReader fr=null;
		BufferedReader br=null;
		String line=null;
		fr=new FileReader(myFile);
		br=new BufferedReader(fr);
		line=br.readLine();
		System.out.println(line);
		String reverse=null;
		System.out.println(line.length());
		for(int i=(line.length()-1);i>=0;i--)
		{
		    reverse=reverse+line.charAt(i);
		}
		System.out.println(reverse);
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try
		{
		   fos=new FileOutputStream("ContentLab1B.txt");
		   dos=new DataOutputStream(fos);
		   dos.writeUTF(reverse);
		   System.out.println("Reverse Content written in the file");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
