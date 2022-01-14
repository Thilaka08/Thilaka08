package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		String name = "Thilaka";
		String revname = "";
		int length = name.length();

for (int i=length-1; i>=0; i--)
{
	revname = revname+name.charAt(i);
	}
//System.out.println(revname);
//System.out.println(name);
if (name.equals(revname))

{
	System.out.println("reversed string is Palindrome");
	System.out.println(revname);
	
}
else
	
{System.out.println("Reversed string is not Palindrome");

}

	}}
