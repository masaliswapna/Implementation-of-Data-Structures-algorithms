package DataStructures;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int n=scan.nextInt();
		Stack s=new Stack(n);
		while(true) {
			System.out.println("Press 1:--->PUSH");
			System.out.println("Press 2:--->POP");
			System.out.println("Press 3:--->DISPLAY");
			System.out.println("Press any other number:--->STOP");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {	
			case 1: s.push();
			break;
			case 2: s.pop();
			break;
			case 3: s.display();
			break;
			default: System.exit(0);
			}
		}
	}
}
