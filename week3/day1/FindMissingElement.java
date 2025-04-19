package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 2 3 4 5 6 7
		// 1 2 3 4 6 7 8 10
		int[] num = {1,4,3,2,8,6,7,10}; 

		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {

			//System.out.println(num[i]);

			if (i + 1 != num[i]) {

				System.out.println("Missing Number is " + (i + 1));
				break;
			}

		}

	}

}
