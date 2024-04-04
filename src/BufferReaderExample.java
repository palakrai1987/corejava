import java.io.*;
public class BufferReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EmpArray a[] = new EmpArray[2];
		for(int i = 0; i<2;i++)
		{
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("Enter age");
		int age  = Integer.parseInt(br.readLine());
		    a[i] = new EmpArray(age,name);
		}
		for(int i = 0; i<2;i++)
		{
			System.out.println(a[i].age + a[i].name);
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
