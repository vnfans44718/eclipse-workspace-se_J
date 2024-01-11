package basic;

public class ChildJFrameMain {

	public static void main(String[] args) {
		/*
		 *2. 컨테이너클래스(JFrame) 객체 생성
		 */
		ChildJFrame childJFrame = new ChildJFrame();
		/*
		 *3. 컨테이너(JFrame)객체의 크기 설정
		 */
		//childJFrame.setSize(500, 600);
		//childJFrame.setTitle("오늘점심메뉴는~~~");
		/*
		 *6. 컨테이너(JFrame)객체 보여주기
		 */
		//childJFrame.setVisible(true);
	
		/*
		 * Container.setVisible(true)
		 * - 메인 스레드가 이 메소드를 호출하면 JVM GUI 스레드(이벤트&그래픽)를 만듦
		 * - GUI 스레드는 무한 대기 하면서 이벤트와 그래픽 처리를 담당
		 * - Container (JFrame)은 계속 떠있다(JVM이 종료되지 않음)
		 * - 메인스레드는 위 메소드까지 한 후 셧다운
		 */
		System.out.println("main thread end jvm return");
		return;

	}

}
