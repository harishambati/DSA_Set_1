package LeetCode;

public class LongestPrefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] A = {"abab", "ab", "abcd"};
		System.out.println(getLongestPrefix(A));
	}

	
	
	
	static String getLongestPrefix(String[] strs)
	{
		StringBuilder str = new StringBuilder();
		boolean flag = false;
		int shortest_length = strs[0].length();
		for(int i = 1; i< strs.length; i++) 
		{
			if(strs[i].length() < shortest_length) {
				shortest_length = strs[i].length();
			}
		}
		
		for(int i = 0; i < shortest_length; i++) 
		{
			for(int j = 0; j < strs.length - 1; j++) 
			{
				if(strs[j].charAt(i) != strs[j + 1].charAt(i)) 
				{
					flag = true;
					break;
					
				}
				
				if(j == strs.length -2) 
				{
					str.append(strs[j].charAt(i));
				}
				
			}
			
			if(flag == true) {
				break;
			}
		}
		
		return str.toString();
		
		
	}
	
	
}
