
public class operatorexample {
	int x = 10;
	static String cname = "xyz";

	void display() {
		System.out.println(x);
		// System.out.println(y);
	}

	void display2() {
		int y = 15;
		System.out.println(y);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operatorexample ob = new operatorexample();
		ob.display();
		
		
		int x = 10;
		int y =8;
		y = y--+--y+y--;//8+6+6
		System.out.println("post1:"+y);
		x = x--+--x+x--;//10+8+8
		System.out.println("post:"+x);
				
		System.out.println(cname);
		System.out.println(ob.x);
		// System.out.println(ob.y);
		ob.display2();
       int a = 8;//1000
       int b = 9;//1001
       int c = 8|9;
       int d = 8&9;
       int e = (b>a)?b:a;
       System.out.println("bitwise result :" + c + "biwise and"+d + "ternary"+e);
	}

}
