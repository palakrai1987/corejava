
public class throwkeyword {
	
	void validate(int age) throws ArithmeticException
	{
		if(age<18)
		{
		throw new ArithmeticException("i am exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwkeyword ob = new throwkeyword();
		try {
		ob.validate(10);
		}catch(Exception e)
		{System.out.println(e.getMessage());}
		System.out.println("rest of the code");
	}

}
