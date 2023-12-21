public class Car {

	private int no;// 차량번호
	private String model;// 차량모델명
	private Engine engine;// 엔진 객체 주소를 저장할 멤버필드

	/*** 
	 */

	public Car() {

	}

	public Car(int no, String model, Engine engine) {
		super();
		this.no = no;
		this.model = model;
		this.engine = engine;
	}

	public void print() {
		System.out.println(no + "\t" + model + "\t");
		engine.print();
	}
	// Car는 Engine 객체의 밖이기 때문에 Engine이 가진 캡슐화된 참조 변수에 직접 접근을 못함
	// Car는 자신이 가진 멤버 변수 및 메소드에만 접근이 가능하다

	// getter setter
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
