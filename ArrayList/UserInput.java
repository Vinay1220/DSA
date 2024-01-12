import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        System.out.println(list); 
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
        // sort
       Collections.sort(list);  
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

    }
}
