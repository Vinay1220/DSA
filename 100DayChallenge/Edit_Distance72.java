public class Edit_Distance72 {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(minDistance(word1, word2));
    }

    public static int min(int a, int b, int c){
        int v = Math.min(a,b);
        return Math.min(v,c);
    }

    public static int minDistance(String word1, String word2) {
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();

        int temp[][] = new int[str1.length+1][str2.length+1];

        for(int i=0; i<temp[0].length; i++){
            temp[0][i] = i;
        }

        for(int i=0; i<temp.length; i++){
            temp[i][0] = i;
        }
        for(int i=1; i<=str1.length; i++){
            for(int j=1; j<=str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    temp[i][j] = temp[i-1][j-1];
                }else{
                    temp[i][j] = 1+min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
                }
            }
        }
        return temp[str1.length][str2.length];
    }

    

}
