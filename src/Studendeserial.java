import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
public class Studendeserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Studentexample s = new Studentexample(101,"palak");
		FileInputStream fis = new FileInputStream("objectsave.txt");
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Studentexample ob =(Studentexample)ois.readObject();
		System.out.println(ob.id + " -----"+ob.name);
		System.out.println("success");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
