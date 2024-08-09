package LeetCode;
import java.util.ArrayList;

public class MatrixSearch {
	
	
	public static void main(String[] args) {
		
		int[][]  ans =  {{1,2,3},{3,5,6},{7,8,8}};
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		ArrayList<Integer> r1 = new ArrayList<>();
		ArrayList<Integer> r2 = new ArrayList<>();
		
		ArrayList<Integer> r3 = new ArrayList<>();
		r1.add(1);
		r1.add(2);
		r1.add(3);
		r2.add(4);
		r2.add(5);
		r2.add(6);
		r3.add(7);
		r3.add(8);
		r3.add(9);
		matrix.add(r1);
		matrix.add(r2);
		matrix.add(r3);
		
		System.out.println(solve(matrix, 2));
		

	}

	
	
	
	
    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {

        boolean found = false;
        int i = 0;
        int j = A.get(0).size() -1;

        int ans_i =  A.size() -1;
        int ans_j = A.get(0).size();

        while(j >= 0 && i <= A.size()-1)
        {
            int temp = A.get(i).get(j);
            if(temp > B)
            {
                j--;
            }

            else if(temp < B){
                i++;
            }

            else if(temp == B)
            {
                if(ans_i > i){
                    ans_i = i;
                }

                if(ans_j > j){
                    ans_j = j;
                }

                found = true;
                j--;
            }

        }

        if(found){
            return ((i+1)*1009) +(j+1) ;
        }

        else{
            return -1;
        }
    }
}
