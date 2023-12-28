import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain3 {

	public static void main(String[] args) {

		System.out.println("stmt1");
		String str = null;

		try {
			if ((int) (Math.random() * 2) == 0) {
				str = "정상실행";
			}
			int length = str.length();
			/*
			1. 예외상황발생하면  NullPointerException객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
			변수에 대입된다.   
			3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			System.out.println("code length:" + length);

			System.out.println("stmt2");

			int[] intArray = new int[3];
			intArray[4] = 9999;
			/*
			1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
			변수에 대입된다.   
			3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */

			System.out.println("stmt3");
			int a = 3;
			int b = 0;
			int r = a / b;
			System.out.println("r=" + r);
			System.out.println("stmt4");

		} catch (NullPointerException e) {
			System.out.println("-----------catch start[NullPointerExeption]-----------");
			System.out.println("널포인트 발생~~~" + e.getMessage());
			System.out.println("-----------catch end[NullPointerExeption]-----------");
			// catch는 하위 타입부터 잡는다 캐티에 Exeption이 상단에 기술되어 있을 경우 모든 예외를 잡을 수 있기에 에러 뜸
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("-----------catch start[NullPointerExeption]-----------");
			System.out.println("배열 " + e.getMessage());
			JOptionPane.showMessageDialog(null, "호갱님 죄송합니다. 프로그램 종료");
			/*System.exit(0);*/
			// exit을 사용하면 VM이 셧다운 되어 이후 코드는 읽지 않음
			// 없으면 stmt3까지 출력
			System.out.println("-----------catch end[NullPointerExeption]-----------");

		} catch (Exception e) {
			System.out.println("-----------catch start[NullPointerExeption]-----------");
			System.out.println("널포인트 발생~~~" + e.getMessage());
			System.out.println("-----------catch end[NullPointerExeption]-----------");
		}

	}

}