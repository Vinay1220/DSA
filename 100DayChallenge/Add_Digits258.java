public class Add_Digits258 {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }
    public static int addDigits(int num) {
        if(num == 0) {
            return 0;
        }
        else if(num % 9 == 0) {
            return 9;
        }
        else {
            return num % 9;
        }
    }
}
