interface hero123
{
	String x = "abc";
	void show();
	int y = 10;

}
interface hero345
{
	void show();
	void print();
	int y = 20;
}
class heroine123 implements hero123,hero345
{
public void show()
	{
	    System.out.println("i am inside class hero123");	
	}
public void print()
{
	System.out.println("i am inside class hero345");
	System.out.println(hero123.y + hero345.y);
}

}

public class interfaceexample123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		heroine123 ob1 = new heroine123();
		ob1.show();
		ob1.print();

	}

}
