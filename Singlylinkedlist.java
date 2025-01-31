class Node {    //creating a class node
	int data;
	Node next;
	Node(int data) {         //creating a constructor
		this.data=data;
		this.next=null;
	}
}
class LinkedList {            //declared an object step-4
	Node head,tail;
	//inserting node step-5
	public void insert(int data) {
		Node newNode=new Node(data);   //create a new node
		//newNode.next=head;
		if(head==null) {               //if it is null then it stores the given value
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node temp=head;     //temporyly store head value
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}

	}
	public void deleteAtBegin() {    //deleteAtBegin
		if(head!=null)
			head=head.next;
	}
	public void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	public void insertAtBegin(int data) {             //insertAtBegin
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}

	public void insertAtSpecific(int pos,int data) {        //insertAtSpecific
		Node newNode=new Node(data);
		Node temp=head;
		for(int i=0; i<pos-1; i++) {
			temp=temp.next;
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
}
public class Main {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();           //creating an object step-3
		link.insert(100);
		link.insert(200);
		link.insert(300);
		System.out.print("Insert at Beginning:");
		link.deleteAtBegin();
		link.deleteAtEnd();
		//link.insertAtSpecific(2,900);
		link.display();

	}
}

