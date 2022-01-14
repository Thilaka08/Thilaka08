package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class Sortingcollections {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems", "CTS"};
		int length = input.length;
		Arrays.sort(input,Collections.reverseOrder());
		System.out.println(Arrays.toString(input));
		//System.out.println(Arrays.toString(input));
		
		
	}

}
