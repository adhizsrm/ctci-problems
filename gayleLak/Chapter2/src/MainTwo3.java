/**
 * Problem 2.3: Delete Middle Node.
 * Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 */
public class MainTwo3 {
    public static class Node {
        public String value;
        public Node next;
    }

    public static void display(Node node) {
        String result = "";

        while (node != null) {
            result += node.value + "->";
            node = node.next;
        }

        System.out.println(result);
    }

    public static void deleteMiddleNode(Node node, Node middlenode) {
        // soft delete.
        middlenode.value = middlenode.next.value;
        middlenode.next = middlenode.next.next;
    }

    public static void deleteTheMiddleNode(Node node, Node middleNode) {
        Node firstNode = node;
        Node lastNode = node;
        Node track = node;
        Node prev = node;
        /* Once we come out of this loop, lastNode will pointing to the last node that is f. */
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        /*boolean check = (middleNode.value.equals(first.Node.value) && middleNode == firstNode) || (middleNode.value.);
        if (middleNode.value.equals(first.Node.value) && middleNode == firstNode) */
        // till the one node before the middleNode
        while (prev.next != middleNode) {
            prev = prev.next;
        }
        prev.next = middleNode.next;
        middleNode = null;
        //a->b->c->d->e->f->null
        display(node);


    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = "a";

        Node node2 = new Node();
        node1.next = node2;
        node2.value = "b";

        Node node3 = new Node();
        node2.next = node3;
        node3.value = "c";

        Node node4 = new Node();
        node3.next = node4;
        node4.value = "d";

        Node node5 = new Node();
        node4.next = node5;
        node5.value = "e";

        Node node6 = new Node();
        node5.next = node6;
        node6.value = "f";

        deleteMiddleNode(node1, node3);
        display(node1);

        display(node3);
    }
}
