
public class EmployeeNew {
	
	public EmployeeNew(String name, Address a) {
		
		this.name = name;
		this.a = a;
	}

	String name;
	Address a;
     void display()
     {
    	 System.out.println(name + a.city + a.state);
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("vizag","Ap");
		Address a2 = new Address("hyd","Ap");
		EmployeeNew e1 = new EmployeeNew("palak",a1);
		EmployeeNew e2 = new EmployeeNew("gagan",a2);
		e1.display();
		e2.display();
	}

}
