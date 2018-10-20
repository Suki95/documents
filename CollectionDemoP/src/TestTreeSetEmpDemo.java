import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSetEmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Emp> empSet=new TreeSet<Emp>();
		Emp e1=new Emp(112081,"Prasad",9000.0F);
		Emp e2=new Emp(112082,"Mrunmaye",9000.0F);
		Emp e3=new Emp(112083,"Falguni",9000.0F);
		Emp e4=new Emp(112084,"Samiksha",9000.0F);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		
		Iterator<Emp> it=empSet.iterator();
		while(it.hasNext())
		{
			System.out.println("Entry:"+it.next());
		}

	}

}
