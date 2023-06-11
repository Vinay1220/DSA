public class Swap2NumWithoutUsinTem {

     static void Swap2NumWithoutUsinTem(int a, int b){
          a = a+b;
          b = a-b;
          a = a-b;
          System.out.println("After swap");
          System.out.println(" a is = "+ a);
          System.out.println(" b is = "+ b);
     }
    public static void main(String[] args) {
         Swap2NumWithoutUsinTem(4, 6);
    }
}
