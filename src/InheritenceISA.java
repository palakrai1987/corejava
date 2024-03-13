class Aone
{
    void m1()
    {
    	System.out.println("i am in A class");
    }
}
class Bone extends Aone
{
	void m2()
    {
    	System.out.println("i am in B class");
    }
}


public class InheritenceISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bone ob = new Bone();
		ob.m1();
		ob.m2();

	}

}
