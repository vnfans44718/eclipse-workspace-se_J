
public class AcademyMemberOverridingArrayMain {

	public static void main(String[] args) {
		
		
		
	AcademyStudent[] students = new AcademyStudent[3];
	AcademyGangsa[] gangsas = new AcademyGangsa[2];
	AcademyStaff[] staffs = new AcademyStaff[2];
	
	students[0]= new AcademyStudent(1, "KIM", "JAVA");
	students[1]= new AcademyStudent(2, "LIM", "ANDRODIO");
	students[2]= new AcademyStudent(3, "SIM", "CLOUD");
	
	gangsas[0]= new AcademyGangsa(4, "김강사", "웹디자인");
	gangsas[0]= new AcademyGangsa(5, "정강사", "빅데이터");
	
	staffs[0]=new AcademyStaff(6, "심팀장", "마케팅");
	staffs[1]=new AcademyStaff(7, "나대리", "회계");
	
	System.out.println("--------AcademyMember전체출력---------");
	System.out.println("-------Student-----");
	for (int i = 0; i < students.length; i++) {
		students[i].print();
	}
	System.out.println("-------Gangsa-----");
	for (int i = 0; i < gangsas.length; i++) {
		gangsas[i].print();
	}
	System.out.println("-------Staff-----");
	for (int i = 0; i < staffs.length; i++) {
		staffs[i].print();
	}
	
	
	
	}
	
	
	
	

}
