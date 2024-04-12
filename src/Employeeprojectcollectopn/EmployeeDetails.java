package Employeeprojectcollectopn;

import java.util.HashSet;

public class EmployeeDetails {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	// right click and 
	//click on source after creating variables or fields , generate setters and getters and generate constructors 
	public int eid;
	public String name;
	public EmployeeDetails(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public int getId() {
		return eid;
	}
	public void setId(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	}


