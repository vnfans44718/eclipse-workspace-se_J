package anonymous;

public class AnonymousMain {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		anony.field.turnOn();
		anony.field.turnOff();

		anony.method1();

		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Smart TV를 켭니다");

			}

			@Override
			public void turnOff() {
				System.out.println("Smart TV를 켭니다");

			}

		});

	}

}
