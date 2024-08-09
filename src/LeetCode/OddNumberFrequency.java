package LeetCode;

public class OddNumberFrequency {

	
	public static void main(String[] args) {
	
		int[] a= {2,8,3,1,2,2,3,2,8,1,1,8,8,100,100};
		System.out.println(returnOddNumberFrequency(a));
		
	}
	
	
	static int returnOddNumberFrequencyBrute(int[] a) {
		int count =0 ;
		for(int i =0; i < a.length; i++) {
			for(int j = 0 ; j< a.length ;j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			
			if(count % 2 != 0){
				return a[i];
			}
			
			else {
				count = 0 ;
			}
		}
		
		return -1;
	}
	
	
	
	
	static int  returnOddNumberFrequency(int a[]) {
		int a1 = a[0];
		for(int i = 1; i < a.length ;i++) {
			a1 = a1 ^ a[i];
		}
		
		return a1;
	}
	
}
