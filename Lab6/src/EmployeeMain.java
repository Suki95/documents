import java.util.Scanner;

public class EmployeeMain 
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person's first name:");
		String firstName=sc.nextLine();
		System.out.println("Enter person's last name:");
		String lastName=sc.nextLine();
		System.out.println("Enter person's gender(M/F):");
		String gen=sc.next();
		Gender gender= Gender.valueOf(gen);
		System.out.println("Enter person's phone no.:");
		double num=sc.nextDouble();
		try 
		{
			if(emp.validateEmpFirstName(firstName))
			{
				if(emp.validateEmpLastName(lastName))
				{
					emp=new Employee(firstName,lastName,gender,num);
					emp.display(emp);
				}
			}
		} 
		catch (EmployeeException e) 
		{
			e.printStackTrace();
		}
	}
}
