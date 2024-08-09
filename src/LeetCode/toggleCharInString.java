package LeetCode;

public class toggleCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(toggle("aBcAEd"));
	}

	
	static String toggle(String input) {
		int temp = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) > 'a') {
				char c = (char) (input.charAt(i) + 32);
				System.out.println(c);
				sb.append(c);
			}
			
			else {
				sb.append((char)input.charAt(i) - 32);
			}
		}
		
		
		
		return sb.toString();
		
		
	}
	
	
}
