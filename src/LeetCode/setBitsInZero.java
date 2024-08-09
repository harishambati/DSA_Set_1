package LeetCode;

public class setBitsInZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setBitsInZero(4,4));
	}

	static int setBitsInZero(int A, int B) {
		int a1 = 1 << A;
		int a2 = 1 << B;
		int ans = a1 | a2 ;
		
		return ans;
	}
	
}
