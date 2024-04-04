import java.util.*;

class student
{
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	int sid ;
	String name;
	
}
public class Studentlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student ob1 = new student(1,"ram");
		student ob2 = new student(2,"sram");
		student ob3 = new student(3,"vram");
		LinkedList<student> s = new LinkedList<student>();
		s.add(ob1);
		s.add(ob2);
		s.add(ob3);
		System.out.println(s);
		/*for(student s1:s)
		{
			System.out.println(s1.getName()  + ""+s1.getSid());
		}*/
		for(int i = 0;i<s.size();i++)
		{
			System.out.println(s.get(i).sid + ""+s.get(i).name);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter id");
		int id = sc.nextInt();
		student ob4 = new student(id,name);
		s.add(ob4);
		for(int i = 0;i<s.size();i++)
		{
			System.out.println(s.get(i).sid + ""+s.get(i).name);
		}

	}

}
