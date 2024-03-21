public class LinkedList_1{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    private Node head;
    private int size;
    private Node tail;

    public void addfirst(int item){
        Node nn = new Node(item);
        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }else{
            nn.next = head;
            head = nn;
        }
        
    }

    public void lastadd(int item){
        Node nn = new Node(item);
        if(size == 0){
            addfirst(item);
        }else{
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public int getfirst(){
        return head.data;
    }

    public int getlast(){
        return tail.data;
    }

    public int getatindex(int k )throws Exception{
        // return GetNode(k).data;
        return GetNode(k).data;
    }

    private Node GetNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Index out of Bound");
        }
        Node temp = head;
        for (int i = 1; i <=k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void Display(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next; 
        }
        System.out.println("Null");
    }

    public int removeFirst(){
        head = head.next;
        size--;
        return head.data;
    }

    public static void main(String[] args) {
        LinkedList_1 ll = new LinkedList_1();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.lastadd(30);
        ll.lastadd(40);
        ll.Display();
        System.out.println(ll.getfirst());
        System.out.println(ll.getlast());
        // System.out.println(ll.getatindex(2));
        System.out.println(ll.removeFirst());
        ll.Display();
    }
}