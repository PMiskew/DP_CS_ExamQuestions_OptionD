package OptionDMay2016;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate Rooms
		Room[]  allRooms = new Room[5]; //these all get set to null
		allRooms[0] = new Room(1,2,200,true);
		allRooms[1] = new Room(2,1,200,true);
		allRooms[2] = new Room(3,2,200,false);
		allRooms[3] = new Room(4,1,300,true);
		allRooms[4] = new Room(5,1,400,false);
		
		ArrayList<Integer> freeRooms = findRooms(allRooms);
		System.out.println(freeRooms);
		
		
		
	}
	
	public static ArrayList<Integer> findRooms(Room[] allRooms) {
		
		//We do not know how many rooms are free so, we will start with a dynamic
		//data structure and then copy the values into an array
		ArrayList<Integer> freeRooms = new ArrayList<Integer>();
		
		for (int i = 0; i < allRooms.length; i = i + 1) {
			
			if (allRooms[i].isEmpty()) {
				freeRooms.add(allRooms[i].getRoomNumber());
			}
		}
		
		return freeRooms;
		
	}

}
