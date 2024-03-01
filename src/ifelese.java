import java.util.*;

public class ifelese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char");
		char c = sc.next().charAt(0);
		if (c >= 'A' && c <= 'Z') {
			System.out.println("character is is capital");
		} else {
			System.out.println("lower case");
		}
		switch (c) {
		case 'A':
			System.out.println("inside A");
			break;
		case 'B':
			System.out.println("inside B");
			break;
			default:
				System.out.println("default");

		}

	}

}
