package LeetCode;

public class sumOfSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3};
		System.out.println(sumOfSubArrays(A));
	}

	
	public static int sumOfSubArrays(int[] A) {
		int sum = 0;
		for(int i = 0; i< A.length ; i++) {
			sum = sum + (A[i] * (A.length - i) * (i +1));
		}
		
		return sum;
		
	}
}
