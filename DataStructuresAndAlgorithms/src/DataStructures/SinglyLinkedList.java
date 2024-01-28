package DataStructures;

import java.util.Scanner;

public class SinglyLinkedList {
	class Node{
		int data;
		Node link;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);
	public void insertfront() {
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.link=first;
			first=newnode;
		}
	}
	public void insertAtPosition() {
        System.out.println("Enter the position to insert");
        int position = scan.nextInt();
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        System.out.println("Enter an element");
        int elem = scan.nextInt();
        Node newNode = new Node();
        newNode.data = elem;
        newNode.link = null;

        if (position == 1) {
            newNode.link = first;
            first = newNode;
        } else {
            Node temp = first;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.link;
            }
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.link = temp.link;
            temp.link = newNode;
        }
    }
	public void insertrear() {
		Node temp;
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null) {
			first=newnode;
		}
		else {
			temp=first;
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=newnode;
		}
	}
	public void deletefront() {
		if(first==null) {
			System.out.println("Deletion not possible");
		}
		else if(first.link==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);
			first=first.link;		
		}
	}
	public void deleteAtPosition() {
        System.out.println("Enter the position to delete");
        int position = scan.nextInt();
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (first == null) {
            System.out.println("Deletion not possible");
        } else if (position == 1) {
            System.out.println("Element deleted is " + first.data);
            first = first.link;
        } else {
            Node temp = first;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.link;
            }
            if (temp == null || temp.link == null) {
                System.out.println("Invalid position");
                return;
            }
            System.out.println("Element deleted is " + temp.link.data);
            temp.link = temp.link.link;
        }
    }
	public void deleterear() {
		Node temp;
		if(first==null) {
			System.out.println("Deletion not possible");
		}
		else if(first.link==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp.link.link!=null) {
				temp=temp.link;
			}
			System.out.println("Element deleted is "+temp.link.data);
			temp.link=null;
		}
	}
	public void display() {
		Node temp;
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.link==null)
		{
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	}
}
