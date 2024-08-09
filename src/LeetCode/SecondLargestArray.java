package LeetCode;

public class SecondLargestArray {

	public static void main(String[] args) {
		
		int[]  arr = {2,2,3}; 
		System.out.println(secondLargest(arr));
	}

	
//	static int secondLargest(int[] arr) {
//		int largest = 0;
//		int _2ndLargest = -1;
//		
//		 if(arr.length == 1 || arr.length == 0) {
//			 return -1;
//		 }
//		
//		for(int i = 0 ; i< arr.length ; i++) {
//			if(largest < arr[i]) {
//			_2ndLargest = largest;
//				largest = arr[i];
//			}
//			
////			else if(arr[i] > _2ndLargest && arr[i] < largest) {
////				_2ndLargest = arr[i];
////			}
//		}
//		
//		return _2ndLargest;
//	}
	
	
	
	
//	static int secondLargest(int arr[]) {
//		int largest = 0;
//		int secondLrgest = -1;
//		 if(arr.length == 1 || arr.length == 0) {
//			 return -1;
//		 }
//		 for(int i = 0; i< arr.length ;i++) {
//			 if(arr[i] > largest) {
//				 largest = arr[i];
//			 }
//			 
//			 if(largest > secondLrgest && arr[i] > secondLrgest) {
//				 secondLrgest = arr[i];
//			 }
//		 }
//		 
//		 return secondLrgest;
//		
//	}
	
	
	static int secondLargest(int[] arr) {
		int largest = -1;
		int _2ndLargest = -1;
		
		 if(arr.length == 1 || arr.length == 0) {
			 return -1;
		 }
		
		for(int i = 0 ; i< arr.length ; i++) {
			if(largest < arr[i]) {
			largest = arr[i];
			}
			
			if(arr[i] > _2ndLargest && arr[i] < largest) {
				_2ndLargest = arr[i];
			}
			
		}
		
		return _2ndLargest;
	}
	
	
}
