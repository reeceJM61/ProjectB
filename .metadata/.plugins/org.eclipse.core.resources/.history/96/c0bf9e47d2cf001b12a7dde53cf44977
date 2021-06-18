package game;

import java.util.Scanner;

public class MainMenu {
	
	/*
	 *  This class is responsible for running the Main Menu.
	 */
	
	public static void runMainMenu() {
		
		System.out.println("Welcome to Home Tour!");
		System.out.println("Where would you like to begin?");
		System.out.println("[ 1 ] Start");
		System.out.println("[ 2 ] View floorplan");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		@SuppressWarnings("unused")
		Integer num = scanner.nextInt();
		
		if (num.equals(1)) {
			
			RoomManager.init(); // Loads rooms
			Run.run(); // Runs program
			
		} else runMainMenu();
		
		scanner.close();
		
	}

}
