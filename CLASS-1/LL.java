public class LL {

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

    //method
    // add();
    // remove();
    // print();
    // search();


    public static void main(String[] args) {
        LL ll = new LL();

        ll.head = new Node(1);
        // ll.head.next = new Node(2);
    }
}