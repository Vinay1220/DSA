public class Demo2 {
    public static void main(String[] args) {
        String str = "abcdef";
        String s = "aa";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2, 5)); // index number ke bich ka content
        System.out.println(str.substring(2)); // index number ke baad sabhi char
        System.out.println(str.substring(1, 1)); // No return.
        System.out.println(str.concat(str)); // Add krta hai
        System.out.println(str.compareTo(s));// Dictionary wise compare
    }
}
