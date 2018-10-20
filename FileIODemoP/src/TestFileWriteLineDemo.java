import java.io.*;

public class TestFileWriteLineDemo {

	public static void main(String[] args) 
	{
		File myFile=new File("D://Vyankateshprasad_Kulkarni//FileIODemoP//src//TestEmpReadDemo.java");
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try 
		{
			fr=new FileReader(myFile);
			br=new BufferedReader(fr);
			fw=new FileWriter("Myfile.txt");
			bw=new BufferedWriter(fw);
			String line=br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				bw.write(line);
				bw.flush();
				line=br.readLine();
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("All Data written in the file");
	}

}
