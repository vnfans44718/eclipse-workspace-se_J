/*
 * 변수의 필요성
 * 
 */
public class VariableRequire {

	public static void main(String[] args) {
        System.out.println("----------변수사용안함----------------");	
		System.out.println("<< 점수출력 >>");
		System.out.println(80);
		System.out.println(95);
		System.out.println(89);
		System.out.println("<<총점출력>>");
		System.out.println(80+95+89);
		System.out.println("<<평균출력>>");
		System.out.println((80+95+89)/3);
		
		System.out.println("----------변수사용함----------------");
		int kor=80;
	    int eng=95;
	    int math=89;
		System.out.println("<< 점수출력 >>");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println("<<총점출력>>");
		System.out.println(kor+eng+math);
		System.out.println("<<평균출력>>");
		System.out.println((kor+eng+math)/3);
		
//	데이터 변경 시 변수에 대한 값을 수정하면 전체 데이터 수정 가능	
		
	}

}
