import java.util.HashMap;

public class Find_Lucky_Integer_in_an_Array1394 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,3,6};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            if (hm.containsKey(el)==true) {
                hm.put(el,hm.get(el)+1);
            }else{
                hm.put(el,1);
            }
        }
        int ans = -1;

        for(int key : hm.keySet()){
            if(hm.get(key)==key){
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
