
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {

    public static void main(String[] args) {
        testMergingTwoLL();
        testFindMiddle();
        testMergeSort();
    }

    public static void testMergeSort() {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(6);
        Node sorted = mergeSort(head);
        System.out.print("Sorted list: ");
        print(sorted);
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMiddle(head);
        Node midR = mid.next;
        mid.next = null;
        mergeSort(head);
        mergeSort(midR);
        return merge(head, midR);
    }

    public static void testMergingTwoLL() {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node merged = merge(head1, head2);
        System.out.print("Merged sorted list: ");
        print(merged);
    }

    public static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        Node dummy = new Node(0);
        Node temp = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        temp.next = (head1 != null) ? head1 : head2;
        return dummy.next;
    }

    public static void testFindMiddle() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node middle = findMiddle(head);
        System.out.println("Middle is: " + middle.data);

    }

    public static Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        if (slow == null || slow.next == null || slow.next.next == null) {
            return slow;
        }
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("\n");
    }
}
