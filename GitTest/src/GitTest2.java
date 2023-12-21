
public class GitTest2 {

}


package com.itwill04.array.academy;

import java.util.Iterator;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		/*
		AcademyMember m1=new AcademyStaff();
		AcademyMember m2=new AcademyStudent();
		AcademyMember m3=new AcademyGangsa();
		*/
		
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")
		};
		
		System.out.println("1.AcademyMember 전체출력");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		
		
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo()==1) {
				members[i].print();
				break;
			}
		}
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo()==2) {
				members[i].print();
				break;
			}
		}
		
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals("KIM")) {
					members[i].print();
			}
		}
		/********************************z************************************************/
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].toString()==members[0].toString()) {
					members[i].print();
			}
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].toString()==members[5].toString()) {
					members[i].print();
			}
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].toString()==members[8].toString()) {
					members[i].print();
			}
		}
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].) {
				members[i].print();
			}
		}
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		/********************************************************************************/
	}

}
