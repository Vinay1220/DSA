import java.util.ArrayList;

public class Basic{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        // Add - last me add krta hai
        list.add(1);                        // Resize = old capacity+ (old capacity)/2
        list.add(2);                        // byDefolt capacity = 10;
        list.add(3);
        System.out.println(list);
        // Add at index 
        // range 0 to size
        list.add(0,10);
        System.out.println(list);
        System.out.println(list.size());
        //Delete
        // range 0 to size-1;
        list.remove(0);
        System.out.println(list);
        // Get
        // Range 0 to size-1
        list.get(0);
        System.out.println(list.get(0));
        //Set ---> Update Index pr jaakr
        list.set(2, 30);
        System.out.println(list);
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        for (int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // for_each loop
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}