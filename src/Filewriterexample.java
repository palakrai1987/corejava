import java.io.*;

public class Filewriterexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		/*FileWriter fw = new FileWriter("yes.txt");
		fw.write(65);
		fw.write("hello world");
		//fw.close();*/
		FileReader fr = new FileReader("C:\\Users\\dk suryawanshi\\eclipse-workspace\\core java\\yes.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		//fw.close();
		fr.close();
		}
		catch(Exception e)
		{System.out.println(e);}

	}

}
