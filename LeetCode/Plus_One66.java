// approch: if our last digit is less then 9 than simple we increase the
//         digit and digit is 9 then we take a new array and we put arr[i] =1 and last digit is 0

import java.util.Arrays;
public class Plus_One66 {
    public static void main(String[] args) {
        int [] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[]arr){
        int n=arr.length;
        for (int i = n-1; i>=0; i--) {
            if (arr[i]<9) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0]=1;
        return newNumber;
    }
}
