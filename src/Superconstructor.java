class Emp123
{
	int id;
	String name;
	Emp123(int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	
	}
class Emp456 extends Emp123
{
	float salary;
	Emp456(int id,String name,float salary)
	{
		super(id,name);
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(id + ""+ name +""+salary);
	}
	
	

}
public class Superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp456 ob = new Emp456(1,"palak",500);
		ob.display();

	}

}
