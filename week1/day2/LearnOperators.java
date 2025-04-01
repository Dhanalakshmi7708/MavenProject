package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 14;
		int b = 2;
		
		//Arithmetic Operators - Add, Sub , Mul , Div 
		
		System.out.println(a+b); //Add
		System.out.println(a-b); //Sub
		System.out.println(a*b); //Mul
		
		System.out.println(a/b); //Div Quotient
		System.out.println(a%b); //Div Reminder
		
		System.out.println("---------------------"); 

		//Comparison Operator - equalTo, lessThan, greaterThan
		
		int s = 5;
		int t = 7;
		
		System.out.println(s==t); //equalsTo
		System.out.println(s<t); //lessThan
		System.out.println(s>t); //greaterThan
		System.out.println(s<=t); //lessThanEqualto 
		System.out.println(s>=t); //greaterThanEqualto
		
		System.out.println("---------------------"); 
		
		//Logical Operators - AND and OR
		
		int x= 4;
		int y= 5;
		
		System.out.println(x==y && x>y);
		System.out.println(x==y || x>y);
		
		
		//AND Operator true example 
		int age = 16;
		boolean hasDriverLicense = true;
		System.out.println (age >=16 && hasDriverLicense);
		
		System.out.println("---------------------"); 
		
		//Increment and Decrement Operator
		
		//postIncrement 
		int i = 7;
		System.out.println(i++);
		System.out.println(i);
		
		//preIncrement
		
		System.out.println(++i);
		
		//Post Decrement 
		System.out.println(i--);
		System.out.println(i);
		
		//preDecrement
		
		System.out.println(--i);
		
		
		
	
		
		
		
	}

}
