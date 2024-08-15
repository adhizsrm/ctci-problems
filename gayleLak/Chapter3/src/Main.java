class Main {
    public static void main(String[] args) {
        StackOfArrays soa = new StackOfArrays(3);

        soa.push(1, 1);
        soa.display();
        soa.push(2, 2);
        soa.display();
        soa.push(3, 3);
        soa.display();

        System.out.println(soa.pop(1));
        System.out.println(soa.pop(2));
        System.out.println(soa.pop(3));
    }
}

class StackOfArrays {
    private int ptr1;
    private int ptr2;
    private int ptr3;

    private Integer[] arrayStack;

    public void display() {
        String result = "";
        for (Integer i : arrayStack) {
            result += i + ",";
        }

        System.out.println(result);
    }

    public StackOfArrays(int size) {
        arrayStack = new Integer[size * 3];
        ptr1 = 0;
        ptr2 = ptr1 + 3;
        ptr3 = ptr2 + 3;
    }

    public void push(int element, int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (arrayStack[ptr1] == null) {
                    arrayStack[ptr1] = element;
                    ptr1++;
                } else {
                    System.out.println("Stack full, try another stack.");
                }
                break;

            case 2:
                if (arrayStack[ptr2] == null) {
                    arrayStack[ptr2] = element;
                    ptr2++;
                } else {
                    System.out.println("Stack full, try another stack.");
                }
                break;

            case 3:
                if (arrayStack[ptr3] == null) {
                    arrayStack[ptr3] = element;
                    ptr3++;
                } else {
                    System.out.println("Stack full, try another stack.");
                }
                break;
        }
    }


    public int pop(int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (arrayStack[ptr1 - 1] != null) {
                    int temp = arrayStack[ptr1 - 1];
                    arrayStack[ptr1 - 1] = null;
                    ptr1--;
                    return temp;
                } else {
                    System.out.println("Stack 1 empty, try another stack.");
                }
                break;

            case 2:
                if (arrayStack[ptr2 - 1] != null) {
                    int temp = arrayStack[ptr2 - 1];
                    arrayStack[ptr2 - 1] = null;
                    ptr2--;
                    return temp;
                } else {
                    System.out.println("Stack 2 empty, try another stack.");
                }
                break;

            case 3:
                if (arrayStack[ptr3 - 1] != null) {
                    int temp = arrayStack[ptr3 - 1];
                    arrayStack[ptr3 - 1] = null;
                    ptr3--;
                    return temp;
                } else {
                    System.out.println("Stack 3 empty, try another stack.");
                }
                break;
        }

        return -1;
    }
}