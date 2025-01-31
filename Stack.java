class S{
	int a[]=new int[5];
	int top=-1;
	public void push(int data) {                //insert an element
		if(top==a.length-1) {
			System.out.println("Stack is full");			
		}
		else {
			top++;
			a[top]=data;
		}
	}
	public void pop() {                 //delete an element
		if(top==-1) {
			System.out.println("Stack is empty ");
		}
		else {
			top--;
		}
	}
		public void peek() {
			if(top==-1) {
				System.out.println("Stack is empty ");   
			}
			else {
				System.out.println("Top of the element: "+a[top]);
			}
		}
		public void display() {
			for(int i=top;i>=0;i--) {
				System.out.println("Display the element "+a[i]);
			}
		}
    }
public class Main {
	public static void main(String[] args) {  
         S s=new S();                             //object creating
         s.push(10);
         s.push(20);
         s.push(30);
         s.push(40);
         s.push(50);
         s.pop();
         s.peek();
         s.display();
	}

}
