
public class AcademyMemberMain {

	public static void main(String[] args) {
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "KAN", "JAVA");

		AcademyGangsa gs1 = new AcademyGangsa(3, "SIM", "PFFICE");
		AcademyGangsa gs2 = new AcademyGangsa(4, "LEE", "ANDRODIO");

		AcademyStaff sf1 = new AcademyStaff(5, "LIM", "영업");
		AcademyStaff sf2 = new AcademyStaff(6, "JIM", "총무");
		
		
		System.out.println("-------Student-------");
		st1.studentPrint();
		st2.studentPrint();
		System.out.println("-------Gangsa-------");
		gs1.gangsaPrint();
		gs2.gangsaPrint();
		System.out.println("-------Staff-------");
		sf1.staffPrint();
		sf2.staffPrint();
		
	}

}
