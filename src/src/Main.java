package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Room to be rented:\n ");
		
		int room = sc.nextInt();
		
		System.out.println("Renter's name:\n ");
		
		String name = sc.next();
		
		System.out.println("Number of days rented:\n ");
		
		int days = sc.nextInt();
	}

}
