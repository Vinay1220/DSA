

public class Ant_on_the_boundary100214 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,-3,-2};
        System.out.println(returnToBoundaryCount(nums));
    }

    public static int returnToBoundaryCount(int[] nums) {
        int position = 0; 
        int returnsToBoundary = 0; 

        for (int num : nums) {
            if (num < 0) {
                position -= Math.abs(num); 
            } else if (num > 0) {
                position += num; 
            }

            if (position == 0) {
                returnsToBoundary++;
            }
        }

        return returnsToBoundary;
    }
}
