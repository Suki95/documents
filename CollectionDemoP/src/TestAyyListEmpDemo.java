import java.util.ArrayList;
import java.util.Iterator;

public class TestAyyListEmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> empList=new ArrayList<Emp>();
		Emp e1=new Emp(112081,"Prasad",9000.0F);
		Emp e2=new Emp(112082,"Mrunmaye",8000.0F);
		Emp e3=new Emp(112083,"Falguni",7000.0F);
		Emp e4=new Emp(112084,"Samiksha",6000.0F);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Iterator<Emp> itEmp=empList.iterator();
		while(itEmp.hasNext())
		{
			System.out.println("...."+itEmp.next());
		}

	

}
}
