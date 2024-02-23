public class Gas_Station134 {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = -1;
        int curr = 0;
        int total = 0;
        
        for(int i=0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            curr += diff;
            total +=diff;
            if(curr<0){
                curr = 0;
                pos = i;
            } 
        }
        if(total>=0){
            return pos+1;
        }

        return -1;
    }
}
