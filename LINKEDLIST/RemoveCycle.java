package LINKEDLIST;

public class RemoveCycle {
    public static class Node { // this is node class
        int data; // properties
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public static void addFirst(int data) {
        // creation of neWNode
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        newNode.next = head; // link
        head = newNode; // new head
    }

    // addLast
    public static void addLast(int data) {
        // creation of newNode
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode; // link
        tail = newNode; // new head
    }

    // is Cycle
    public static boolean isCycle() {

        // slow - fast approach
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { // fast can never be null if it is in cycle
            // updation
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) { // at last node
                return true;
            }
        }
        return false;
    }

    // remove the cycle
    public static void removeCycle() {
        // step 1 --> detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) { // in cycle fast wil never be null
            // checking cycle exists or not
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                cycle = true;
                break;
            }

        }
        
        if (cycle == false) { // !cycle
            return;

        }

        // step 2 --> find meeting point
        slow = head; // take slow to head position
        Node prev = null; // assign prev as null
        while (slow != fast) {
            slow = slow.next;
            prev = fast; // keeping on making fast as our prev
            fast = fast.next;
        }

        // step 3 --> removing cycle --> last.next = null
        prev.next = null;

    }

    // print
    public static void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}
