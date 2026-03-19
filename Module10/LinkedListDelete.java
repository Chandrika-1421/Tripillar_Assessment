package Module10;
class SLL1  {
    int data;
    SLL1 next;
    SLL1(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListDelete {
    static SLL1 head=null;
    public void addFirst(int data){
        SLL1 newNode=new SLL1(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        SLL1 newNode=new SLL1(data);
        if(head==null){
            head=newNode;
            return;
        }
        SLL1 current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;//Shifting the head
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        SLL1 temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(position<=0){
            System.out.println("Invalid Position");
            return;
        }
        if(position==1){
            deleteFirst();
            return;
        }
        //Traverse now
        SLL1 temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
        }
    }
    public void display(){ //for printing the o/p and for traversing in 1 direction
        SLL1 current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListDelete text=new LinkedListDelete();
        System.out.println("After adding elements to the last");
        text.addLast(10);
        text.addLast(20);
        text.addLast(30);
        text.addLast(40);
        text.addLast(50);
        text.addLast(60);
        text.addLast(90);
        text.display();
        System.out.println("Adding elements to first");
        text.addFirst(70);
        text.display();
        System.out.println("After deleting first element");
        text.deleteFirst();
        text.display();
        System.out.println("After deleting last elemenet");
        text.deleteLast();
        text.display();
        System.out.println("After deleting at position 3:");
        text.deleteAtPosition(3);
        text.display();
    }
}
