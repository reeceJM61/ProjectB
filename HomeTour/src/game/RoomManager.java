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
		
		Room kitchen = new Room("Kitchen", "Located in the bottom right corner of the house.");
		Room livingRoom = new Room("Living Room", "Located in the top right corner of the house.");
		Room bedRoom = new Room("Bedroom", "Located in the top left corner of the house.");
		Room bathRoom = new Room("Bathroom", "Located in the bottom left corner of the house.");
		
		allRooms = new Room[4];
		allRooms[0] = kitchen;
		allRooms[1] = livingRoom;
		allRooms[2] = bathRoom;
		allRooms[3] = bedRoom;
		
		startingRoom = kitchen;
		
		// bottom right
		kitchen.setBackExit(null);
		kitchen.setLeftExit(bathRoom); // You will end up in the bathroom if you turn left from the kitchen
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
		
	}


}
