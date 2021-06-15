package game;

import java.util.Scanner;

import fixtures.Room;

/*
 * This is where the game-loop will go. 
 * Where we'll display a prompt, collect input, and parse that input
 */

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Set up rooms
		
		
		//Set up player
	
		RoomManager.init();
		
		Room currentRoom = RoomManager.startingRoom; // kitchen
		
		boolean quit = false;
		while(!quit) {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go? Backwards, left, forward, or right? " +
			"\nOr do you want to quit?");
			
			String input = scanner.next();
			if (input.trim().toLowerCase().equals("quit")) { //trim white space, convert to lower case, test equivalency
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
			} else System.out.println("Invalid Input");
			
			if(nextRoom != null) {
				currentRoom = nextRoom;
			} else System.out.println("You ran into a wall");
	
			
			
			
		}
		
		
		
	}
	
//	public static void startScreen() {
//		System.out.println("Welcome! Please type start to begin.");
//		String start = scanner.next();
//		if (start.equals("start")) {
//			run();
//		}
//	}
	
//	public static void printRoom(Player) {
//		
//		System.out.println("this method will print a prompt");
//		
//	}
//	
//	public static void collectInput() {
//		
//		System.out.println("this will use a scanner");
//		
//	}

}
