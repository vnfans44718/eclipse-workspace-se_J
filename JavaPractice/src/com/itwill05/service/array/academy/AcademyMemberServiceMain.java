package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		System.out.println("1.AcademyMember 전체출력");
		AcademyMemberService academymembers = new AcademyMemberService();
		academymembers.academyMemberPrint();

		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember memberReturn = academymembers.academyMemberReturn();
		memberReturn.print();
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember memberNameReturn = academymembers.academyMemNameReturn("KIM");
		memberNameReturn.print();
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] academyStudent = academymembers.returnByMembers("Student");
		for (int i = 0; i < academyStudent.length; i++) {
			academyStudent[i].print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] academyGangsa = academymembers.returnByMembers("Gangsa");
		for (int i = 0; i < academyGangsa.length; i++) {
			academyGangsa[i].print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] academyStaff = academymembers.returnByMembers("Staff");
		for (int i = 0; i < academyStaff.length; i++) {
			academyStaff[i].print();
		}

		System.out.println("4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");

		AcademyMember[] academyJavaStudent = academymembers.membersByBelong(academyStudent[0], "자바");
		for (int i = 0; i < academyJavaStudent.length; i++) {
			academyJavaStudent[i].print();
		}

		System.out.println("4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");

		AcademyMember[] SalesStaff = academymembers.membersByBelong(academyStaff[0], "영업");
		for (int i = 0; i < SalesStaff.length; i++) {
			SalesStaff[i].print();
		}
		System.out.println("4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] academyJavaGangsa = academymembers.membersByBelong(academyGangsa[0], "자바");
		for (int i = 0; i < academyJavaGangsa.length; i++) {
			academyJavaGangsa[i].print();
		}
		System.out.println("---------------------------------------------");
		System.out.println();

	}

}