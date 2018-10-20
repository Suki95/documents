import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long, String> directory= new HashMap<Long,String>();
		directory.put(9881222018L, "Prasad");
		directory.put(9876554115L, "Mrunmaye");
		directory.put(6128516561L, "Sami");
		directory.put(8648613515L, "falguni");
		directory.put(1869685461L, "Anuuj");
		System.out.println(directory);
		System.out.println("******Print Entries******");
		Set<Map.Entry<Long,String>> mapSet=directory.entrySet();
		Iterator<Map.Entry<Long,String>> it=mapSet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Long, String> entry=it.next();
			System.out.println("Key :"+entry.getKey()+"Name: "+entry.getValue());
						
		}
		System.out.println("******Print Keys******");
		Set<Long> kSet=directory.keySet();
		Iterator<Long> itk=kSet.iterator();
		while(itk.hasNext())
		{
			Long key=itk.next();
			System.out.println("Key :"+key);
						
		}
		System.out.println("******Print Values******");
		Collection<String> valueSet= directory.values();
		Iterator<String> iterator=valueSet.iterator();
		while(iterator.hasNext())
		{
			String ent=iterator.next();
			System.out.println("Values :"+ent);
						
		}
	}

}
