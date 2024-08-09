package LeetCode;

public class armstrongNumber {

	
	public static void main(String args[]) {
		armistrongNumber(410);
	
	}
	
	
	public static void armistrongNumber(int A) {
		int num = 0;
		
		for(int i=1; i <= A; i++ ) {
			int n  = i;
			while(n > 0) {
				
				if(num > i) {
					break;
				}
				num = num + (n%10) * (n%10) * (n%10);
				n = n/10;
			}
			
			if(num == i) {
				System.out.println(num);
			}
			
			num =0;
		}
	}
}
