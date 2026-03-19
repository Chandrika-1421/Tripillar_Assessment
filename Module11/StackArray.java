package Module11;
class StackArray {
    int top;
    int size;
    int[] stack;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    // Push operation
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }
    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack elements:");
        s.display();
        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());
    }
}
