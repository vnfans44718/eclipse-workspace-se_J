
public abstract class Employee {

	private int no;
	private String name;
	private int pay;

	public Employee() {
		super();
	}
	
	public abstract void calculatePay();
	
	public void print() {
	System.out.println(this.no+"\t"+this.name+"\t"+this.pay+"\t");	
	}
	

	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	
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