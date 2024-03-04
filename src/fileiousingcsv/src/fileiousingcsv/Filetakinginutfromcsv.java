package fileiousingcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filetakinginutfromcsv {

	public static void main(String[] args) {
		 String file = "src\\abc.csv";
		  BufferedReader reader = null;
		  String line = "";
		  
		  try {
		   reader = new BufferedReader(new FileReader(file));
		   while((line = reader.readLine()) != null) {
			   //System.out.println(line);
		    
		    String[] row = line.split(",");
		    //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
		//use this if your values already contain commas
		    for(String index : row) {
		     System.out.printf("%-10s", index);
		    }
		    System.out.println();
		   }
		  }
		  catch(Exception e) {
		   e.printStackTrace();
		  }
		  finally {
		   try {
		    reader.close();
		   } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		  }

	}

}
