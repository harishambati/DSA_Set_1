package LeetCode;

public class GCDClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(GCD(960,16));
	}

	
	public static int GCD(int a, int b) {
		
		int c = a;
		int d = b;
		
		if( c ==0 && d ==0) {
			return -1; 
		}
		
		if(a < 0) {
			c = c * -1;
		}
		
		
		if(b < 0) {
			d = d * -1;
		}
		
		
		if( c == 0) {
			return d; 
		}
		
		else if( d == 0) {
			return c; 
		}
		
		else if(c > d) {
			return GCD(c%d,d);
		}
		
		else {
			return GCD(d%c, a);
		}
		
	}
	
	
	
	
	
}
