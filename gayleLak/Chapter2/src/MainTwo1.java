import java.util.HashSet;

/**
 * Problem 2.1: Remove Duplicates.
 * Write a code to remove duplicates form an unsorted Linked List.
 * FOLLOW UP.
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class MainTwo1 {
    public static class Node {
        public int value;
        public Node next;
    }

    public static void displayNodes(Node node) {
        String result = "";

        while (node != null) {
            result += node.value + "->";
            node = node.next;
        }

        System.out.println(result);
    }

    public static void removeDuplicatesFromLinkedList(Node node) {
        HashSet<Integer> hset = new HashSet<>();
        Node curr = node;
        Node prev = curr;
        while (curr != null) {
            if (hset.contains(curr.value)) {
                prev.next = curr.next;
                prev = curr;
                curr = curr.next;

            } else {
                hset.add(curr.value);
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.value = 1;

        Node node2 = new Node();
        node2.value = 1;
        node.next = node2;

        Node node3 = new Node();
        node3.value = 2;
        node2.next = node3;

        Node node4 = new Node();
        node4.value = 3;
        node3.next = node4;

        Node node5 = new Node();
        node5.value = 5;
        node4.next = node5;

        System.out.println("Before duplicate removal.");
        displayNodes(node);

        System.out.println("After duplicate removal.");
        removeDuplicatesFromLinkedList(node);
        displayNodes(node);
    }
}

