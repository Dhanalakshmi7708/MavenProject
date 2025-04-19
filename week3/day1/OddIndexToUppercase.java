package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";

		char[] charArray1 = test.toCharArray();

		for (int i = 0; i < test.length() - 1; i++)

		{
			if (i % 2 != 0) {

				charArray1[i] = Character.toUpperCase(charArray1[i]);

			}

			System.out.println("Modified String is " + charArray1 [i]);

		}
	}

}
