public class GoodString {
    public static void main(String[] args) {
        String str = " abcdeioux"; 
        System.out.println(good_String(str));
    }

    public static int good_String(String str) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(vowels(ch)==true){
                count++;
            }
            else{
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }

    public static boolean vowels(char ch) {
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ){
            return true;
        }
        return false;
        
    }
}
