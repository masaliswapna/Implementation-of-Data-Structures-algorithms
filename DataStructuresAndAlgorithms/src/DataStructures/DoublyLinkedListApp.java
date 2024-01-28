package DataStructures;

import java.util.Scanner;

public class DoublyLinkedListApp {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		DoublyLinkedList dll=new DoublyLinkedList();
		while(true) {
			System.out.println("Press 1:--->INSERTFRONT");
			System.out.println("Press 2:--->INSERTATINTERMEDIATE");
			System.out.println("Press 3:--->INSERTREAR");
			System.out.println("Press 4:--->DELETEFRONT");
			System.out.println("Press 5:--->DELETEATINTERMEDIATE");
			System.out.println("Press 6:--->DELETEREAR");
			System.out.println("Press 7:--->DISPLAYFORWARD");
			System.out.println("Press 8:--->DISPLAYREVERSE");
			System.out.println("Press any other number:--->STOP");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: dll.insertfront();
			break;
			case 2: dll.insertAtPosition();
			break;
			case 3: dll.insertrear();
			break;
			case 4: dll.deletefront();
			break;
			case 5: dll.deleteAtPosition();
			break;
			case 6: dll.deleterear();
			break;
			case 7: dll.displayforward();
			break;
			case 8: dll.displayreverse();
			default: System.exit(0);
			}
		}
	}
}
