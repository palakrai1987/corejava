import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,String> m = new HashMap<Integer,String>();
      m.put(1,"palak");
      m.put(2,"nayan");
      m.put(3, "abc");
      m.put(4,"raja");
      System.out.println(m.remove(1));
      System.out.println(m);
      for(Map.Entry<Integer, String>  map: m.entrySet())
      {
    	  System.out.println(map.getValue() + ""+map.getKey());
      }
      System.out.println(m.keySet());
      System.out.println(m.values());
	}

}
