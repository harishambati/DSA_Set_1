package LeetCode;

public class LeastAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3, 7, 5, 20, -10, 0, 12};
		int B = 2;
		
		
		System.out.println(suminLength(A,B));
	}

	
	static int suminLength(int A[], int B) {
		int sum = 0, s = 0, e = B -1, avg = 0, index_least = 0;
		for(int i = s ; i <= e; i++) {
			 sum = sum + A[i];
		}
		
		s++;
		e++;
		avg = sum/B;
		
		while(e < A.length) {
			sum = sum  - A[s-1] + A[e];
			if(sum/B <  avg) {
				avg = sum/B;
				index_least = s;
			}
			
			
			s++;
			e++;
		}
		
		return index_least;
	}
	
	
	
}
