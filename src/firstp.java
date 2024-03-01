
public class firstp {

	static String schoolname = "Abc";
       void m1(int j)
       {
    	
    	   System.out.println(j);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		int g = 10;
		int h = 15;
		int age = 15;
		System.out.println("palak");
		System.out.printf("%d %10s %15S %-15s is my age", age, "palak", "gaurik", "nayan");
		int above = -98765;
		long below = 54321L;

		a = g + h;
		System.out.println(a);
		a = g - h;
		System.out.println(a);
		System.out.println(schoolname);
		firstp p = new firstp();
		p.m1(10);
		int l= 10;
		System.out.println(l++);
		int x = 8;
		int y =9;
		int z = x|y;
		int m = x&y;
		int o = x<<3;
		int t=5;
		t +=2;
		System.out.println(t);
		
		System.out.println(z + m);
		System.out.println(o);
		int min=(x<y)?x:y;  
		System.out.println(min);  
		
		
		
		

	}

}
