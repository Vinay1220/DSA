public class Power_of_Two231 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
              return false;
          }
          else if(n==1){
              return true;
          }
          else{
              while(n%2==0){
                  n = n/2;
              }
              if(n==1){
                  return true;
              }
              else{
                  return false;
              }
          }
      }
}
