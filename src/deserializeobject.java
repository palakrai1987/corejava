import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectOutputStream;

public class deserializeobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("objectserial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeeSerial e = (EmployeeeSerial)ois.readObject();
		System.out.println(e.id+e.name);
		}catch(Exception e) {System.out.println(e);}
	}

}
