import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Filereaderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{   
			  File file = new File("javaFile1234.txt");  
			 file.createNewFile();
			  
			  
			  
			  FileReader fr=new FileReader(file);    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
				
			  
	           FileWriter fw=new FileWriter("fr.txt");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    

	}


