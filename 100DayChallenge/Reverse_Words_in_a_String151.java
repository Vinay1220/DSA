public class Reverse_Words_in_a_String151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+"); //split on the basis of spaces
        StringBuilder sb = new StringBuilder("");

        for (int i = arr.length-1; i >=0 ; i--) {
            sb.append(arr[i]+" ");
        }

        // trim function --> remove trailing and leading space

        String ans = sb.toString();
        ans = ans.trim();

        return ans;
    }
}
