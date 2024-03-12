import java.util.*;
public class methodsexample {
	Scanner sc = new Scanner(System.in);
	String name;
	int id ;
	void accept()
	{
		System.out.println("enter name");
		name = sc.next();
		
	     id = sc.nextInt();
	     
	}
	void display()
	{
		System.out.println("name"+name);
		System.out.println("id"+id);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsexample ob = new methodsexample();
		ob.accept();
		ob.display();
		
		
		

	}

}
