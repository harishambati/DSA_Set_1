package LeetCode;

public class StringOperations {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String ex = "AbcaZeoB";
		System.out.println(stringOperations(ex));
	}
	
	
	static String  stringOperations(String str) {
		
		StringBuilder str1 = new StringBuilder();
		
		for(int i = 0; i < str.length() ; i++ ) 
		{
			
			if(str.charAt(i) == 'a'  || str.charAt(i) == 'e'  ||
					str.charAt(i) == 'i'  ||str.charAt(i) == 'o'  || str.charAt(i) == 'u')
			{
						str1.append('#');
				
			}
			
			
			else if(str.charAt(i) >=  'a' && str.charAt(i) <=  'z' ) 
			{
				str1.append(str.charAt(i));
			}
			
			
			
		}
		
		int len = str1.length();
		
		for(int i = 0; i < len ; i++) {
			str1.append(str1.charAt(i));
		}
		
		return str1.toString();
		
	}
	
	
	

}
