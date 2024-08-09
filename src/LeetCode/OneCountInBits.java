package LeetCode;

public class OneCountInBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OneCountInBits(13));;
	}
	
	static int OneCountInBits(int A) {
		int n = A;
		int ans = 0;
		while(n > 0) {
			
			int a1 = n & 1;
			ans = ans + a1;
			
			//ans = ans + n & 1;
			n = n >> 1;
		}
		
		return ans;
	}
}
