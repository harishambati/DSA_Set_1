package LeetCode;
class _4LeetCode {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {1,2};					
		int[] num2 = {3,4};
		System.out.println(findMedianSortedArrays(num1, num2));
	}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int[]  ans = new int[nums1.length + nums2.length ];
        int temp = 0;
        while((i < nums1.length) && (j < nums2.length)){
            if(nums1[i] < nums2[j]){
                ans[temp] = nums1[i];
                i++;
                temp++;
            }

            else{
                ans[temp] = nums2[j];
                j++;
                temp++;
            }
        }

        while(i < nums1.length){
                ans[temp] = nums1[i];
                i++;
                temp++;
        }

        while(j < nums2.length){
                ans[temp] = nums2[j];
                j++;
                temp++;
        }
            
        if(ans.length%2 == 0){
            int temp4 = (ans.length/2) - 1;
            int temp2 = temp4 + 1;
            int temp3 = ans[temp4] + ans[temp2];
            return temp3/(double)2;
        }

        else{
        	int temp4 = ((ans.length+1)/2) -1;
            return ans[temp4];
        }

    }
}
