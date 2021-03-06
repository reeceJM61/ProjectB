package game;

import java.util.Scanner;

import fixtures.Room;

public class Run {
	
	/*
	 * This is where the game-loop will go. 
	 * Where we'll display a prompt, collect input, and parse that input
	 */
	
public static void run() {
		
		Room currentRoom = RoomManager.startingRoom; // kitchen
		
		boolean quit = false;
		while(!quit) {
			System.out.println(currentRoom);
			System.out.println();
			System.out.println("Where do you want to go? Backwards, left, forward, or right? " +
			"\nOr do you want to quit and return to the main menu?");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			if (input.trim().toLowerCase().equals("quit")) { //trim white space, convert to lower case, test equivalency
				MainMenu.runMainMenu();
				quit = true;
				continue;
			}
			Room nextRoom = null;
			if(input.trim().toLowerCase().equals("backwards")) {
				nextRoom = currentRoom.getBackExit();
			} else if (input.trim().toLowerCase().equals("left")) {
				nextRoom = currentRoom.getLeftExit();
			} else if (input.trim().toLowerCase().equals("forward")) {
				nextRoom = currentRoom.getFrontExit();
			} else if (input.trim().toLowerCase().equals("right")) {
				nextRoom = currentRoom.getRightExit();
			} else System.out.println("I'm sorry! Please try again."); //	TODO: Create Exception that handles gibberish
			
			if(nextRoom != null) {
				currentRoom = nextRoom;
			} else System.out.println("You ran into a wall.");
			
		}
		
}

}
