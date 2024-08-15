public class MainTwo4 {
    public static class Node {
        public int data;
        public Node next;
    }

    public static String display(Node node) {
        String output = "";
        while (node != null) {
            output += node.data + "->";
            node = node.next;
        }
        return output;
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data = 3;

        Node node2 = new Node();
        node2.data = 5;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 8;
        node2.next = node3;

        Node node4 = new Node();
        node4.data = 5;
        node3.next = node4;

        Node node5 = new Node();
        node5.data = 10;
        node4.next = node5;

        Node node6 = new Node();
        node6.data = 2;
        node5.next = node6;

        Node node7 = new Node();
        node7.data = 1;
        node6.next = node7;
        node7.next = null;

        display(node1);

    }

    public static Node partition(Node node, int value) {
        Node beforeHead = null;
        Node beforeEnd = null;
        Node afterHead = null;
        Node afterEnd = null;

        while (node != null) {
            Node temp = node;
            temp.next = null;

            if (node.data < value) {
                if (beforeHead == null) {
                    beforeHead = node;
                    beforeEnd = beforeHead;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterHead == null) {
                    afterHead = node;
                    afterEnd = afterHead;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = temp;
        }

        if (beforeHead == null) {
            return afterHead;
        }
        //Merge Both Lists
        beforeEnd.next = afterHead;
        return beforeHead;
    }


}
