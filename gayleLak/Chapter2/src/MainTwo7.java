import java.util.HashSet;

/**
 * Problem 2.7: Intersection
 * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node.
 * Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference) as the
 * jth node of the second linked list, then they are intersecting.
 */
public class MainTwo7 {
    public static class Node {
        int value;
        Node next;
    }

    static HashSet<Node> list = new HashSet<>();

    public static Node intersectingNode(Node node1, Node node2) {
        Node ptr = node1;
        Node ptr2 = node2;
        while (ptr != null) {
            list.add(ptr);
            ptr = ptr.next;
        }
        while (ptr2 != null) {
            if (list.contains(ptr2)) {
                return ptr2;
            }
            ptr2 = ptr2.next;
        }

        return null;
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
        node1.next = node2;
        node2.value = 2;

        Node node3 = new Node();
        node2.next = node3;
        node3.value = 3;

        Node node4 = new Node();
        node3.next = node4;
        node4.value = 4;


        Node newNode1 = new Node();
        newNode1.value = 7;

        Node newNode2 = new Node();
        newNode1.next = newNode2;
        newNode2.value = 8;

        Node newNode3 = new Node();
        newNode2.next = newNode3;
        newNode3.value = 9;

        Node newNode4 = new Node();
        newNode3.next = newNode4;
        newNode4.value = 10;

        newNode4.next = node3;


        Node newnewNode1 = new Node();
        newnewNode1.value = 11;

        Node newnewNode2 = new Node();
        newnewNode2.value = 3;
        newnewNode1.next = newnewNode2;


        display(newNode1);
        display(node1);
        display(newnewNode1);

        System.out.println(node3 == intersectingNode(node1, newNode1));
        System.out.println(node3 == intersectingNode(node1, newnewNode1));
    }
}
