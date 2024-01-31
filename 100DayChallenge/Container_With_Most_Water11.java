public class Container_With_Most_Water11 {
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxcap = 0;

        while (start<end) {
            int h = Math.min(height[start], height[end]);
            int width = end-start;
            int currcap = h * width;

            maxcap = Math.max(maxcap, currcap);

            if (height[start]<height[end]) {
                start++;
            }else{
                end--;
            }
        }
        return maxcap;
    }

//     public static int maxArea0ms(int[] height) {
//         int mx=Integer.MIN_VALUE;
//       int n=height.length;
//       int i=0,j=n-1;
//       while(i<j)
//       {
//           int m=Math.min(height[i],height[j]);
//           mx=Math.max(mx,(j-i)*m);
//           while(height[i]<=m && i<j)i++;
//            while(height[j]<=m && i<j)j--;
//       }
//       return mx;
//   }
}
