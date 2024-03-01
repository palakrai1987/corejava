import java.util.*;
public class switchuserdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
	
		do
		{
			System.out.println("enete choice");
			int choice = sc.nextInt();
	    switch(choice)
	    {
	    case 1 :
	    	System.out.println("hello");
	    	break;
	    case 2:
	    	System.out.println("hiiii");
	    	break;
	    	default:
	    		System.out.println("Invalid");
	    }
	    System.out.println("press y to continue and n to discontinue");
	    char x = sc.next().charAt(0);
	     if(x=='n')
	     {
	    	 break;
	     }
	    		
		}while(ch=='y');
		

	}

}
