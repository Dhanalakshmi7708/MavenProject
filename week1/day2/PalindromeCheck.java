package week1.day2;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input =12345;
		int output =0;
		
		//for loop to update i by dividing i/10 in each iteration
		for (int i=input;i>0;i/=10) {
			
			int rem =i%10;	// used % moduler to pick the remainder for rem value
			output = (output*10)+rem; // this will reverse the input value
		}
		if (input == output) //if condition to compare input to output value
		{
			
			System.out.println(input + " is Palindrome Number");
		}
		
		else
		{
			System.out.println(input + " is not Palindrome Number");
		}
		
		
	}

}
