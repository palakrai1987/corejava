import java.io.*;


class buff
{  int age;
    float sal;
    String name;
	buff(String name , int age, float sal)
	{
		this.name=name;
		this.age = age;
		this.sal = sal;
	}
    public String toString()
    {
    	return name + age+ sal;
    }
    
   static void display(buff c[])
    {
    	for(int i = 0;i<c.length;i++)
		{
			System.out.println(c[i].age +c[i].name+c[i].sal);
			//System.out.println("****"+b);
		}	
    }
}
public class bufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		buff b[] = new buff[2];
		
		try
		{
			
			for(int i = 0; i<2;i++)
			{
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter name");
      String name = br.readLine();
      
      System.out.println("enetr age");
      int age = Integer.parseInt(br.readLine());
      
      System.out.println("enetr salary");
      float sal = Float.parseFloat(br.readLine());
      
     // System.out.println("name is"+name);
      
      
     /* System.out.println("name is"+name);
      System.out.println("age is"+age);
      System.out.println("salayis is"+sal);*/
      b[i] = new buff(name,age,sal);
      
			}
			
			/*for(int i = 0;i<2;i++)
			{
				System.out.println(b[i].age +b[i].name+b[i].sal);
				System.out.println("****"+b);
			}*/
			buff.display(b);
      
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
