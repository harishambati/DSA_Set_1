package LeetCode;

public class RepeatingOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  a = {1,2,2,3,1};
		System.out.println(returnSingleRepeating(a));
	}

	static int returnSingleRepeating(int[] a){
		int ans = a[0];
		
		for(int i = 1; i < a.length ; i++) {
			ans = ans ^ a[i];
		}
		return ans;
	}
	
}
