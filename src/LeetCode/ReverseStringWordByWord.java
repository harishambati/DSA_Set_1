package LeetCode;

public class ReverseStringWordByWord 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		String ex = "geeks quiz practice code";
		
		
		
		for(int i = ex.length() -1; i >= 0 ; i--) 
		{
			int start = 0;
			int end = 0;
			if( ex.charAt(i) != ' ')  
			{	
				end = i;
				for(int j = i - 1; j >= 0; j--) 
				{
					if(ex.charAt(j) == ' ' || j == 0) 
					{
						start = j + 1;
						i = start;
						if(j == 0) {
							start = j;
						}
						writeToBuffer(start, end, str, ex);
						break;
					}
					
					
					
				}
			}
			if(i== 0) {
				writeToBuffer(start, end, str, ex);
			}
			
		}
		
		System.out.println(str);
		
	}

		public static void writeToBuffer(int start, int end, StringBuilder str, String ex) 
	{
		for(int i = start ; i<= end; i++) {
			str.append(ex.charAt(i));
			
		}
		
		if( start != 0) {
			str.append(' ');
		}
		
		
	}
	
	
}
