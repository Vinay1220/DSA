public class LastStringLength {
    public static void main(String[] args) {
        String s= "teri meri kahani";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                if(count>0){
                    return count;
                }
            }
        }
        return count;
    }
}
