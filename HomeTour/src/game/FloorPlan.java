package game;

import java.util.Scanner;

public class FloorPlan {
	
	public static void viewFloorPlan() {
		
		boolean quit = false;
		while(!quit) {
		
		System.out.println(" ------------------------------------                  Forward              ");
		System.out.println("|                  |                 |                                      ");
		System.out.println("|                  |                 |                    |                 ");
		System.out.println("|     Bedroom      |   Living Room   |                    |                 ");
		System.out.println("|                  |                 |                    |                 ");
		System.out.println("|                  |                 |    Left   <------------------>   Right  ");
		System.out.println("|------------------------------------|                    |                  ");
		System.out.println("|                  |                 |                    |                  ");
		System.out.println("|                  |                 |                    |                  ");
		System.out.println("|     Bathroom     |    Kitchen      |                                       ");
		System.out.println("|                  |                 |                Backwards              ");
		System.out.println("|                  |                 |");
		System.out.println(" ------------------------------------");
		
		System.out.println();
		
		System.out.println("Type quit to return to the Main Menu.");
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		// quit option
		if (input.trim().toLowerCase().equals("quit")) { 
			MainMenu.runMainMenu();
			quit = true;
			continue;
		} 
		
		
		}
		
		
		
	}

}
