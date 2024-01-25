public class Median_of_Two_Sorted_Arrays4 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,3,5};
        System.out.println(findMedianSortedArrays(arr1, arr2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans = merge(nums1, nums2);

        if(ans.length%2==0){
            double ans2 = (double)(ans[ans.length/2]+ans[ans.length/2 -1])/2;
            return ans2;
        }else{
            double ans2 = (double)(ans[ans.length/2]);
            return ans2;
        }
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1<nums1.length || p2<nums2.length) {
            int val1 = p1<nums1.length ? nums1[p1] : Integer.MAX_VALUE;
            int val2 = p2<nums2.length ? nums2[p2] : Integer.MAX_VALUE;

            if (val1<val2) {
                ans[p3] = val1;
                p1++;
            }else{
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}
