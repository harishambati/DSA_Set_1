package LeetCode;

public class SumInArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {4,3,2,5,1};
		int B = 5;
		int C = 15;
		
		System.out.println(suminLength(A,B,C));
	}

	
	static int suminLength(int A[], int B, int C) {
		int sum =0, s =0, e = B -1;
		for(int i = s ; i <= e; i++) {
			 sum = sum + A[i];
		}
		
		s++;
		e++;
		
		if(sum == C) {
			return 1;
		}
		while(e < A.length) {
			sum = sum  - A[s-1] + A[e];
			if(sum == C) {
				return 1;
			}
			
			s++;
			e++;
		}
		
		return 0;
	}
	
	
	
	
}
