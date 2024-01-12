public class SubString {
    public static void main(String[] args) {
        String str = "abcd";
        printsubstring(str);

    }

    public static void printsubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j)+ " ");
            }
        }
        
    }
}
