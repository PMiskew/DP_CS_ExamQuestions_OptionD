package OptionDMay2016;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate Rooms
		
		//14 d) THis code sets up so we can test the solution
		//START CODE
		Room[]  allRooms = new Room[20]; //these all get set to null
		allRooms[0] = new Room(1,2,200,true);
		allRooms[1] = new Room(2,1,200,true);
		allRooms[2] = new Room(3,2,200,false);
		allRooms[3] = new Room(4,1,300,true);
		allRooms[4] = new Room(5,1,400,false);
		allRooms[5] = new Room(6,2,200,true);
		allRooms[6] = new Room(7,1,200,true);
		allRooms[7] = new Room(8,2,200,false);
		allRooms[8] = new Room(9,1,300,true);
		allRooms[9] = new Room(10,1,400,false);
		allRooms[10] = new Room(11,2,200,true);
		allRooms[11] = new Room(12,1,200,true);
		allRooms[12] = new Room(13,2,200,false);
		allRooms[13] = new Room(14,1,300,true);
		allRooms[14] = new Room(15,1,400,false);
		allRooms[15] = new Room(16,2,200,true);
		allRooms[16] = new Room(17,1,200,true);
		allRooms[17] = new Room(18,2,200,false);
		allRooms[18] = new Room(19,1,300,true);
		allRooms[19] = new Room(20,1,400,false);
		
		//Test Code: 16
		ArrayList<Integer> freeRooms = findRooms(allRooms);
		System.out.println(freeRooms);
		
		 /* May 2016 15b)
		 * 
		 * 1) 	Create an instance of group passing the String
		 * 		"Happy Travellers" and the integer 15. 
		 *
		 * 2) 	Run the method findRooms to get the integer list of
		 * 		free rooms. 
		 * 3) 	Take the first 15 rooms in the list and set their 
		 * 		empty to false.
		 * 
		 * 
		 */
		
		
		
		
		
	}
	
	/**
	 * This is a solution to May 2016 option D 14d)
	 * @param allRooms
	 * @return
	 */
	public static ArrayList<Integer> findRooms(Room[] allRooms) {
		
		//We do not know how many rooms are free so, we will start with a dynamic
		//data structure and then copy the values into an array
		ArrayList<Integer> freeRooms = new ArrayList<Integer>();
		
		for (int i = 0; i < allRooms.length; i = i + 1) {
			
			if (allRooms[i].isEmpty() && allRooms[i].getBeds() == 2) {
				freeRooms.add(allRooms[i].getRoomNumber());
			}
		}
		
		return freeRooms;
		
	}
	
	public static int[] findRoomsB(Room[] allRooms) {
		
		//Because we are returning an array we must create it and set it size
		//before adding hte rooms
		
		//First loops counts the numbers of rooms. 
		int ctr = 0;
		for (int i = 0; i < allRooms.length; i = i + 1) {
			
			if (allRooms[i].isEmpty() && allRooms[i].getBeds() == 2) {
				ctr = ctr + 1;
			}
		}
		
		int[] freeRooms = new int[ctr];
		int index = 0;
		
		for (int i = 0; i < allRooms.length; i = i + 1) {
			
			if (allRooms[i].isEmpty() && allRooms[i].getBeds() == 2) {
				freeRooms[index] = allRooms[i].getRoomNumber();
				index = index + 1;
			}
		}
		
		return freeRooms;
		
	}


}
