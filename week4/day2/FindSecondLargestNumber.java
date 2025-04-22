package week4.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] Numbers1 = {3, 2, 11, 4, 6, 7};
		
		List<Integer> numberList = Arrays.asList(Numbers1);
		
		Collections.sort(numberList);
		
		System.out.println("Ordered List is " + numberList);
		
		System.out.println("Second Largest Number in the given Array is "+numberList.get(4));	
		
	}

}
