package week4.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] companyNames={"HCL","Wipro","Aspire Systems","CTS"}; //Declared as String Array
		
		List<String> list = new ArrayList<>(Arrays.asList(companyNames)); //Storing the String Array in List
		
		Collections.sort(list); //Sorting the List in ASCII
		
		System.out.println(list);
		
		for (int i = list.size() - 1; i >= 0; i--) { 
			//Took Decrement to Reverse the Order 
			//Iteration 1 i=3;3>=0;3-- WIPRO will get Printed 
			//Iteration 2 i decremented to 2 so i =2; 2>=0; 2-- --> HCL get Printed 
			
			String orderedList = list.get(i);
		
			System.out.print(orderedList);
			}
	}

}
