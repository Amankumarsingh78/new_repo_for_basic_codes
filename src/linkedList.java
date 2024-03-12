public class linkedList {
    Node head;
    private int size;
    linkedList(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //add first
    public void addFirst(int d){
        size++;
        Node newNode =new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(int d){
        size++;
        Node newNode = new Node(d);
        if(head == null){
            head  = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print the list
    public void printList(){
        if(head == null){
            System.out.println("list is empty ");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //deleteFirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty ");
            return;
        }
        size--;
        head = head.next;
    }

    //deleteLast
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty ");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head. next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // getSize;
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addLast(8);
        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(3);
        ll.addLast(5);
        ll.printList();

        ll.deleteLast();
        ll.printList();

        ll.deleteLast();
        ll.printList();

        ll.deleteLast();
        ll.printList();

        System.out.println(ll.getSize());
    }
}
