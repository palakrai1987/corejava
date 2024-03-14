class Emp1
{
	String name ="palak";
	void display()
	{
		System.out.println("i am in superclass");
	}
}
class Emp2 extends Emp1
{
	String name ="gagan";
	void show()
	{
		System.out.println(super.name);
	}
	void display()
	{
		super.display();
		System.out.println("i am in subclass");
	}
}

public class Superexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp2 ob = new Emp2();
		ob.show();
		ob.display();
	}

}
