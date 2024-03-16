class mor
{
	void display(int x)
	{
		System.out.println(x*x);
	}
}
class mor1 extends mor
{
	void display(int x)
	{
		super.display(5);
		System.out.println(x*x*x);
	}
}
public class MOExample {

	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	int add(int a, int b)
	{
		return a+b;
	}
	String add(String a, String b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOExample ob = new MOExample();
		System.out.println(ob.add(10, 20));
		System.out.println(ob.add("p", "a"));
		int l =ob.add(10, 20, 30);
		System.out.println(l);
		 mor1 ob1 = new  mor1();
		 ob1.display(5);
		 

	}

}
