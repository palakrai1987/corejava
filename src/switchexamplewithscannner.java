import java.util.*;

public class switchexamplewithscannner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i <= 3) {
			System.out.println("enetr your choice");
			int c = sc.nextInt();
			switch (c) {
			case 1:

				System.out.println("enterid");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name");
				String name = sc.nextLine();
				break;

			case 2:
				System.out.println("i am safe");
				break;

			default:
				i = 4;

			}

		}

	}
}
