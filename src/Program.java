import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("How many rooms will be rentend?");
		int n = sc.nextInt();

		Rent[] vect = new Rent[10];
		
		for (int i=0 ;i<n ;i++) {
			System.out.println("Rent #" + i);
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.next();
			System.out.print("Room:");
			int roomNumber = sc.nextInt();
		
			vect[roomNumber] =  new Rent(name,email);;
			
		}
		 System.out.println("Busy Rooms:");
	        for (int i = 0; i < vect.length; i++) {
	            if (vect[i] != null) {
	                System.out.println(i + ": " + vect[i]);
	            }
	        }
		sc.close();
	}

}
