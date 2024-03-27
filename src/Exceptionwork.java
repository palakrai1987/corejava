
public class Exceptionwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		try {
			//String s = null;
			//System.out.println(s.length());
			String x = "abc";
			System.out.println(x.charAt(3));
			int i = Integer.parseInt(x);
			System.out.println(x);
			//int a[] = new int[6];
			//System.out.println(a[6]);
		// a[6] = 100/0;
		// System.out.println(d);
			
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally
		{
			System.out.println("always excuted");
		}
		 
		System.out.println("hello");
		

	}

}
