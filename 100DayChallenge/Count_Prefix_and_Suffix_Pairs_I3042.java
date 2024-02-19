public class Count_Prefix_and_Suffix_Pairs_I3042 {
    public static void main(String[] args) {
        String[] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
    
    private static boolean isPrefixAndSuffix(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        if (m > n) {
            return false;
        }
        
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(n - m + i)) {
                return false;
            }
        }
        
        return true;
    }
}
