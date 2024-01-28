package DataStructures;

import java.util.Scanner;

public class SinglyLinkedListApp {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		SinglyLinkedList sll=new SinglyLinkedList();
		while(true) {
			System.out.println("Press 1:--->INSERTFRONT");
			System.out.println("Press 2:--->INSERTATINTERMEDIATE");
			System.out.println("Press 3:--->INSERTREAR");
			System.out.println("Press 4:--->DELETEFRONT");
			System.out.println("Press 5:--->DELETEATINTERMEDIATE");
			System.out.println("Press 6:--->DELETEREAR");
			System.out.println("Press 7:--->DISPLAY");
			System.out.println("Press any other number:--->STOP");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: sll.insertfront();
			break;
			case 2: sll.insertAtPosition();
			break;
			case 3: sll.insertrear();
			break;
			case 4: sll.deletefront();
			break;
			case 5: sll.deleteAtPosition();
			break;
			case 6: sll.deleterear();
			break;
			case 7: sll.display();
			break;
			default: System.exit(0);
			}
		}
	}
}
