package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    int n = 8, N1 = 0, N2 = 1;
	    System.out.println("Fibonacci Series of " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(N1 + ", ");

	      // compute the next term
	      int series = N1 + N2;
	      N1 = N2;
	      N2 = series;
	    }
	}

}
