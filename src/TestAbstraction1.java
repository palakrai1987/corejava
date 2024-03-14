abstract class Shape{
	int i;
	Shape(int i)
	{  this.i =i;
		System.out.println("palak");
	}
abstract void draw();

void display()
{
	System.out.println("displaying");
}
}  
class Circle extends Shape
{  Circle(int i)
	{
	    super(i);
	}
	void draw()
	{
		System.out.println("drawing circle");
	}
}
public class TestAbstraction1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		c.display();
		c.draw();
		System.out.println("i"+c.i);

	}

}
