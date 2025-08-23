package collections;

import java.util.Scanner;

//import org.w3c.dom.Node;

public class LinkedListProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		SingleLinkedList list=new SingleLinkedList();  
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			list.add(a);
		}
		list.reverse();
		list.print();
	}

}
class SingleLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	public void reverse() {
		Node prev=null;
		Node current=head;
		Node next;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
