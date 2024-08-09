package LeetCode;


public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,0,0,0,0};
		System.out.println(switchCount(a));
	}
	
//	static int switchCount(int[] a) {
//		int count = 0;
//		
//		for(int i = 0 ; i < a.length ; i++) {
//			if(a[i] == 0) {
//				count++;
//				for(int j =i ; j < a.length ;j++) {
//					
//					if(a[j] == 0) {
//						a[j] = 1;
//					}
//					
//					else {
//						a[j] = 0;
//					}
//					
//					
//				}
//			}
//		}
//		
//		return count;
//	}

	static int switchCount(int arr[]) {
		int count = 0;
		for(int i =0; i < arr.length ; i++) {
			int currentbit = 0;
			
			if(count == 0 || count % 2 == 0) {
				currentbit = arr[i];
			}
			
			else {
				currentbit = 1 - arr[i];
			}
			
			if(currentbit == 0) {
				count++;
			}
		}
		
		return count;
	}
	
	
}
