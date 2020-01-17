//This code is base on November 2019 D # 18
public class Customer {

	
	private String memberId;
	private String email;
	private boolean gold;
	
	public Customer(String a, String b) {
		memberId = a;
		email = b;
		gold = false;
	}
	
	public String getMemberId() { return memberId; }
	public String getEmail() { return email; }
	public boolean isGold () { return gold; }
	public void changeStatus() { gold = !gold; }
	
}
