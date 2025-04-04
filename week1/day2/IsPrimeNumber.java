package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime Number - A Number can only divisible by 1 or that number

		int n = 61;
		
		for (int i = 2; i <n; i++) //For loop to check the numbers till n-1 ==> 1, 2, 3,4,5
			{
			
			// if condition to check given number is divided by i 
			
			if (n%i ==0) {
				System.out.println(n + " is not prime number"); //if number divides print not prime numbers
				return;
			}
			
			else
			{
				System.out.println(n + " is prime number");//else print prime numbers
				return;
			}
					
		}

		}

	}


