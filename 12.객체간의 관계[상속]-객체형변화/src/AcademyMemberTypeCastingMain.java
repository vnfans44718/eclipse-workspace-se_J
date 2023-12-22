
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		public class AcademyStudent extends AcademyMember {}
		public class AcademyGangsa extends AcademyMember {}
		public class AcademyStaff extends AcademyMember {}
		
		AcademyMember의자식타입객체(AcademyStudent,AcademyGangsa,AcademyStaff)들은
		AcademyMember 타입변수대입가능
		 */
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "ANDRODIO");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2, "LEE", "JAVA");
		AcademyMember m3 = new AcademyStudent(3, "JIN", "OFFICE");
		AcademyMember m4 = new AcademyGangsa(4, "박강사", "빅데이터");
		AcademyMember m5 = new AcademyGangsa(5, "김강사", "클라우드");
		AcademyMember m6 = new AcademyStaff(6, "박원장", "원장");
		AcademyMember m7 = new AcademyStaff(7, "나대리", "교무");
		
		
		
		/***AcademyMember타입에 정의되지앟은 메쏘드호출불가능***
		String ban=m1.getBan();
		String subject=m4.getSubject();
		String depart=m6.getDepart();
		********************************************************/
		
		/***AcademyMember타입에 정의된메쏘드중에 재정의된메쏘드 호출가능****
		   - AcademyMember타입에 정의된 print메쏘드를 호출하면
		     AcademyMember의 자식타입객체에 재정의된 print메쏘드가 호출된다.
		 */
		m1.print();
		m4.print();
		m6.print();
		System.out.println("-----------AcademtMember들 전체출력-------");
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();

	}

}
