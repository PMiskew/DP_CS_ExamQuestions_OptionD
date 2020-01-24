package textbook_questions;

public class Lock {

	private int combo;
	private boolean isOpen;
	private int attempt;
	
	public Lock(int key) {
		combo = key;
	}
	
	public boolean isOpen() { return isOpen; }
	public void close() { isOpen = false; }
	
	public void open(int key) {
		
		if (key == combo) {
			attempt = 0;
			isOpen = true; 
		
		}
		
		attempt = attempt + 1;
		
		if (attempt == 3) {
			System.out.println("ALARM!!!");
		}
	
		
	}
}
