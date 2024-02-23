import java.util.ArrayList;
import java.util.List;

public class Find_the_Peaks2951 {
    public static void main(String[] args) {
        int[] arr = {2,4,4};
        System.out.println(findPeaks(arr));
    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<mountain.length-1; i++){
            int prev = mountain[i-1];
            int curr = mountain[i];
            int next = mountain[i+1];

            if(prev < curr && curr > next)
            list.add(i);
        }

        return list;
    }
}
