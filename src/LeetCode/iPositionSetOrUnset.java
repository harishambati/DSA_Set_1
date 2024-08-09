package LeetCode;

public class iPositionSetOrUnset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnSetOrUnset(1,21));
	}
	
	
	static int returnSetOrUnset(int i, int n) {
		n = n >> i;
		n = n & 1;
		return n;
	}
	

}
