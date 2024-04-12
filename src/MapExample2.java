import java.util.*;
public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new TreeMap<Integer,String>();
		m.put(102, "palak");
		m.put(1, "gagan");
		m.put(5, "sita");
		m.put(123, "nayan");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println("value "+m.get(5));
		System.out.println("remove"+ m.remove(123));
		for(Map.Entry<Integer,String> e:m.entrySet())
		{
			System.out.println(e.getValue() + "____" + e.getKey());
			
		}
		

	}

}
