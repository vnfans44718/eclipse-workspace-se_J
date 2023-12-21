
public class Account {

	private int no; // 계좌번호
	private String owner; // 계좌주이름
	private int balance; // 계좌잔고
	private double iyul; // 계좌이율

	/*
	 * 계좌데이터를 대입
	 */

	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	/*
	 * 입금
	 */

	public void deposit(int money) {
		this.balance = this.balance + money;
		// this.balance+=money
	}

	/*
	 * 출금
	 */
	public void withdraw(int money) {
		this.balance = this.balance - money;
		// this.balance-=money
	}

	/*
	 * 계좌헤더출력
	 */
	public void headerPrint() {
		System.out.println("-------------------------");
		System.out.printf("%s %s %4s %s\n", "번호", "이름", "잔고", "이율");
		System.out.println("-------------------------");
	}

	/*
	 * 계좌정보 출력
	 */

	public void print() {
		System.out.printf("%d %s %10d %2.1f\n", this.no, this.owner, this.balance, this.iyul);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	//반환할 필요가 없어서 void로 메소드 생성

	public double getIyul() {
		return iyul;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}

}
