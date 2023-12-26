
public abstract class Employee {
	public final static double INCENTITIVE_RATE = 0.1;
	public final int INCENTIVE_PAY;
	private int no;
	private String name;
	private int pay;

	public Employee() {
		this.INCENTIVE_PAY = 5000000;
	}

	public abstract void calculatePay();

	/*
	 * 인센티브계산(급여가 200만원이 넘으면 10% 인센티브 지급)
	 * -모든 사원들의 인센티브 계산방법 동일
	 * -재정의 금지(변경금지)
	 */

	public final double calculateIncentive() {
		double incentive = 0.0;
		if (this.pay >= this.INCENTIVE_PAY) {
			incentive = this.pay * INCENTITIVE_RATE;
		}
		return incentive;
	}

	public void print() {
		System.out.println(this.no + "\t" + this.name + "\t" + this.pay + "\t");
	}

	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		this.INCENTIVE_PAY = 5000000;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}