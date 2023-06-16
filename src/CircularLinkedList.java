public class CircularLinkedList {

    Node head, tail;
    class Node{
        int data;
        Node tail;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void delete(){
        if (tail != head){
            head =head.next;
            tail.next = head;
        }else {
            head= tail = null;
        }
    }
    void insert(int data){
        Node newNode = new Node(data);
        if (head ==null){
            head = newNode;
            tail= newNode;
            tail.next = newNode;
        }
        else {
            tail.next=newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void display(){
        Node n1 = head;
        if (tail ==null && head == null){
            System.out.println("Circular linkedlist is empty");
        }
        else {
            do{
                System.out.println(n1.data);
                n1=n1.next;
            }while (n1 !=head);
        }
    }
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(2);
        circularLinkedList.insert(3);
        circularLinkedList.insert(5);
        circularLinkedList.display();
        System.out.println("After deleting elements");
        circularLinkedList.delete();
        circularLinkedList.display();
    }
}
