package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester"; 
		
		String [] test2 = test.split(" ");  //["I", "am", "a", "software", "tester"]
		for (int i =0;i<test2.length;i++) { 
			if (i%2!=0) {
				
				char[] charArray = test2[i].toCharArray(); 
				
			for (int j=charArray.length-1;j>=0;j--) {
				
				System.out.print(charArray[j]);
			}
			
			}
			
			else {
				
				System.out.print(" "+test2[i]+ " ");
			}
			
		}
		
		

	}

}
