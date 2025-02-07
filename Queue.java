import java.util.*;
class Q {
	int a[] = new int[5];
	int front = -1;
	int rear = -1;
	public void Push(int data)
	{
		if(rear == a.length-1)
		{
			System.out.println("Queue is full");
		}
		else {
			if(front == -1) {
				front = 0;
			}
			rear ++;
			a[rear] = data;
		}
	}
	public void pop() {
		if(front == -1 || front >rear) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Removed Element:" +a[front]);
			front++;
		}
	}
	public void peek() {
		if(front == -1 || front>rear) {
			System.out.println("Queue empty");
		}
		else {
			System.out.println("Element at front: " +a[front]);
		}
	}
	public void display() {
		if(front == -1 || front>rear) {
			System.out.println("Queue empty");
		}
		else {
			System.out.println("Display Elements");
			for(int i = front; i<=rear; i++) {
				System.out.println(a[i]);
			}
		}
	}
}

public class Main {
	public static void main(String args[]) {
		Q m = new Q();
		m.Push(10);
		m.Push(20);
		m.Push(30);
		m.Push(40);
		m.display();
		m.peek();
		m.pop();
	}

}
