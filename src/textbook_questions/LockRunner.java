package textbook_questions;

public class LockRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lock lock1 = new Lock(111);
		Lock lock2 = new Lock(222);
		
		lock1.close();
		lock2.close();
		
		System.out.println(lock1.isOpen());
		lock1.open(123);
		lock1.open(456);
		lock2.open(222);
		lock1.open(789);
		lock1.open(111);
		
	}

}
