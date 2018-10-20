import java.util.Scanner;


public class Emp implements Comparable<Emp>{
	int empId;
	String empName;
	float empSal;
	public Emp()
	{
		
	}
	public Emp(int empId, String empName, float empSal)
	{
		super();
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	@Override 
	public String toString() {
		return "Emplyee [empId="+ empId+ ", empName="+ empName+", empSal="+ empSal+ "]";
		
	}
	public int getEmpId() {
	return empId;
	}
	public void setEmpId(int empId){
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empName){
		this.empSal=empSal;
	}
	@Override
	public boolean equals(Object obj) {
		Emp ee=(Emp)obj;
		if(this.empId==ee.empId)
		{
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode()
	{
		return empId;
	}
	@Override
	public int compareTo(Emp ee) {
		// TODO Auto-generated method stub
		if(this.empId<ee.empId)
		{
			return -1;
		}
		else {
		return 0;}
	}
	

}
