import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> intList=new ArrayList(4);
		
		Integer i1=new Integer(40);
		Integer i2=new Integer(50);
		Integer i3=new Integer(20);
		Integer i4=new Integer(10);
		String str4=new String("Prasad");
		
		intList.add(i1);
		intList.add(i2);
		intList.add(i3);
		intList.add(i4);
		
		
		Iterator it=intList.iterator();
		while(it.hasNext())
		{
			Integer ii=(Integer) it.next();
			System.out.println("Entry :"+ ii);
		}

	}

}
