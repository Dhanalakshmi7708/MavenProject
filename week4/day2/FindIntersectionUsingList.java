package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] Array1= {3, 2, 11, 4, 6, 7};
		
		Integer [] Array2= {1, 2, 8, 4, 9, 7} ;
		
		//List<int[]> num1 = Arrays.asList(Array1);
		//List<int[]> num2 = Arrays.asList(Array2);
		
		 List<Integer> num1 = new ArrayList<>(Arrays.asList(Array1));
	     List<Integer> num2 = new ArrayList<>(Arrays.asList(Array2));
	          
	  	
		
		for (int i=0;i<num1.size();i++) {
	        	
	        	for (int j=0;j<num2.size();j++) {
	        		
	        		if (Array1[i]==Array2[j])
	        		{
	        			
	        			System.out.println("Match is found and Matching Element is "+ Array1[i]);
	        		}
	        		
	       		
	        	}
	        }
	}

}
