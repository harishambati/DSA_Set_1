package LeetCode;

public class leaderelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,3,2,9,12,6,8,20};
		leaderElement(a);
	}

	
	public static void leaderElement(int A[]) 
	{
		int largest_left = A[0];
		int count = 1;
		
		for(int i = 1; i < A.length; i++) {
			if(largest_left < A[i]) {
				System.out.println(A[i]);
				largest_left = A[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
