package LeetCode;
import java.util.ArrayList;

public class Beggars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int A = 5;

		ArrayList<Integer> C =   new ArrayList<Integer>();
		ArrayList<Integer> D =   new ArrayList<Integer>();
		ArrayList<Integer> E =   new ArrayList<Integer>();
		C.add(0, 1);
		C.add(1, 2);
		C.add(2, 10);
		
		D.add(0, 2);
		D.add(1, 3);
		D.add(2, 20);

		E.add(0, 2);
		E.add(1, 5);
		E.add(2, 25);
		ArrayList<ArrayList<Integer>> F = new ArrayList<ArrayList<Integer>>();
		F.add(0, C);
		F.add(1, D);
		F.add(2, E);
		
		solve(A,F).forEach((Integer value) -> System.out.print(value + " " ));
	}

	
	
	  public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) 
	    {

	        ArrayList<Integer> sol =  new ArrayList<Integer>(A);
	        
	        for(int i = 0; i< A ; i++){
	            sol.add(i,0);
	        }

	        for(int i = 0 ; i < B.size(); i++ )
	        {
	            int s = B.get(i).get(0) - 1;
	            int e = B.get(i).get(1) - 1;
	            int val = B.get(i).get(2);
	            sol.set(s, sol.get(s) + val);

	            if(e + 1 < A)
	            {
	                int v = sol.get(e + 1) + (-1 * val);
	                sol.set(e+1, v);
	        
	            }
	        }

	        for(int i = 1 ; i < A ; i++)
	        {
	            sol.set(i, sol.get(i-1) + sol.get(i) );

	        }

	        return sol;

	    }
	
}
