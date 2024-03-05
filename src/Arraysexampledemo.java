import java.util.Arrays;

public class Arraysexampledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,0,5,3,1,3,1,22,45,21};
		int b[]= {1,2,0,5,3,1,3,1,22,43,21};
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("_______");
		//Arrays.sort(a);
		
		/*for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
       int c=  Arrays.binarySearch(a, 45);
       System.out.println("index :"+c);
      boolean s = Arrays.equals(a, b);
      System.out.println("checking equality : " + s);
      
      if(a[0]==b[b.length-1])
      {
    	 System.out.println("equal"); 
      }
      else
      {
    	  System.out.println("not equal");
      }
	}

}
