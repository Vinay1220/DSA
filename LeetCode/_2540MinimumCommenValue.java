public class _2540MinimumCommenValue {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,7,9};
        int [] arr2 = {0,0,0,0,0,0};
        System.out.println(minimumCommen(arr1, arr2));
    }
    public static int minimumCommen(int[]arr1,int[]arr2){
        int i=0,j = 0;
        int n = arr1.length;
        int m = arr2.length;
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                return arr1[i];
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return -1;
    }   
}
