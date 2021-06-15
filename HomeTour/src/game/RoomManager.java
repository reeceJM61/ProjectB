package game;

import fixtures.Room;

/*
 * This class will be responsible for "loading" our rooms into memory
 * When game.Main is executed, it will invoke the init() method in this class that will instantiate all our Room objects
 * link them together as exits, and designate a startingRoom.
 */

public class RoomManager {
	
	static Room startingRoom; // the room a player should start in.
	static Room[] allRooms; // all the rooms in the house.
	
	
	public static void init() {
		
		Room kitchen = new Room("Kitchen");
		Room livingRoom = new Room("Living Room");
		Room bedRoom = new Room("Bedroom");
		Room bathRoom = new Room("Bathroom");
		
		allRooms = new Room[4];
		allRooms[0] = kitchen;
		allRooms[1] = livingRoom;
		allRooms[2] = bathRoom;
		allRooms[3] = bedRoom;
		
		// bottom right
		kitchen.setBackExit(null);
		kitchen.setLeftExit(bathRoom);
		kitchen.setRightExit(null);
		kitchen.setFrontExit(livingRoom);
		
		// top right
		livingRoom.setBackExit(kitchen);
		livingRoom.setLeftExit(bedRoom);
		livingRoom.setFrontExit(null);
		livingRoom.setRightExit(null);
		
		// bottom left
		bathRoom.setBackExit(null);
		bathRoom.setLeftExit(null);
		bathRoom.setFrontExit(bedRoom);
		bathRoom.setRightExit(kitchen);
		
		// top left
		bedRoom.setBackExit(bathRoom);
		bedRoom.setLeftExit(null);
		bedRoom.setFrontExit(null);
		bedRoom.setRightExit(livingRoom);
		
		
		startingRoom = kitchen;
	}
		
//		Room foyer = new Room(
//				
//				
//				"The Foyer",
//				"a small foyer",
//				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
//						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
//						+ "To the north is a small room, where you can see a piano.");
//						this.rooms[0] = foyer;
//				        this.startingRoom = foyer;
	

}
