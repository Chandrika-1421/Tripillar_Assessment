package Module10;
    class Node {
        int data;
        Node1 next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class SinglyLinkedList {
        Node1 head;
        // Insert at end
        public void insert(int data) {
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
        // Display list
         public void display() {
            Node1 temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);

            System.out.print("Linked List: ");
            list.display();
        }
    }

