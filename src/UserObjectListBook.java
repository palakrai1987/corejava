import java.util.*;

class Book
{
	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	int bid;
	String bname;
	

}
public class UserObjectListBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> ob = new LinkedList<Book>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bookname to remove");
		String bname = sc.next();
		Book b1 = new Book(1,"geeta");
		Book b2 = new Book(2,"mahabharat");
		Book b3 = new Book(3,"bhagwat");
		ob.add(b1);
		ob.add(b2);
		ob.add(b3);
		/*for(Book b : ob)
		{
			System.out.println(b.getBid()+ " "+ b.getBname());
		}*/
		for(int i =0; i<ob.size();i++)
		{
			System.out.println(ob.get(i).getBid() + " " + ob.get(i).getBname());
		}
		System.out.println("updated value");
	    Book x = null;
	    boolean r = false;
	    for(int i = 0;i<ob.size();i++)
		{
	    	System.out.println("user" + bname + "----"+ ob.get(i).getBname());
	    	if(bname.equals(ob.get(i).getBname()))
	    	{
	    		x = ob.get(i);
	    		r = true;
	    		ob.remove(x);
	    	}
	    	else
	    	{
	    		System.out.println("not found");
	    	}
			/*System.out.println(b.getBid()+ " "+ b.getBname());
	    	if(r == true)
	    	{
	    		ob.remove(x);
	    	}*/
		}
	    
	System.out.println("updated value");	
		
	for(int i = 0;i<ob.size();i++)
	{
	   System.out.println(ob.get(i).getBid() + ""+ob.get(i).getBname());
	}
		
		
		
		
	   /* //ob.remove(bname);
	    System.out.println("updated value");
	    Book x = null;
	    boolean r = false;
	    for(Book b : ob)
		{
	    	System.out.println("user" + bname + "----"+ b.getBname());
	    	if(bname.equals(b.getBname()))
	    	{
	    		x = b;
	    		r = true;
	    		ob.remove(x);
	    	}
	    	else
	    	{
	    		System.out.println("not found");
	    	}
			System.out.println(b.getBid()+ " "+ b.getBname());
	    	if(r == true)
	    	{
	    		ob.remove(x);
	    	}
		}
	    
	    System.out.println("after deletion");
	    for(Book bnew : ob)
	    {
	    	System.out.println(bnew.getBid() +"  "+bnew.getBname());
	    	
	    }*/
		
		

	}

}
