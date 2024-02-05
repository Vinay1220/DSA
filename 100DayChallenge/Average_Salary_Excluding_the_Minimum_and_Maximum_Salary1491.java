public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary1491 {
    public static void main(String[] args) {
        int [] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (max<salary[i]) {
                max = salary[i];
            }

            if (min>salary[i]) {
                min = salary[i];
            }

            sum = sum+salary[i];
        }

        sum = sum - min - max;
        double ans = (double)sum/(salary.length-2);
        return ans;
    }
}
