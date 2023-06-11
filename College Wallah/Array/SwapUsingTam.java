public class SwapUsingTam {

    public static void Swap(int a , int b){
        int temp = a;
        a =  b ;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int [] arr = {3,4,3,9,2,1};

        Swap(a,b);
        
    }
    
}
