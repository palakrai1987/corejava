package Employeeprojectcollectopn;
import java.util.*;
public class Mainemployeeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeService ob1 = new EmployeeService();
		//int choice = sc.nextInt();
		boolean result = true;
		while(result)
		{
	      System.out.println("enter your choice press 4 to exit");
		int choice = sc.nextInt();
	
		switch(choice)
		{
		
		case 1:
		ob1.addEmpl();
		break;
		case 2:
		ob1.deleteEmp();
		break;
		case 3:
		ob1.updateEmployee();
		break;
		default :
			result = false;
		}

	}

	}}
