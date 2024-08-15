/**
 * Problem 2.5: Sum Lists
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295
 * Output: 2 -> 1 -> 9. That is, 912.
 * <p>
 * Follow Up
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * Input: (6 -> 1 -> 7) + (2 -> 9 -> 5). That is 617 + 295.
 * Output: 9 -> 1 -> 2. That is, 912.
 */

public class MainTwo5 {
    public static class Node {
        public int value;
        public Node next;
    }

    public static Node recursionSumLinkedLIst(Node firstList, Node secondList, int carryForward) {
        if (firstList == null && secondList == null) {
            return null;
        }
        Node newNode = new Node();
        int sum = firstList.value + secondList.value + carryForward;
        if (sum > 9) {
            int carry = 1;
            newNode.value = sum % 10;
            newNode.next = recursionSumLinkedLIst(firstList.next, secondList.next, carry);
        } else {
            int carry = 0;
            newNode.value = sum;
            newNode.next = recursionSumLinkedLIst(firstList.next, secondList.next, carry);
        }
        return newNode;
    }

    public static Node sumLinkedList(Node firstList, Node secondList) {
        Node summedList = new Node();
        Node summedListPointer = summedList;
        int carry = 0;
        int carryForward = 0;
        while (firstList != null || secondList != null) {
            int result = firstList.value + secondList.value;
            if (result >= 10) { //12
                carry = result % 10;
                summedList.value = carry + carryForward;
                if (!(firstList.next == null || secondList.next == null)) {
                    summedList.next = new Node();
                    summedList = summedList.next;
                }
                carryForward = 1;
            } else {
                summedList.value = result + carryForward;
                if (!(firstList.next == null || secondList.next == null)) {
                    summedList.next = new Node();
                    summedList = summedList.next;
                }
            }
            firstList = firstList.next;
            secondList = secondList.next;

        }

        return summedListPointer;
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
        // Node1.
        Node node1 = new Node();
        node1.value = 7;

        Node node2 = new Node();
        node2.value = 1;
        node1.next = node2;

        Node node3 = new Node();
        node3.value = 6;
        node2.next = node3;

        // Node2.
        Node newNode1 = new Node();
        newNode1.value = 5;

        Node newNode2 = new Node();
        newNode2.value = 9;
        newNode1.next = newNode2;

        Node newNode3 = new Node();
        newNode3.value = 2;
        newNode2.next = newNode3;

        // Sum linkedlist.
        display(recursionSumLinkedLIst(node1, newNode1, 0));
    }

}

