package practice_test_solutions;

public class PlayerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//g) 
		
		//a) Declare and construct a Player object p1 that has stats = {1,2,3} and name = "Emily" 
		Player p1 = new Player(1,2,3,"Emily");
		
		//b) Declare and construct a Player P2 using teh default constructor
		Player p2 = new Player();
		
		//c) Declare a Player p3 and set it to null 
		Player p3 = null;
		
		//d)	Given that p1, p2 and p3 have been created and initialized properly
		//		write the single line of code that would have p1 battle p2 and 
		//		store the winner in p3
		p3 = Player.battle(p1, p2);
		
	}

}
