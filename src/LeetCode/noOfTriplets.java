package LeetCode;

public class noOfTriplets {


public static void main(String[] args) {
	
	int A[] = {2, 6,9,4,10};
	System.out.println(tripletsCount(A));
	
	
}

static public int tripletsCount(int A[]) {
	// TODO Auto-generated method stub

	
	int i = 0; 
	int j = i+1;
	int k = j +1;
	int count = 0;
	while(i < A.length) 
	{
			j = i + 1;
			while(j < A.length) 
			{
					if(A[j] > A[i]) 
					{
						k = j+ 1;
						while(k < A.length) 
						{
								if(A[k] > A[j]) 
								{
									count++;
									
								}
								k++;
						}
						
					}
					j++;
			}
		i++;
	}
	
	return count;
	
}

}
