class hero
{
	int i = 200;
	 void display(int x)
	{
	    System.out.println(x*x);
	}
	 void display(int x,int y)
		{
		    System.out.println(x*x + y*y);
		}
}
/*class hero1 extends hero
{
	void display(int x)
	{
		
         super.display(5,10);
	    System.out.println(x*x*x);
	}
}*/

public class finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero ob = new hero();
		ob.display(5);
		ob.display(10,20);

	}

}
