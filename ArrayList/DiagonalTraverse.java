import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println(diagonalTraverse(arr));
        
    }

    public static int[] diagonalTraverse(int[][]mat) {
        int n= mat.length;
        int m=mat[0].length;
        int [] ans = new int[n*m];
        int i=0;
        for (int d = 0; d < n+m-1; d++) {
            int r=0;
            int c=0;
            if(d<m){
                r=0;
                c=d;
            }
            else{
                r=d-m+1;
                c=m-1;
            }
            ArrayList<Integer> list = new ArrayList<>();
            while(r<n && c>=0){
                list.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(list);
            }
            for (int val : list) {
                ans[i] = val;
                i++;
            }
        }
        return ans;
    }
}
