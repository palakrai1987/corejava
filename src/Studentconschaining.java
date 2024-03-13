
public class Studentconschaining {
	int id;
	String name;
	int fees;
	
	Studentconschaining(int id,String name)
	{
		this.id =id;
		this.name = name;
	}
	Studentconschaining(int id,String name,int fees)
	{
		this(id,name); //constructor chaining
		this.fees = fees;
	}
	
	void display()
	{
		System.out.println(id + " "+ name+ " "+fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Studentconschaining ob = new Studentconschaining(101,"palak");
		ob.display();*/
		Studentconschaining ob1 = new Studentconschaining(101,"palak",500);
		ob1.display();
		
		
		

	}

}
