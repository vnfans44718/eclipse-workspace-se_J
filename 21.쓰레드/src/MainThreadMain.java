
public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("main thread start");
		/*
		 * 현재 코드를 실행하는 메인 스레드의 스레드 객체 참조 얻기
		 */

		Thread mainThread = Thread.currentThread();
		System.out.println(">>" + mainThread);
		// ToString으로 재정의되어있음, 5는 실행의 우선순위
		System.out.println("thread name: " + mainThread.getName());
		// 이름 vm이 자동으로 줌
		MainThreadCalled mainThreadCalled = new MainThreadCalled();
		mainThreadCalled.main_thread_called_method1();
		mainThreadCalled.main_thread_called_method2();

		System.out.println("main thread end return");
	}

}
