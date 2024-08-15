import java.util.ArrayList;
import java.util.List;

public class MainTwo6 {
    static class Node {
        public String value;
        public Node next;
    }

    public static boolean isPalindrome(Node node) {
        if (node == null) {
            return true;
        }
        return isPalindromeHelper(node, nodeContents(node), 1);
    }

    public static boolean isPalindromeHelper(Node node, List<String> nodeContents, int nodeIndex) {
        if (node == null) {
            return true;
        }

        return node.value.equalsIgnoreCase(nodeContents.get(nodeContents.size() - nodeIndex)) && isPalindromeHelper(node.next, nodeContents, nodeIndex + 1);
        // a == a && true
        //b == b && true
        //a ==a && (true)
    }

    public static List<String> nodeContents(Node node) {
        List<String> list = new ArrayList<>();

        while (node != null) {
            list.add(node.value);
            node = node.next;
        }

        return list;
    }

    public static void display(Node node) {
        String result = "";

        while (node != null) {
            result += node.value + "->";
            node = node.next;
        }

        System.out.println(node);
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = "a";

        Node node2 = new Node();
        node1.next = node2;
        node2.value = "b";

        Node node3 = new Node();
        node2.next = node3;
        node3.value = "a";

        Node node4 = new Node();
        node3.next = node4;
        node4.value = "c";

        System.out.println(isPalindrome(node1));
    }
}
/*
* import java.util.*;
/*
a->b->a->null
[a,b,a,null]
(&firstNode,[a,b,a,null],1)
*/
/*
class Main {









}

*/