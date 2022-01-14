package week3.day2;

public class occurrencechar {

	public static void main(String[] args) {
		String str ="welcome to chennai";
int count = 0;
char c='e';
char[] charArray = str.toCharArray();
int length = charArray.length;
	for (int i=0; i<=length-1; i++)
	{
if(str.charAt(i)==c)	
{	
	count = count+1;
}
	}

System.out.println("No. of occurrence of the char"+ " "+count);

}
}