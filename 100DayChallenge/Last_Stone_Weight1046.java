
import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone_Weight1046 {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));

    }
    public static int lastStoneWeight(int[] stones) {
        // max priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for ( int ele : stones) {
            pq.add(ele);
        }

        while (pq.size()>1) {
            int max = pq.remove();
            int smax = pq.remove();
            int nstone = max-smax;

            if (nstone != 0) {
                pq.add(nstone);
            }
        }
        if (pq.size()==0) {
            return 0;
        }else{
            return pq.remove();
        }
    }        
}
