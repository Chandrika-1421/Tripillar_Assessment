package Module11;
class QueueArray {
    int front, rear, size;
    int[] queue;

    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    // Dequeue operation
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    // Peek operation
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    // Display queue
    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Top element: " + q.peek());

        System.out.print("Queue after dequeue: ");
        q.display();
    }
}
