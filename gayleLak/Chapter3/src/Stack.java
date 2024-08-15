public class Stack {
    public int top = 0;
    public int stack[] = new int[5];

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        return stack[top - 1];
    }

    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
