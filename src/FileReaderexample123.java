import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderexample123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{   
			  File file = new File("javaFile123456.txt");  
			// file.createNewFile();
			  
			  FileWriter fw=new FileWriter(file);    
	           fw.write("Welcome to javaTpoint123.");    
	           fw.close();
			  
			  FileReader fr=new FileReader(file);    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
				
			  
	               
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    

	}


