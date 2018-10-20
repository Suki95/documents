import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetEmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Emp> empSet=new HashSet<Emp>();
		Emp e1=new Emp(112081,"Prasad",9000.0F);
		Emp e2=new Emp(112082,"Mrunmaye",9000.0F);
		Emp e3=new Emp(112083,"Falguni",9000.0F);
		Emp e4=new Emp(112084,"Samiksha",9000.0F);
		Emp e5=new Emp(112085,"Anuj",9000.0F);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		Iterator<Emp> itEmp=empSet.iterator();
		while(itEmp.hasNext())
		{
			System.out.println("...."+itEmp.next());
		}

	

	}

}
