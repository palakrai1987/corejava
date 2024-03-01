import java.util.*;
public class UserInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =1 ; i<=2; i++)
		{
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();*/
		System.out.println("Enter gender");
		char gender= sc.next().charAt(0);
		//System.out.println("name is " + name +" "+ "age is " + age +"  "+"gender"+gender);
		
		switch(gender)
		{
		case 'f': System.out.println("female");
			      break;
		case 'm': System.out.println("male");
	              break;
	              default: System.out.println("transgenderf");
		}
		
		
		}
		

	}

}
