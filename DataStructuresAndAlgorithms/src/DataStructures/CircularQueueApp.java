package DataStructures;

import java.util.Scanner;

public class CircularQueueApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of circularqueue");
		int n=scan.nextInt();
		CircularQueue cq=new CircularQueue(n);
		while(true) {
			System.out.println("Press 1:--->INSERT");
			System.out.println("Press 2:--->DELETE");
			System.out.println("Press 3:--->DISPLAY");
			System.out.println("Press any other number:--->STOP");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: cq.insert();
			break;
			case 2: cq.delete();
			break;
			case 3: cq.display();
			break;
			default: System.exit(0);
			}
		}
	}
}