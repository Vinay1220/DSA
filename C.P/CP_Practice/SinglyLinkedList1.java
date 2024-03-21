import java.util.LinkedList;

public class SinglyLinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Red");
        ll.add("bk");
        ll.add("Name");
        ll.addFirst("Ram");
        ll.addLast("Jay");
        ll.add(2, "Pandey");
        ll.remove(2);
        System.out.println(ll);
    }
}
