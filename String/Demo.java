public class Demo{
    public static void main(String[] args) {
        String str = "Ram"; // Heap me- String pull me bnta hai
        String str1 = "Ram";
        System.out.println(str1);
        String st = new String("Radhe"); // heap me bnta hai
         String st1 = new String("Radhe");
         System.out.println(st);
         str = str + " Ram";
         System.out.println(str);
         st = st+" Shayam";
         System.out.println(st);

         System.out.println(st==st1); // Non-primitive me == address compare krta hai
         System.out.println(st.equals(st1)); // content compare krta hai
        System.out.println(str==str1);

        String s = "Hell" + "o"; // String pull me bnega kyuki litral hai
        System.out.println(s);
        String S1 ="Hell";
        S1 = S1+"o"; // Heap me bnega 
        System.out.println(S1);
        System.out.println(str.length());

    }
}