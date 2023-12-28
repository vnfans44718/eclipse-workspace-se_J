package lang;

public class StringUseMain {

	public static void main(String[] args) {
		System.out.println("----------length---------");
		String str1 = "Have a nice day!!!";
		String str2 = "오늘은 수요일 String 클래스를 공부해요";

		System.out.println(str1.length()); // 글자의 갯수
		System.out.println(str2.length());
		System.out.println("자바가 재미있네요.".length());
		String emptyStr = "";
		System.out.println("empty string length:" + emptyStr.length());
		System.out.println("------null-------");
		String id = null;
		if (id == null || id.equals("")) {

			System.out.println("아이디를 입력하세요~~");

		}

		System.out.println("-----------chatAt()----------");
		String userId = "testST#@%^";
		char firstChar = userId.charAt(0);
		char lastChar = userId.charAt(userId.length() - 1);
		System.out.println(">>아이디의 첫문자는 영문대(소)문자,숫자여야한다");

		if ((firstChar >= 'a' && firstChar <= 'z') || (firstChar >= 'A' && firstChar <= 'Z')) {
			System.out.println(firstChar + " 는 아이디의 첫글자로 유효합니다.");
		} else {
			System.out.println(firstChar + " 는 아이디의 첫글자로 유효안합니다.");
		}
		System.out.println("[Quiz]--userId유효성체크------");

		System.out.println("-----substring-----");
		System.out.println("Have a nice day!!!".substring(7));

		System.out.println("Have a nice day!!!".substring(7, 11));
		System.out.println("오늘은 수요일 String 클래스를 공부해요".substring(4, 7));
		System.out.println("오늘은 수요일 String 클래스를 공부해요".substring(4));
		System.out.println("-------indexOf------");
		String email = "guard@gmail.com";
		int atSignPosition = email.indexOf("@");
		System.out.println(email.substring(0, atSignPosition));
		System.out.println(email.substring(atSignPosition + 1));
		System.out.println("-----------split--------");
		String phoneNumber = "010-5621-1523";
		String[] phoneNoArray = phoneNumber.split("-");
		// - 를 기준으로 배열 생성
		for (String splitNo : phoneNoArray) {
			System.out.println(splitNo);
		}

		System.out.println("------replace()------");
		String str3 = "자바는 객체지향 언어입니다. 우리는 자바를 공부합니다.";
		System.out.println(str3.replace('자', '멀'));
		System.out.println(str3.replace("자바", "파이썬"));
		// 첫번째 인자를 두번째 인자로 변경
		System.out.println("-----------toUpperCase,toLowerCase------");
		// 대,소문자 변경
		System.out.println("jAvA".toUpperCase());
		System.out.println("jAvA".toLowerCase());
		System.out.println("equals-->" + "java".equals("JAVA"));
		System.out.println("equalsIgnoreCase-->" + "java".equalsIgnoreCase("JAVA"));
		// 소문자 자바를 대문자로 똑같이 취급
		String name = "김수한";
		if (name.startsWith("김")) {
			System.out.println("김씨인 사람" + name);
		}

		String[] names = { "정경호", "김미숙", "최경녀", "김은희", "신명숙" };
		for (String irum : names) {
			if (irum.startsWith("김")) {
				System.out.println(irum);
			}
		}
		/*
		 * Quiz:김씨를 찾아서 새로운 배열에 담아보세요
		 */
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("김")) {
				count++;
			}
		}

		String[] kimArray = new String[count];

		for (int i = 0, j = 0; i < kimArray.length; i++) {
			if (names[i].startsWith("김")) {
				kimArray[j] = names[i];
				j++;
			}
		}

		System.out.println("------------kim-----------");
		for (String kimName : kimArray) {
			System.out.println(kimName);
		}

		System.out.println("------------trim-----------");
		String id2="  gur d  ";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		//trim 적용 시 원래 변수의 내용이 바뀌는 것은 아님,앞뒤 공백만 자름, 정돈해서 보여주는 것
		
		
		
		
		
		
	}

}
