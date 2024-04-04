import java.io.*;
public class StudentSerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Studentexample s = new Studentexample(102,"nayan");
		FileOutputStream fos = new FileOutputStream("objectsave.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(s);
		System.out.println("success");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
