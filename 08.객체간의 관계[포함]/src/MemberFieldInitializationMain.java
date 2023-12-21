
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
     System.out.println("1-1 인스턴스 멤버필드는 객체 생성 시 기본값으로 초기화");
		MemberFieldInitialization mFI1 = new MemberFieldInitialization();
		System.out.println( mFI1.member1);
		System.out.println( mFI1.member2);
		System.out.println( mFI1.member3);//'\u0000'
		System.out.println( mFI1.member4);
		System.out.println( mFI1.member5);
		System.out.println( mFI1.member6);
		System.out.println();
		System.out.println( mFI1.member11);
		System.out.println( mFI1.member22);
		System.out.println( mFI1.member33);//'\u0000'
		System.out.println( mFI1.member44);
		System.out.println( mFI1.member55);
		System.out.println( mFI1.member66);
		System.out.println("1-3. 생성자 초기화");
		MemberFieldInitialization mFI2= new MemberFieldInitialization
				(1, 0.3, '하', true, "문자1", null, 
						2, 0.8, '헤', false, "문자2", null); 
	
	}
	

}
