
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		
		/*
		  encapsulation 객체 멤버 필드에 데이터 대입
		 <<
		 */
		
		/*encapsulation.memberField1=123;
		encapsulation.memberField2=true;
		encapsulation.memberField3='김';
		encapsulation.memberField4=1.3142;*/
		
		encapsulation.setMemberField1(123);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(1.3142);
		
		/*
		 * encapsulation 객체멤버필드내용 출력
		 */
System.out.println(encapsulation.getMemberField1());
System.out.println(encapsulation.getMemberField2());
System.out.println(encapsulation.getMemberField3());
System.out.println(encapsulation.getMemberField4());

encapsulation.print();
	}

}
