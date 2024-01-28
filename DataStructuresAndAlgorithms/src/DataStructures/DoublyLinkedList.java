package DataStructures;

import java.util.Scanner;

public class DoublyLinkedList {
	class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);
	public void insertfront() {
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.prelink=null;
		newnode.data=elem;
		newnode.nextlink=null;
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.nextlink=first;
			first.prelink=newnode;
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
        newNode.prelink = null;
        newNode.data = elem;
        newNode.nextlink = null;

        if (position == 1) {
            newNode.nextlink = first;
            first.prelink = newNode;
            first = newNode;
        } else {
            Node temp = first;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.nextlink;
            }
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.nextlink = temp.nextlink;
            newNode.prelink = temp;
            if (temp.nextlink != null) {
                temp.nextlink.prelink = newNode;
            }
            temp.nextlink = newNode;
        }
    }
	public void insertrear() {
		Node temp;
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.prelink=null;
		newnode.data=elem;
		newnode.nextlink=null;
		if(first==null) {
			first=newnode;
		}
		else {
			temp=first;
			while(temp.nextlink!=null) {
				temp=temp.nextlink;
			}
			temp.nextlink=newnode;
			newnode.prelink=temp;
		}
	}
	public void deletefront() {
		if(first==null) {
			System.out.println("Deletion not possible");
		}
		else if(first.nextlink==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);

			first=first.nextlink;		
			first.prelink=null;
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
            first = first.nextlink;
            if (first != null) {
                first.prelink = null;
            }
        } else {
            Node temp = first;
            for (int i = 1; i < position && temp != null; i++) {
                temp = temp.nextlink;
            }
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            if (temp.prelink != null) {
                temp.prelink.nextlink = temp.nextlink;
            }
            if (temp.nextlink != null) {
                temp.nextlink.prelink = temp.prelink;
            }
            System.out.println("Element deleted is " + temp.data);
        }
    }
	public void deleterear() {
		Node temp;
		if(first==null) {
			System.out.println("Deletion not possible");
		}
		else if(first.nextlink==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp.nextlink.nextlink!=null) {
				temp=temp.nextlink;
			}
			System.out.println("Element deleted is "+temp.nextlink.data);
			temp.nextlink=null;
		}
	}
	public void displayforward() {
		Node temp;
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else {
			temp=first;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.nextlink;
			}
		}
		System.out.println();
	}
	public void displayreverse() {
		Node temp;
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else {
			temp=first;
			while(temp.nextlink!=null) {
				temp=temp.nextlink;
			}
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.prelink;
			}
		}
		System.out.println();
	}
}
