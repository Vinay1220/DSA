public class Basic{
    public static void main(String[] args) {
        Integer a=100; // Heap me bnta hai content
        int a1=10; // stack me bnta hai content
        System.out.println(a);
        System.out.println(a1);
        Short s = 78;
        Byte s1 = 19;
        System.out.println(s);
        System.out.println(s1);
        a=a1; // int--> Integer   auto_Boxing 
        System.out.println(a);
        Integer p = 19;
        int i = 15;
        i = p; // Integer-->int   un_Boxing
        System.out.println(i);

        // Important
        Integer b = 15;
        Integer b1 = 15;
        System.out.println(b==b1); // cache memory have between -128 to 127  allocate same memory
        Integer c = 190;
        Integer c1 = 190;
        System.out.println(c==c1); // 127 uper create duplicate memory address

    }
}