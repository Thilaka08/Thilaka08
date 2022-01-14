package week3.day2;

public class splitletternumspacecount {

	public static void main(String[] args) {
	String Test = " $$ Welcome to 2nd Class of Automation $$ ";
	int letter = 0,Space = 0,num = 0,specialchar = 0;  
	char charArray[] = Test.toCharArray();
int length = charArray.length;
	for(char c: charArray)
	{
		int i =0;
	
		if (Character.isLetter(c))
				{
			letter++;
			
				}
		else if (Character.isDigit(c))
			{
			num++;
			}
		
		else if(Character.isSpaceChar(c))	
		{
			Space++;
			
		}
		else
			specialchar++;
	}
	System.out.println(letter);
	System.out.println(num);
	System.out.println(Space);
	System.out.println(specialchar);

}
}