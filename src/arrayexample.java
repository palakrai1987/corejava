import java.util.*;
public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		for (int i = 0; i<2; i++)
		{
	       for(int j = 0; j<2; j++)
	       {
	    	   a[i][j] = sc.nextInt();
	       }
		}
		
		for (int i = 0; i<2; i++)
		{
	       for(int j = 0; j<2; j++)
	       {
	    	   System.out.print(a[i][j]);
	       }
	       System.out.println();
		}
		
		for (int i = 0; i<2; i++)
		{
	       for(int j = 0; j<2; j++)
	       {
	    	   System.out.print(a[j][i]);
	       }
	       System.out.println();
		}
		
		
		/*for (int i = 0; i<2; i++)
		{
			int col_sum = 0;
			int row_sum = 0;
	       for(int j = 0; j<2; j++)
	       {
	    	   System.out.print(a[i][j]);
	    	   sum = sum + a[i][j];
	    	   row_sum = row_sum + a[i][j];
	    	   col_sum = col_sum +a[j][i];
	       }
	       System.out.println();

			 System.out.println("row sum is "  + row_sum);
			 System.out.println("col sum is "  + col_sum);
				
			
		}*/
		
		// System.out.println("sum is "  + sum);

	}

}
