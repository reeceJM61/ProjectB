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


}
