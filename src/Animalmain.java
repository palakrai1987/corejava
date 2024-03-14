class Animal
{
	String color ="black";
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	String color ="white";
	
	void eat()
	{ System.out.println(super.color);
		System.out.println(" dog is eating");
		System.out.println(color);
		super.eat();
	}
}

public class Animalmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob = new Dog();
         ob.eat();
	}

}
