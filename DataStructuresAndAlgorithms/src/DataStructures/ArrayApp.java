package DataStructures;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		Array a=new Array(n);
		while(true) {
			System.out.println("Press 1:--->INSERT");
			System.out.println("Press 2:--->DELETE");
			System.out.println("Press 3:--->DISPLAY");
			System.out.println("Press any other number:--->STOP");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {	
			case 1: a.insert();
			break;
			case 2: a.delete();
			break;
			case 3:a.display();
			break;
			default: System.exit(0);
			}
		}
	}
}
