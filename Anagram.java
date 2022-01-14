package week3.day2;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Anagram {

	public static void main(String[] args) {
	
		String name = "stops";
		String name2 = "potss";
		int length = name.length();
int length2 = name2.length();
if (length==length2)
{
	char[] charArray = name.toCharArray();
	char[] charArray2 = name2.toCharArray();
	Arrays.sort(charArray);
	Arrays.sort(charArray2);
			System.out.println(charArray);
			System.out.println(charArray2);
	if (charArray.equals(charArray2))
	{
			System.out.println("Given word is Anagram");
	}
	else
	{
		System.out.println("Given word is not Anagram");
	
	}
}
}
}