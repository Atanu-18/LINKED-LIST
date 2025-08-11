

public class test1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    // add first
    public void addFirst(int data) {
        // step1 -- create a new Node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // // step1 -- create a new Node
        // Node newNode = new Node(data);

        //step2 -- newNode next = head
        newNode.next = head; //link

        // step3 -- head = newnode
        head = newNode;
    }


    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.addFirst(1);
        t1.addFirst(2);
    }
}
