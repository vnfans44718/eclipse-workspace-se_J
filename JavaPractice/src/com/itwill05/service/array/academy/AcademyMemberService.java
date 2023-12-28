package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members;
	private static final String SORT_BY_STUDENT = "Student";
	private static final String SORT_BY_GANGSA = "Gangsa";
	private static final String SORT_BY_STAFF = "Staff";

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */

	public void academyMemberPrint() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember academyMemberReturn() {
		AcademyMember tempMember = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == 1) {
				tempMember = members[i];
			}
		}

		return tempMember;

	}

	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */

	public AcademyMember academyMemNameReturn(String name) {
		AcademyMember tempMember = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				tempMember = members[i];
				break;
			}
		}

		return tempMember;

	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */

	public AcademyMember[] returnByMembers(String memberType) {
		AcademyMember[] academyMember = null;
		if (memberType.equals(SORT_BY_STUDENT)) {
			academyMember = academyStudentReturn();
		}

		else if (memberType.equals(SORT_BY_GANGSA)) {
			academyMember = academyGangsaReturn();
		}

		else if (memberType.equals(SORT_BY_STAFF)) {
			academyMember = academyStaffReturn();
		}

		return academyMember;

	}

	private AcademyMember[] academyStudentReturn() {
		int count = 0;
		AcademyMember[] academyStudent = null;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				count++;
			}

		}
		academyStudent = new AcademyMember[count];
		int findcount = 0;

		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				academyStudent[findcount] = (AcademyStudent) academyMember;
				findcount++;
			}

		}
		return academyStudent;
	}

	private AcademyMember[] academyGangsaReturn() {
		int count = 0;
		AcademyMember[] academyGangsa = null;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				count++;
			}

		}
		academyGangsa = new AcademyMember[count];
		int findcount = 0;

		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				academyGangsa[findcount] = (AcademyGangsa) academyMember;
				findcount++;
			}

		}
		return academyGangsa;
	}

	public AcademyMember[] academyStaffReturn() {
		int count = 0;
		AcademyMember[] academyStaff = null;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				count++;
			}

		}
		academyStaff = new AcademyMember[count];
		int findcount = 0;

		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				academyStaff[findcount] = (AcademyStaff) academyMember;
				findcount++;
			}

		}
		return academyStaff;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */

	public AcademyMember[] membersByBelong(AcademyMember returnByMembers, String belong) {
		AcademyMember[] academyMember = null;

		if (returnByMembers instanceof AcademyStudent) {

			academyMember = academyBanStudent(belong);

		}

		else if (returnByMembers instanceof AcademyGangsa) {
			academyMember = academySubjectGangsa(belong);

		} else if (returnByMembers instanceof AcademyStaff) {
			academyMember = academyDepartStaff(belong);

		}

		return academyMember;

	}

	/*
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */

	private AcademyMember[] academySubjectGangsa(String belong) {
		int count = 0;
		AcademyMember[] academyGangsa = null;
		AcademyGangsa tempacademyMember = null;
		int findcount = 0;
		for (AcademyMember academyMember : members) {

			if (academyMember instanceof AcademyGangsa) {
				tempacademyMember = (AcademyGangsa) academyMember;
				if (tempacademyMember.getSubject().equals(belong)) {
					count++;
				}
			}

		}
		if (count == 0) {
			System.out.println("일치하는 정보가 없습니다.");

		}

		academyGangsa = new AcademyMember[count];

		for (AcademyMember academyMember : members) {

			if (academyMember instanceof AcademyGangsa) {
				tempacademyMember = (AcademyGangsa) academyMember;

			}

			if (tempacademyMember.getSubject().equals(belong)) {
				academyGangsa[findcount] = tempacademyMember;
				findcount++;
			}

		}

		return academyGangsa;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 */
	private AcademyMember[] academyBanStudent(String belong) {
		int count = 0;
		AcademyMember[] academyStudent = null;
		AcademyStudent tempacademyMember = null;
		int findcount = 0;
		for (AcademyMember academyMember : members) {

			if (academyMember instanceof AcademyStudent) {
				tempacademyMember = (AcademyStudent) academyMember;
				if (tempacademyMember.getBan().equals(belong)) {
					count++;
				}

			}
		}

		if (count == 0) {
			System.out.println("일치하는 정보가 없습니다.");

		}

		academyStudent = new AcademyMember[count];

		for (AcademyMember academyMember : members) {

			if (academyMember instanceof AcademyStudent) {
				tempacademyMember = (AcademyStudent) academyMember;

			}

			if (tempacademyMember.getBan().equals(belong)) {
				academyStudent[findcount] = tempacademyMember;
				findcount++;
			}

		}

		return academyStudent;

	}

	/*
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 */
	private AcademyMember[] academyDepartStaff(String belong) {
		int count = 0;
		AcademyMember[] academyStaff = null;
		AcademyStaff tempacademyMember = null;
		int findcount = 0;
		for (AcademyMember academyMember : members) {

			if (academyMember instanceof AcademyStaff) {
				tempacademyMember = (AcademyStaff) academyMember;
				if (tempacademyMember.getDepart().equals(belong)) {
					count++;
				}

			}
		}
		if (count == 0) {
			System.out.println("일치하는 정보가 없습니다.");

		}
		academyStaff = new AcademyMember[count];

		for (AcademyMember academyMember : members) {

			if (academyMember instanceof AcademyStaff) {
				tempacademyMember = (AcademyStaff) academyMember;

			}

			if (tempacademyMember.getDepart().equals(belong)) {
				academyStaff[findcount] = tempacademyMember;
				findcount++;
			}

		}

		return academyStaff;

	}

}