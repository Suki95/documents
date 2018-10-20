import java.util.regex.Pattern;

public class Employee 
{
	private String firstName;
	private String lastName;
	private Gender gender;
	private double phoneNumber; 
	public Employee() 
	{
		super();
	}
	public Employee(String firstName, String lastName, Gender gender, double phoneNumber) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	public double getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public Gender getGender() 
	{
		return gender;
	}
	public void setGender(Gender gender) 
	{
		this.gender = gender;
	}
	public boolean validateEmpFirstName(String empFirstName) throws EmployeeException 
	{
		String namePattern="[A-Z][a-z]{1,20}";
		if(Pattern.matches(namePattern, empFirstName))
		{
			return true;
		}
		else
		{
			throw new EmployeeException
			("Invalid Employee First Name. Should start with capital"
					+ " Only 20 Characters allowed");
		}
	}
	public boolean validateEmpLastName(String empLastName) throws EmployeeException 
	{
		String namePattern="[A-Z][a-z]{1,20}";
		if(Pattern.matches(namePattern, empLastName))
		{
			return true;
		}
		else
		{
			throw new EmployeeException
			("Invalid Employee Last Name. Should start with capital"
					+ " Only 20 Characters allowed");
		}
	}
	public void display(Employee emp)
	{
		System.out.println("\nPerson Details:");
		System.out.println("---------------");
		System.out.println("\nFirst Name: " + emp.getFirstName());
		System.out.println("Last Name: " + emp.getLastName());
		System.out.println("Gender: " + emp.getGender());
		System.out.println("Numb: " + emp.getPhoneNumber());
	}
}
