public class Longest_Common_Subsequence1143 {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();
        
        int temp[][] = new int[str1.length+1][str2.length+1];
        int max = 0;
        for(int i=1; i<temp.length; i++){
            for(int j=1; j<temp[i].length; j++){
                if(str1[i-1] == str2[j-1]){
                    temp[i][j] = temp[i-1][j-1]+1;
                }else{
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j]>max){
                    max = temp[i][j];
                }
            }
        }
        return max;
    }
}
