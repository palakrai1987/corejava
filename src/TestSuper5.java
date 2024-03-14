class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Emp extends Person{  
float salary;  
Emp(int id,String name,float salary){  
super(id,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
public class TestSuper5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(101,"palka",1000);
        e1.display();
	}

}
