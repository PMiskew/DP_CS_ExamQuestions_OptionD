package practice_test_solutions;

public class ComboLockRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//a)
		ComboLock cl1 = new ComboLock(1,2,3);
		//b)
		ComboLock cl2 = new ComboLock();
		//c)
		ComboLock cl3 = null;
		//d) NOTE: 	I changed this to cl4 since cl3 is in part 3
		//			and already is definied in this program. 
		ComboLock cl4 = ComboLock.copyLargerLock(cl1, cl2);
	}

}
