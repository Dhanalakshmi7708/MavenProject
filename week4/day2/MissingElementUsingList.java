package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] Array1 = { 1, 2, 3, 4, 10, 6, 8 };

		Arrays.sort(Array1);

		List<Integer> MissElement = new ArrayList<>(Arrays.asList(Array1));

		Collections.sort(MissElement);

		System.out.println("Ordered List is " + MissElement);

		for (int i = 1; i <= MissElement.size(); i++) {

			if (i != Array1[i - 1]) {

				System.out.println("Missing Elements are " + i);
			}

		}

	}

}
