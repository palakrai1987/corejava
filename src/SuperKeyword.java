class Animal
{
	String color = "white";
}
class Dog extends Animal
{
	String color = "black";
	void printcolor()
	{
		System.out.println(color);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob = new Dog();
		ob.printcolor();

	}

}
