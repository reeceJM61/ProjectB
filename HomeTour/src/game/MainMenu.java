package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
	
	/*
	 *  This class is responsible for running the Main Menu.
	 */
	
	public static void runMainMenu() {
		
		System.out.println();
		System.out.println("Welcome to Home Tour!");
		System.out.println("Where would you like to begin?");
		System.out.println("[ 1 ] Start");
		System.out.println("[ 2 ] View floorplan");
		System.out.println("[ 3 ] Quit");
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		Integer num = scanner.nextInt();
		
		
		if (num.equals(1)) {
			
			RoomManager.init(); // Loads rooms
			Run.run(); // Runs program
			
		} else if (num.equals(2)) {
			FloorPlan.viewFloorPlan();
		} else if (num.equals(3)) {
			System.out.println("Thank you! Have a nice day.");
		} else {
			System.out.println("Sorry! Please try again.");
			runMainMenu();
		}
		
		} catch(InputMismatchException e) {
			System.out.println("Sorry! Please enter a number.");
			runMainMenu();
		}
		
		scanner.close();
		
	}

}
