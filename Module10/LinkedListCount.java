package Module10;
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCount {
    Node1 head;

    // Insert at end (for testing)
    public void addLast(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Count nodes
    public int countNodes() {
        int count = 0;
        Node1 temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedListCount list = new LinkedListCount();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Number of nodes = " + list.countNodes());
    }
}

