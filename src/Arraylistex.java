import java.util.*;
public class Arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("a");
		ob.add("b");
		
		ArrayList<String> ob1 = new ArrayList<String>(ob);
		ob1.add("c");
		System.out.println(ob1);
		
		ArrayList<String> ob2 = new ArrayList<String>();
		ob2.add("r");
		ob2.addAll(1, ob1);
		System.out.println(ob2);
		Iterator itr = ob2.iterator();
		System.out.println("using iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("using for each");
         for(String x:ob2)
         {
        	 System.out.println(x);
         }
         
     	ArrayList<Integer> x = new ArrayList<Integer>(); 
     	x.add(1);
     	x.add(2);
     	x.add(3);
     	System.out.println("previous");
     ListIterator litr = x.listIterator(x.size());
     while(litr.hasPrevious())
     {
    	 System.out.println(litr.previous());
     }
         
         
}}
