package Module10;
class SLL{
    int data;
    SLL next;
    SLL(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListLast {
    static SLL head = null;
    public void addLast(int data) {
        SLL newNode = new SLL(data);
        if (head == null) {
            head = newNode;
            return;
        }
        SLL current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() { //for printing the o/p and for traversing in 1 direction
        SLL current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListBegin text = new LinkedListBegin();
        System.out.println("Adding elements to first");
        text.addFirst(70);
        text.addFirst(80);
        text.addFirst(90);
        text.display();
    }
}

