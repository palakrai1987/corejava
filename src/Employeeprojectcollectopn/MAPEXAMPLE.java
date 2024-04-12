package Employeeprojectcollectopn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class MAPEXAMPLE 
{
	Scanner sc = new Scanner(System.in);
	Map<Integer,EmployeeDetails> m = new HashMap<Integer,EmployeeDetails>();
	EmployeeDetails e1 = new EmployeeDetails(1,"palak");
	EmployeeDetails e2 = new EmployeeDetails(2,"abc");
	//s.add(e1);
	public MAPEXAMPLE()
	{
		//s.add(e1);
	m.put(1, e1);
	m.put(2, e2);
	}
	
	public void addEmpl()
	{
		System.out.println("enter name");
		String name= sc.next();
		
		System.out.println("enter id");
		int id = sc.nextInt();
		EmployeeDetails e3 = new EmployeeDetails(id,name);
		//s.add(e3);
		m.put(id, e3);
		System.out.println(m);
		for(Map.Entry<Integer,EmployeeDetails > x:m.entrySet())
		{
			System.out.println(x.getKey() + " "+ x.getValue().getId() + x.getValue().getName() );
		}
		System.out.println("employee added");
	}
	
	public void deleteEmp()
	{
		System.out.println("enter employee id to remove");
		int rid = sc.nextInt();
		boolean found = false;
		//EmployeeDetails empdelete = null;
		
		for(Map.Entry<Integer,EmployeeDetails > x:m.entrySet())
		{
			
			if(x.getKey() == rid)
			{
				m.remove(rid);
			//System.out.println(x.getKey() + " "+ x.getValue().eid + x.getValue().getName() );
		}
			System.out.println("after removal");
			
			for(Map.Entry<Integer,EmployeeDetails > x1:m.entrySet())
			{
				System.out.println(x1.getKey() + " "+ x1.getValue().eid + x1.getValue().getName() );
			}
		
		
		}
		
		
		/*for(EmployeeDetails ed :s)
		{
			if(ed.getId()==rid)
			{
				empdelete = ed;
				found = true;
				
			}
		}*/
		
		
	}
	
/*	public void updateEmployee() 
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
	}*/
	
	
	
	

}
