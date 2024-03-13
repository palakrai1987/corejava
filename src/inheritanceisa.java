
class A
{
	int a = 100;
	void m1()
	{
		System.out.println("inside a");
	}
}
class B extends A
{
	int b = 200;
	void m2()
	{
		System.out.println("inside b");
	}
	
}
class c extends A
{
	int c = 300;
	void m3()
	{
		System.out.println("inside c");
	}
	
}

public class inheritanceisa 
{
     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 B ob = new B();
    	 ob.m1();
    	 ob.m2();
    	 System.out.println(ob.a +" ----"+ ob.b);
    	 c ob3 = new c();
    	 ob3.m3();
    	 ob3.m1();

	}

}
