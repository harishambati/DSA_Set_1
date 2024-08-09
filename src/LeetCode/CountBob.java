package LeetCode;

public class CountBob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex =  "bobob";
		System.out.println(countBob(ex));
	}

	
	public static int countBob(String str) {
		int count = 0;
		for(int i = 1; i<str.length() - 1 ;i ++) {
			if(str.charAt(i) == 'o') {
				if(str.charAt(i - 1) == 'b' && str.charAt(i + 1) == 'b') {
					count++;
				}
			}
		}
		return count;
	}
	
	
}
