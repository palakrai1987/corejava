package Employeeprojectcollectopn;

import java.util.*;

public class EmployeeService 
{
	Scanner sc = new Scanner(System.in);
	HashSet<EmployeeDetails> s = new HashSet<EmployeeDetails>();
	EmployeeDetails e1 = new EmployeeDetails(1,"palak");
	EmployeeDetails e2 = new EmployeeDetails(2,"abc");
	//s.add(e1);
	public EmployeeService()
	{
		//s.add(e1);
		s.add(e2);
	}
	
	public void addEmpl()
	{
		System.out.println("enter name");
		String name= sc.next();
		
		System.out.println("enter id");
		int id = sc.nextInt();
		EmployeeDetails e3 = new EmployeeDetails(id,name);
		s.add(e3);
		System.out.println(s);
		for(EmployeeDetails x:s)
		{
			System.out.println(x.eid + " "+x.name);
		}
		System.out.println("employee added");
	}
	
	public void deleteEmp()
	{
		System.out.println("enter employee id to remove");
		int rid = sc.nextInt();
		boolean found = false;
		EmployeeDetails empdelete = null;
		for(EmployeeDetails ed :s)
		{
			if(ed.getId()==rid)
			{
				empdelete = ed;
				found = true;
				
			}
		}
		if(!found)
		{
			System.out.println("not found");
		}
		else {
			s.remove(empdelete);
			System.out.println("record deleted ");
		}
		System.out.println("updated list after deletion");
		for(EmployeeDetails x:s)
		{
			System.out.println(x.eid + " "+x.name);
		}
		
	}
	
	public void updateEmployee() 
	{
		System.out.println("Enter id to update: ");
		int lid=sc.nextInt();
		boolean found=false;
		for(EmployeeDetails emp:s) {
			if(emp.getId()==lid) {
				System.out.println("Enter name: ");
				String ename=sc.next();
				emp.setName(ename);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp.eid + " "+emp.name);
				found=true;
			}
		}
	}
	
	
	
}	
	 
	
	
	
	
	
  
	

