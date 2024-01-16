public class GlobalVariable {
    static int val = 80;
    public static void main(String[] args) {
        System.out.println("hey");
        int x = 90;
        fun(x);
    }
    public static void fun(int x){
        System.out.println(x);
        System.out.println(val);
    }
}
