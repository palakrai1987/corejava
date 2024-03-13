
public class Constructorexamples {
	int eid;
	String name;
	
	Constructorexamples()
	{
		System.out.println("hello");
	}
	Constructorexamples()
	{
		System.out.println("world");
	}
	
	 Constructorexamples(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
	}
	 Constructorexamples(String y,int i)
		{
			this.eid = i;
			this.name = y;
		}
	 
	void display()
	{
		System.out.println(eid +" " + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexamples ob = new Constructorexamples(1,"abc");
		ob.display();
		
		Constructorexamples ob2 = new Constructorexamples("abcd",3);
		ob2.display();
		
		Constructorexamples ob1 = new Constructorexamples(2,"def");
		ob1.display();

	}

}
