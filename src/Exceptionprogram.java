
public class Exceptionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
		      //code that may raise exception  
			  /* int a[] = new int[5];
			   System.out.println(a[6]);
		      int data=100/0; 
		       a[6] = data;
		      System.out.println(data);*/
		      String s="abc";
		      String z = null;
		     // System.out.println(s.charAt(4));  //StringIndexOutOfBoundsException
		      System.out.println(z.length()) ;                           //NullPointerException 
		      int i=Integer.parseInt(s);//NumberFormatException  
		      
		 }
		
		/*catch(Exception e)
		{e.printStackTrace();}*/
		catch(NullPointerException e){System.out.println(e);} 
		catch(NumberFormatException e){System.out.println(e);} 
		
		catch(ArithmeticException e){System.out.println(e);} 
		catch(ArrayIndexOutOfBoundsException  e){System.out.println(e);} 
		finally
		{
			System.out.println("always executed");
		}
		
		
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
		
		
		
		

	}


