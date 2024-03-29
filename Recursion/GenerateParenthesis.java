import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis{
    public static void main(String[] args) {
        int n =3;
        //Parenthesis(n, 0, 0, "");
        List<String> list = new ArrayList<>();
        Parenthesis_Leetcode(n, 0, 0, "",list);
        System.out.println(list);
    }
    // public static void Parenthesis(int n, int opening, int closing, String ans){
    //     if(opening ==n && closing ==n){
    //         System.out.println(ans);
    //         return;
    //     }
    //     if(opening<n){
    //         Parenthesis(n, opening+1, closing, ans+"(");
    //     }
    //     if(closing<opening){
    //         Parenthesis(n, opening, closing+1, ans+")");
    //     }
    // }

      public static void Parenthesis_Leetcode(int n, int opening, int closing, String ans, List<String>list){
        if(opening ==n && closing ==n){
            list.add(ans);
            return;
        }
        if(opening<n){
            Parenthesis_Leetcode(n, opening+1, closing, ans + "(",list);
        }
        if(closing<opening){
            Parenthesis_Leetcode(n, opening, closing+1, ans + ")",list);
        }
     }
}