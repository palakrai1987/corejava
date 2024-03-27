
public class throwkeyworduse {
	
	void validateage(int age) throws ArithmeticException
	{
		if(age <18)
		{
		throw new ArithmeticException("invalid age less tha 18");
		}
		else {System.out.println("valid age");}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		throwkeyworduse ob = new throwkeyworduse();
		try {
		ob.validateage(16);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("terminate here");

	}

}
