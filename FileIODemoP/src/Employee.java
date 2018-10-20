import java.io.Serializable;

public class Employee implements Serializable
{
	int empId;
	String empName;
	float empSal;
	
	public Employee()
	{
		
	}
	

	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
