package LeetCode;

public class transposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] =   { { 9, 2, 3, 4 },
                          { -2, 9, 5, 6 },
                          { -3, -4, 9, 7 }, 
                          { -5, -6, -7, 9 } 
		};
         print2D(mat);
         System.out.println();
         transpose(mat);
         print2D(mat);
	}
	
	
	public static void transpose(int A[][]) {
		
		int temp = 0;
		
		for(int i =0; i < A.length; i++ ) {
			for(int j = i; j < A.length ; j++) {
				temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
				
			}
		}
	}

	
	public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
        	// Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
            	 System.out.print(mat[i][j] + " ");
            }
               
        	System.out.println();
        }
 
            
    }
}
