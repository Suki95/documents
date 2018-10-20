import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> intSet= new TreeSet<Integer>();
		Integer i1=new Integer(40);
		Integer i2=new Integer(30);
		Integer i3=new Integer(20);
		Integer i4=new Integer(10);
		Integer i5=new Integer(36);
		Integer i6=new Integer(5);
		
		intSet.add(i1);
		intSet.add(i2);
		intSet.add(i3);
		intSet.add(i4);
		intSet.add(i5);
		intSet.add(i6);
		
		Iterator it=intSet.iterator();
		while(it.hasNext())
		{
			Integer ii=(Integer) it.next();
			System.out.println("Entry :"+ ii);
		}

	}

}
