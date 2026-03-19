package Module10;
class node{
    int data;
    SLL1 next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListBegin {
    static SLL1 head = null;

    public void addFirst(int data) {
        SLL1 newNode = new SLL1(data);
        newNode.next = head;
        head = newNode;
    }
    public void display() { //for printing the o/p and for traversing in 1 direction
        SLL1 current = head;
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

