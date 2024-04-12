import java.util.*;
public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		hs.add(18);
		hs.add(2);
		hs.add(38);
		System.out.println(hs);
		HashSet<Integer> hs1 = new HashSet<>();
		hs.add(18);
		hs.add(2);
		hs.add(38);
		System.out.println(hs);
		System.out.println(hs1.contains(18));
	      /* for(Integer x:hs)
	       {
			if (hs1.contains(x))
			{
				System.out.println(x + "is present in set 2 true");
			}else {System.out.println("false");}
	       }*/
		
		
		
		
		TreeSet ts = new TreeSet();
		ts.add(18);
		ts.add(2);
		ts.add(38);
		System.out.println(ts);

	}

}
