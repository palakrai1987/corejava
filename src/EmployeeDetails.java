
public class EmployeeDetails {

	    public EmployeeDetails(int id, String name, Address1 a) {
		
		this.id = id;
		this.name = name;
		this.a = a;
	}
		int id;
	    String name;
	    Address1 a;
	    /*void display()
	    {
	    	System.out.println(id + " "+ name + a.city + " "+a.state);
	    }*/
	    
	    public String toString()
	    {
	    	return id+"*"+name+"*"+a.city+"*"+a.state;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address1 a1 = new Address1("vizag","A.P");
		Address1 a2 = new Address1("hyd","A.P");
		EmployeeDetails e1 = new EmployeeDetails(101,"palak",a1);
		EmployeeDetails e2 = new EmployeeDetails(102,"nayan",a2);
		System.out.println(e1.id+e1.name+e1.a.city+e1.a.state);
		//e1.display();
		//e2.display();
		System.out.println(e1);
		System.out.println(e2);

	}

}
