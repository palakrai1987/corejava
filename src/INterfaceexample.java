interface Employee1234
{
	  String company = "logistics"; 
	  // by default static and final
	  int calsal(); // by deafult abstract
	  void display();
	  int i = 10;

}
interface Address1234
{
	String state = "A.p.";
	void display();
    int i = 30;
}
class EmployeeAddressCompany implements Employee1234,Address1234
{
public int calsal()
	{
	     int sal = 1000;
		return sal;
	}
public void display()
{
	System.out.println("stae is"+state);
	int z = Employee1234.i+Address1234.i;
	System.out.println(z);
}

}
public class INterfaceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee1234 	 a = new EmployeeAddressCompany();
		//a.display();
	System.out.println(a.calsal());
	Address1234 b = new EmployeeAddressCompany();
	b.display();
		

	}

}
