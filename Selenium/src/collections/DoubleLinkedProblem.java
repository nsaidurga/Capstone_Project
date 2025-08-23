package collections;

import java.util.Scanner;

import collections.SingleLinkedList.Node;

public class DoubleLinkedProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		DoubleLinkedList list=new DoubleLinkedList();  
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			list.add(a);
		}
		list.reverse();
		list.print();
	}

}

class DoubleLinkedList{
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
			
	}
	public void reverse() {
		Node current=head;
		Node temp=null;
		while(current!=null) {
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		if(temp!=null) {
			head=temp.prev;
		}
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
		}
	}
}