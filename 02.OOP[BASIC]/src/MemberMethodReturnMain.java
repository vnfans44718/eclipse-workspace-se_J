
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn memberMethodReturn = new MemberMethodReturn();

		int returnData1 = memberMethodReturn.method1();

		System.out.println("main block--> retrunData1:" + returnData1);

		boolean returnData2 = memberMethodReturn.method2();
		System.out.println("main block --> returnData2" + returnData2);

		if (memberMethodReturn.method2()) {
			System.out.println("결혼했습니다");
		} else {
			System.out.println("결혼안했습니다");
		}
		System.out.println("main block-->add(1,2) 반환 데이터:" + memberMethodReturn.add(1, 2));

		String name = "김수한";
		String returnMessage1 = memberMethodReturn.hello(name);
		System.out.println("main block --> returnMessage1:" + returnMessage1);
		System.out.println("returnMessage2:" + memberMethodReturn.hello("김경호"));
		
		
		System.out.println("***********getter 메소드 호출************");
		
		System.out.println(memberMethodReturn.getMemberField1());
		System.out.println(memberMethodReturn.getMemberField2());
		System.out.println(memberMethodReturn.getMemberField3());

		System.out.println("***********setter 메소드 호출************");
		memberMethodReturn.setMemberField1(100);
		memberMethodReturn.setMemberField2(200);
		memberMethodReturn.setMemberField3(300);
		
		System.out.println("***********getter 메소드 호출************");
		
		System.out.println(memberMethodReturn.getMemberField1());
		System.out.println(memberMethodReturn.getMemberField2());
		System.out.println(memberMethodReturn.getMemberField3());
		
	}

}
