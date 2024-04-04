import java.util.*;
public class ArrayListexamplefruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("bananna");
		al.add("Mango");
		al.add("kiwi");
		System.out.println(al);
		System.out.println("using for each");
		for(String x : al)
		{
			System.out.println(x);
		}
		System.out.println("using iterator");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("potato");
		al2.addAll(al);
		System.out.println(al2);
		System.out.println("final alist");
		ArrayList<String> al3 = new ArrayList<String>(al2);
		al3.add("oil");
		System.out.println(al3);
		al3.remove(1);
		System.out.println("after rmoving");
		System.out.println(al3.size());
		System.out.println("get invocation" + al3.get(0));
	 al3.set(1,"xyz");
	 System.out.println(al3);
	 al3.clear();
		
	 System.out.println(al3);
		

	}

}
