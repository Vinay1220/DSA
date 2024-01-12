// public class SubSequence {
//     public static void main(String[] args) {
//         String str = "abc";
//         printSubSeq(str,"");
        
//     }
//     public static void printSubSeq(String ques, String ans){
//         if(ques.length()==0){
//             System.out.println(ans);
            
//             return;
//         }

//         char ch = ques.charAt(0);
//         printSubSeq(ques.substring(1), ans);
//         printSubSeq(ques.substring(1), ans+ch);
//     }
// }



// subsequence and count

// public class SubSequence {
//     static int count = 0;
//     public static void main(String[] args) {
//         String str = "abc";
//         printSubSeq(str,"");
//         System.out.println(count);
//     }
//     public static void printSubSeq(String ques, String ans){
//         if(ques.length()==0){
//             System.out.println(ans);
//             count++;
//             return;
//         }

//         char ch = ques.charAt(0);
//         printSubSeq(ques.substring(1), ans);
//         printSubSeq(ques.substring(1), ans+ch);
//     }
// }

 //2nd way to calculate count
 public class SubSequence {
    static int count = 0;
    public static void main(String[] args) {
        String str = "abc";
        //printSubSeq(str,"");
        System.out.print(printSubSeq(str,"")); 
        
    }
    public static int printSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return 1;
        }

        char ch = ques.charAt(0);
       int f1 =  printSubSeq(ques.substring(1), ans);
       int f2 = printSubSeq(ques.substring(1), ans+ch);
       return f1+f2;
    }
}
