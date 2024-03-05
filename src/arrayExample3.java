import java.util.Arrays;

public class arrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,20,3,4};
		int b[]= {1,2,3,5};
		boolean x =Arrays.equals(a, b);
		int y=Arrays.binarySearch(a, 3);
		System.out.println("element is present at index"+y);
		Arrays.sort(a);
		for(int i : a)
		{
			System.out.println(i);
		}
	
		
		System.out.println(x);

	}

}
