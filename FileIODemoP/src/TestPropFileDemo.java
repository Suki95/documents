import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestPropFileDemo 
{

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		Properties myProps=null;
		try
		{
	        fis=new FileInputStream("UserInfo.properties");
	        myProps=new Properties();
	        myProps.load(fis);
	        String unm=myProps.getProperty("userid");
	        String pwd=myProps.getProperty("password");
	        System.out.println("Credentials - Username:"+unm+" Password:"+pwd);
	        
	        System.out.println("***********");
	        
	        Set ks=myProps.keySet();
	        Iterator it=ks.iterator();
	        while(it.hasNext())
	        {
	        	System.out.println( " : "+it.next());
	        }
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
