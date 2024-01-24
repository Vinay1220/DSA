import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer989 {
    public static void main(String[] args) {
        int[] num = {2,1,3};
        int k = 805;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while (p>=0 || k>0){
            int numval = 0;
            if(p>=0){
                numval = num[p];
            }
            int d = k%10; // it is the last digit from k
            int sum = numval+d+carry;
            
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);

            p--; // moving the pointer
            k = k/10; // removing the last digit from k
        }
        if (carry>0) {
            ans.add(carry); // adding carry to the array list
        }
        Collections.reverse(ans);

        return ans;
    }
}
