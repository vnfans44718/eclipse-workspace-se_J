import java.util.Date;

class ControlSleepThread extends Thread {

	@Override
	public void run() {
		// 메소드의 exeption을 던지면 재정의 위반이기 때문에 catch 해야함
		while (true) {
			try {
				Date now = new Date();
				System.out.println(now.toLocaleString());

				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		System.out.println("2.main thread 3초간 sleep");
		/*
		 * 현재 코드(Thread.sleep(3000);)를 실행하는 스레드를 3000ms동안 실행중지
		 */

		Thread.sleep(3000);

		ControlSleepThread cst = new ControlSleepThread();
		cst.setName("clock thread");
		cst.start();
		System.out.println("4. main jvm return");

	}

}
