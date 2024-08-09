package LeetCode;

public class ReturnUpdatedAfterUnsetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReturnUpdatedAfterUnsetting(5,2));
	}

	static int ReturnUpdatedAfterUnsetting(int A, int B) {
		int a = (1 << (B));
		int a2 = ~ a;
		int a3 = a2 & A;
		
		return a3;
	}
}
