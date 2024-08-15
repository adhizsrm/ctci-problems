/**
 * Problem 2.2: Return Kth to Last.
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class MainTwo2 {
    public static class Node {
        public int value;
        public Node next;
    }

    public static Node kthToLast(Node node, int kth) {
        //First we make a note of the size of the Linked List;
        Node firstPointer = node;
        int linkedListLength = 0;
        while (firstPointer != null) {
            linkedListLength++;
            firstPointer = firstPointer.next;
        }
        //Reset
        firstPointer = node;
        int index = linkedListLength - kth;
        for (int i = 0; i < index; i++) {
            firstPointer = firstPointer.next;
        }

        return firstPointer;
    }

    public static void display(Node node) {
        String result = "";

        while (node != null) {
            result += node.value + "->";
            node = node.next;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = 1;

        Node node2 = new Node();
        node2.value = 2;
        node1.next = node2;

        Node node3 = new Node();
        node3.value = 3;
        node2.next = node3;

        Node node4 = new Node();
        node4.value = 4;
        node3.next = node4;

        Node node5 = new Node();
        node5.value = 5;
        node4.next = node5;

        display(node1);
        display(kthToLast(node1, 2));
    }

}
