
public class Swappingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1= 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1 + " "+ n2 + " "); // 0 1 1 
		for (int i = 1; i<10;i++)
		{
			n3 = n1+n2;
			System.out.print(n3 + "  "); //1
			n1 = n2;
			n2=n3;
		}
		
		/*c = a;
		a = b;
         b =c;*/
		/*a = a+b;//30
		b = a-b;//30-20 = 10
		a = a-b;//30-10 =20
		
		System.out.println("a is "+a);
		System.out.println("b is :" +b);*/
		
		
		
		
		

	}

}
