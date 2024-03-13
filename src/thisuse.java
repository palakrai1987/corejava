
public class thisuse {
     int id;
	thisuse()
	{
		System.out.println("hello");
		
	}
   
	thisuse(int x)
	{
		this();
		id = x;
		System.out.println(id);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisuse ob = new thisuse(10);
		
	}

}
