package org.department;

import org.college.College;

public class Department extends College {

	public void depName()
	{
		System.out.println("Department name is Computer science");
			
	}
   public static void main(String[] args)
   {
	Department dep = new Department();
	dep.collegeName();
	dep.collegeCode();
	dep.collegeRank();	
}
	
}
