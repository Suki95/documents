import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PersonProps 
{
	FileOutputStream fos=null;
	Properties PersonInfo=null;
	Scanner sc=new Scanner(System.in);
	String name=null;
	String idNo=null;
	String address=null;
	FileInputStream fis=null;
	Properties PersonProp=null;
	public PersonProps()
	{
		System.out.println("Enter the name of the person :");
		name=sc.nextLine();
		
		System.out.println("Enter the id proof number of the person :");
		idNo=sc.nextLine();
		
		System.out.println("Enter the address :");
		address=sc.nextLine();
	}
	public void writePersonProps()
	{
		try
		{
			fos=new FileOutputStream("PersonProps.properties");
			PersonInfo=new Properties();
			PersonInfo.setProperty("NameOfThePerson:",name);
			PersonInfo.setProperty("IdProofNumberOfThePerson:" , idNo);
			PersonInfo.setProperty("AddressOfThePerson:" , address);
			PersonInfo.store(fos, "This is Person's Information");
			System.out.println("Data is written in the file.");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}
	public void readPersonProps()
	{
		try
		{			
			fis=new FileInputStream("PersonProps.properties");
	        PersonProp=new Properties();
	        PersonProp.load(fis);
	        String nameOfPerson=PersonProp.getProperty("NameOfThePerson:");
	        String idProofNumber=PersonProp.getProperty("IdProofNumberOfThePerson:");
	        String addressOfPerson=PersonProp.getProperty("AddressOfThePerson:");
	        System.out.println("The "+PersonProp);
	        System.out.println("Credentials - Name:"+nameOfPerson+" IDProof Number:"+idProofNumber+" Address:"+addressOfPerson);
	        
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		PersonProps person1=new PersonProps();
		person1.writePersonProps();
		person1.readPersonProps();		
	}

}
