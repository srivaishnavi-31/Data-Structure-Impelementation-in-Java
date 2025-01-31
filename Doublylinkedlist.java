class Node {                 //creating a class-step1
    Node next;       
    Node prev;

    Node(int data) {               //creating a constructor-step-2
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL {                                            //create an class to declare an element-step-4
    Node head, tail;
    public void insertAtBegin(int data) {        //insertatBeginning
        Node newNode = new Node(data);                 
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data) {           //insertAtEnd
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void deleteAtBegin() {                //deleteAtBegining
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteAtEnd(){                       //deleteAtEnd
	    Node temp=head;
	    while(temp.next.next!=null){
	        temp=temp.next;
	    }
	    temp.next=null;
    }
    public void display() {                           //display
        Node temp = head;
        if (temp == null) {
            System.out.println("List is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DLL doubly = new DLL();                 //create an object-step-3   
        doubly.insertAtBegin(200);
        doubly.insertAtBegin(100);
        doubly.insertAtBegin(400);
        doubly.insertAtEnd(300);
        doubly.display();
        doubly.deleteAtBegin();
        doubly.deleteAtEnd();
        doubly.display();
    }
}

