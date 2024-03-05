import java.util.*;
public class Array2dex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int a[][] = new int[2][2]; 
		int b[][] = {{1,2},{8,10}};
		//int c[] = {1,2,3};
		System.out.println("b array");
		for(int i = 0; i < b.length;i++)
		{
			for(int j = 0;j < b.length;j++)
			{
		         System.out.println(b[i][j]);
			}
			}
		
		for(int i = 0; i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				a[i][j]=sc.nextInt();
				if (i==j)
				{
				sum = sum + a[i][j];
				}
			}
		}
		System.out.println(sum);
		
		
		for(int i = 0; i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		

	}

}
