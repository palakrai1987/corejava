import java.util.*;
public class Arraylisttoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(1);
		a1.add(15);
		a1.add(2);
		Collections.sort(a1);
		System.out.println("sorted" +a1);
		System.out.println("min" +Collections.min(a1));
	    System.out.println("max"+ Collections.max(a1));
	    Integer[] a  = a1.toArray(new Integer[0]);
	/*for(Integer x: a)
	{
		System.out.println(x);
	}*/
	    
	    Integer ob[] = new Integer[a1.size()];
	    for(int i = 0; i<ob.length;i++)
	    {
	    	ob[i] = a1.get(i);
	    }
	    
	    for(int i = 0; i<ob.length;i++)
	    {
	    	System.out.println("array" +ob[i]);
	    }
	    
	    
	    
	    
/*	Integer b1[] = new Integer[a1.size()];
	for (int i = 0; i<b1.length;i++)
	{
		b1[i] = a1.get(i);
	}
	for(Integer x: b1)
	{
		System.out.println(x);
	}
	 String fruit[] = {"apple","mango","banana"};
	 List<String> l = new ArrayList<String>();
	 for(String x : fruit)
	 {
		 l.add(x);
	 }*/
	
	  //System.out.println("list is"+l);
	}

}
