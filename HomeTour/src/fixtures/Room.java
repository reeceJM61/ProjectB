package fixtures;

/*
 * This class represents a room in the house.
 */

public class Room extends Fixture {
	
	// Array of type Room
	private Room[] exits = new Room[4]; // back, left, front, right
	
	// Default Room constructor
	public Room() {}
	
	// Constructors that takes in a String name
	public Room(String name) {
		this.name = name;
	}
	
	public Room(String name, String shortDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
	}

	public Room(String name, String shortDescription, String longDescription) {
		super();
		this.exits = new Room[4];
	}
	
	//getters for array exits
	public Room getBackExit() {
		return exits[0];
	}
	
	public Room getLeftExit() {
		return exits[1];
	}
	
	public Room getFrontExit() {
		return exits[2];
	}
	
	public Room getRightExit() {
		return exits[3];
	}
	
	//setters for array exits
	public void setBackExit(Room exit) {
		exits[0] = exit;
	}
	
	public void setLeftExit(Room exit) {
		exits[1] = exit;
	}
	
	public void setFrontExit(Room exit) {
		exits[2] = exit;
	}
	
	public void setRightExit(Room exit) {
		exits[3] = exit;
	}
	
	
	
	
	@Override
	public String toString() {
		return "" + 
				"\nWelcome to the " + name + "!" +
				"\n" +
				shortDescription;
	}
	
}
