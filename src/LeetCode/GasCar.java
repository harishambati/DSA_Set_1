package LeetCode;

class GasCar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
			System.out.println(canCompleteCircuit(gas, cost));
		
	}
	
	
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int start_index = -1;
        for(int i = 0; i < gas.length; i++){
            if(gas[i] > cost[i]){
                start_index = i;
                break;
            }
        }

        if(start_index < 0){
            return start_index;
        }
        int i = start_index + 1;
        i = i % (gas.length);

        int gasr = gas[start_index] - cost[start_index];  

        while(i != start_index){
            int temp = gasr + gas[i];
            if(temp >= cost[i]){
                gasr = temp - cost[i];
                i++;
                i = i % (gas.length);
            }

            else{
                break;
            }
        }

        if(start_index != i){
            return -1;
        }

        else{
            return start_index;
        }
    }
}