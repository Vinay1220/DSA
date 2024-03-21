public class Find_the_Maximum_Achievable_Number2769 {
    public static void main(String[] args) {
        int num = 4;
        int t = 1;
        System.out.println(theMaximumAchievableX(num, t));
    }

    public static int theMaximumAchievableX(int num, int t) {

        int ans = num+(t*2);
        return ans;

    }
}
