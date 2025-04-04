package week1.day2;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3553, revnum = 0,remainder;
		//store num in Orignum
		
		int Orignum =num;
		
		//Using while loop to reverse the number 
		
		while (num != 0) {
			 remainder = num % 10;
		      revnum = revnum * 10 + remainder;
		      num /= 10;
		}
		
		//if condition to check given number is Palindrome number or not 
		
		if (Orignum == revnum) {
			
			System.out.println(Orignum + " is Palindrome Number");
		}
		
		else
		{
			System.out.println(Orignum + " is not Palindrome Number");
		}
		
	}

}
