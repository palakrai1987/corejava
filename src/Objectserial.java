import java.io.*;
public class Objectserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeeSerial ob = new EmployeeeSerial(101,"palak");
		FileOutputStream fos = new FileOutputStream("objectserial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);
		System.out.println("success");
		}catch(Exception e)
		{
		   System.out.println(e);	
		}

	}

}
