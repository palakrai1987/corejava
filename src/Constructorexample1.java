import java.util.Scanner;

public class Constructorexample1 {
	//System.out.println("hello");
	
	int age;
	Constructorexample1(int age)
	{   this();
		this.age=age;
		System.out.println("age" + age);
	}
	
	
	Constructorexample1()
	{
		//this(age);
		Scanner sc = new Scanner(System.in);
		String name;
		int id ;
		System.out.println("enter name");
		name = sc.next();
		System.out.println("id");
	     id = sc.nextInt();
	     System.out.println("____________");
	     System.out.println("name"+name);
			System.out.println("id"+id);
			
	}

	public static void main(String[] args) {
		//// TODO Auto-generated method stub
		Constructorexample1 ob1 = new Constructorexample1(10);
		//Constructorexample1 ob = new Constructorexample1();
		

	}

}
