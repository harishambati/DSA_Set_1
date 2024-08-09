package LeetCode;
import java.util.HashSet;

class LongestStringNotRepeat {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j =0 ;
        int ans = 0;
        HashSet set = new HashSet();
                                                            // abcabcbb
        while( (j < s.length()) && (i < s.length()))
        {
            
            if(set.contains(s.charAt(j))){
                
                set.remove(s.charAt(i));
                i++;
            }

            else{
              set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, set.size());
            }
        }
        
        return ans;
    }
}