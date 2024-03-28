import java.io.*;

public class fisfos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		try 
		{
			// FileOutputStream fout=new FileOutputStream("testingnotepad.txt");
			 FileInputStream fis = new FileInputStream("C:\\Users\\dk suryawanshi\\eclipse-workspace\\core java\\testingnotepad.txt");
			 while (( i = fis.read())!= -1)
			 {
				 System.out.print((char)i);
			 }
			 
            // fout.write(67); 
			 //String s = "write in destination";
			// byte b[]= s.getBytes();
			// fout.write(b);
			 
			 
             //fout.close();    
            // System.out.println("success...");  
			 fis.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
