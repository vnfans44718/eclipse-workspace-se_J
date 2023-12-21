
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		int MembershipNumber,marriage;
		double height;
		char gender,grade,appearance;
		String name,num;
		boolean SmokingStatus;
		
		
		MembershipNumber=236514;
		name= "원주하";
		num="123456-78901";
	    gender='여';
		marriage=0;
		SmokingStatus=false;
		height=153.0;
		grade='A';
		appearance='중';
		
		System.out.println("********************************************************************");	
	 System.out.println("회원번호 :"+MembershipNumber);
	 System.out.println("이름 :"+name);
	 System.out.println("주민번호 :"+num);
	 System.out.println("성별 :"+gender);
	 System.out.println("결혼횟수 :"+marriage);
	 System.out.println("흡연여부 :"+SmokingStatus);
	 System.out.println("키 :"+height);
	 System.out.println("학점 :"+grade);
	 System.out.println("용모 :"+appearance);
	 System.out.println("********************************************************************");
	 System.out.println();
	 System.out.println("********************************************************************");
	 System.out.println("회원번호  이름   주민번호   성별  결혼횟수   흡연여부  키  학점  용모");
	 System.out.println("********************************************************************");
	 System.out.println(MembershipNumber+"  "+ name +"  "+ num +"  "+ gender +"    "+ marriage +"         "+ SmokingStatus +"   "+ height +"  "+ grade +"   "+ appearance);
	 
	 
	 

	}

}
