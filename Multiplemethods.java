package week3.day1;

public class Multiplemethods {

	public void getStudentinfo(int id)
	{
	System.out.println("Student id "+id);	
	}
 public void getStudentinfo(int id,String name)
 
 {
	 System.out.println("Student id "+ id);
	 System.out.println("Student Name "+ name);
 }
 public void getStudentinfo(String email,int phonenum)
 
 {
	 System.out.println("Email id is "+ email);
	 System.out.println("Phone num "+ phonenum);
}
 public static void main(String[] args) {
	
	 Multiplemethods student = new Multiplemethods();
	 student.getStudentinfo(12345);
	 student.getStudentinfo(99999,"Geetha");
	 student.getStudentinfo("xxxx@gmail.com",9009099);
 }
	 
}