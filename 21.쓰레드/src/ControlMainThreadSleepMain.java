
public class ControlMainThreadSleepMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main Thread start");
		/*
		 * 스레드를 1000ms 동안 중지시킨다 (Running 상태에서 --> Block 상대로 변경)
		 * 1000ms 후에는 Thread는 실행 가능 상태가 된다.
		 * 
		 */

		System.out.println(">> 1000ms간 스레드를 sleep 시킨다");
		Thread.sleep(1000);
		// static 메소드 , 실행 불가능한 Block으로 보냄
		System.out.println(">> 1000ms 후에 스레드가 깨어나서 스케줄링 받아서 실행된다");

		System.out.println(">> 1000ms간 스레드를 sleep 시킨다");
		Thread.sleep(1000);
		System.out.println(">> 1000ms 후에 스레드가 깨어나서 스케줄링 받아서 실행된다");
		System.out.println("2. main thread end return");

	}

}
