package LeetCode;

public class FibonacciRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i = 0; i <= 100; i++) {
			System.out.print(fib(i) + ", ");
		}
	}

	
	public static int fib(int n) {
		
		if( n <= 0) {
			return 0;
		}
		
		
		else if(n <= 2 ) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	
	
}
