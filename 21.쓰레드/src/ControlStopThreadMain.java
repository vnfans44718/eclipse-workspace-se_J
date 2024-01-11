class ControlStopThread1 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("downLoading...[" + i + "%]");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " thread가 jvm으로 return thread end");
		return;
	}
}

public class ControlStopThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main");
		ControlStopThread1 cst1 = new ControlStopThread1();
		cst1.setName("download");
		cst1.start();
		System.out.println("9.main thread jvm return end");
	}

}
