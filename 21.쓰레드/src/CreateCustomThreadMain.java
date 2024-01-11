
class CreateCustomThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("가. " + Thread.currentThread().getName() + "스레드 실행");
			System.out.println("나. " + Thread.currentThread().getName() + "스레드 실행 후 반환");
		}
		// return;
	}
}

public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("사용자정의 스레드");
		System.out.println("2.main thread CreateCustomThread객체.start() 메소드 호출 전");
		cct.start();
		// 메인이 start를 호출하고 그 다음의 메인 블록을 차례대로 실행한다
		// 이 객체의 run 메소드를 실행하는 스레드를 시작, 우리가 시작하지 않음, JVM이 알아서 시작
		// 메인의 current 스레드가 실행되고 우리가 재정의한 run 메소드를 실행하는 스레드도 존재, 2가지 스레드가 실행됨
		System.out.println("3.main thread CreateCustomThread객체.start() 메소드 호출 후");
		boolean isPlay = true;
		while (isPlay) {
			System.out.println("4. main thread");
		}

		System.out.println("4.main thread end return");
	}

}
