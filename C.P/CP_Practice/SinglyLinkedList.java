import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {
    private static ListNode head;  // it is a engine
    private static class ListNode { // it is compartment
    
        private int data;
        private ListNode next;

        public ListNode(int data){ // passenger
            this.data = data;
            this.next = null;
        }
        
    }

    public static ListNode addFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static ListNode addLast(int data){
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return head;
    }

    public static ListNode addMiddle(int data, int pos){
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        int a = 1;
        while (temp != null) {
            a++;
            if(a==pos){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;

    }

    public static ListNode dalete(int pos){
        ListNode temp = head;
        if(temp.next == null){
            return null;
        }
        int a = 1;
        while (temp.next != null) {
            a++;
            if(pos == a){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;

    }

    public static void print(ListNode head){
        ListNode temp = head;
        int count = 0;
        
        while (temp != null) {
            System.out.print(temp.data + "->");
            count++;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Length of LinkedList is : "+count); 
    }

    public static void main(String[] args) {
        // SinglyLinkedList ll = new SinglyLinkedList();
        // head = new ListNode(10);
    //    ListNode head = new ListNode(10);
    //    ListNode second = new ListNode(12);
    //    ListNode third = new ListNode(15);
    //    ListNode fourth = new ListNode(20);
       
    //    head.next = second;
    //    second.next = third;
    //    third.next = fourth;
       addFirst(8);
       addFirst(5);
       addFirst(2);
       addLast(10);
       addMiddle(9, 4);
       print(head);
       dalete(3);
       print(head);
    }
}
