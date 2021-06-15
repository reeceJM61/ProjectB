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
		
		RoomManager rm = new RoomManager();
		rm.init();
		
		Room currentRoom = rm.startingRoom;
		
		boolean quit = false;
		while(!quit) {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go? Left or right? " +
			"\nOr do you want to quit?");
			
			String input = scanner.next();
			if (input.trim().toLowerCase().equals("quit")) { //trim white space, convert to lower case, test equivalency
				quit = true;
				continue;
			}
			Room nextRoom = null;
			if(input.equals("left")) {
				nextRoom = currentRoom.getLeftExit();
			} else if (input.equals("right")) {
				nextRoom = currentRoom.getRightExit();
			}
			
			if(nextRoom != null) {
				currentRoom = nextRoom;
			}
			
		}
		
	}
	
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