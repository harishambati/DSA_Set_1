package LeetCode;

public class returnBitSetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnSetOrUnset(5,2));
	}

	static int returnSetOrUnset(int A, int B) {
		int shiftedA = A >> B;
		return shiftedA & 1;
	}
}
