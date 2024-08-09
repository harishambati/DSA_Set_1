package LeetCode;

public class returnDecimalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnDecimal(1010, 2
				));
	}
	
	
	static int returnDecimal(int A, int b) {
		String a = Integer.toString(A);
		int ans = 0;
		for(int i = a.length() -1; i >= 0; i--) {
			int a2 =  Character.getNumericValue(a.charAt(i));
			int a4 = (int) Math.pow(b,a.length() -1 -i);
			int a5 = a2 * a4;
			ans = ans + a5;
			//ans = ans + (int) a.charAt(i) *(int) Math.pow(a.length() - 1 - i,b);
		}
		return ans;
	}

}
