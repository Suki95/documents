import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReadLineDemo {

	public static void main(String[] args)
	{
		File myFile=new File("D://Vyankateshprasad_Kulkarni//FileIODemoP//src//TestEmpReadDemo.java");
		FileReader fr=null;
		BufferedReader br=null;
		try 
		{
			fr=new FileReader(myFile);
			br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line=br.readLine();
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}