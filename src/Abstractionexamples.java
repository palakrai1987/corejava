abstract class shape
{
	void display()
	{
		System.out.println("displaying shape");
	}
	abstract void show();
	
}
class Circle extends shape
{
	void show()
	{
		System.out.println("circle");
	}
	
}
public class Abstractionexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.display();
		c.show();
		
	}

}
