
public class OperatorLogical {

	public static void main(String[] args) {
    boolean b1,b2,b3,b4;
    boolean result;
    
            b1=true;
    		b2=true;
    		b3=false;
    		b4=false;
    		
    		result = b1 || b2;
    		System.out.println("true || true -->"+result);
    		result = b1 || b3;
    		System.out.println("true || false -->"+result);
    		result = b3 || b1;
    		System.out.println("false || true -->"+result);
    		result = b3 || b4;
    		System.out.println("false || false -->"+result);
    		
//    		논리합 : 둘 다 거짓인 경우에만 거짓으로 출력

    		result = b1 && b2;
    		System.out.println("true && true -->"+result);
    		result = b1 && b3;
    		System.out.println("true && false -->"+result);
    		result = b3 && b1;
    		System.out.println("false && true -->"+result);
    		result = b3 && b4;
    		System.out.println("false && false -->"+result);
//    		논리곱 : 둘 다 참인 경우에만 참 출력
    		
//    		점수의 유효성 체크 [0~100 사이의 점수]
    		int kor=67;
    		int eng=90;
    		boolean condition1 = kor >= 0; 
    		boolean condition2 = kor <= 100;
    		boolean isValidScore = condition1 && condition2;
    		
    
    		System.out.println("국어 점수 유효성 체크:"+isValidScore);
    		
    		System.out.println(">> A대학 국어점수가 90점이상이거나 영어점수가 90점이상이면 합격");
    		boolean isPass1 =  (kor>=90) || (eng>=90);
    		System.out.println("\tA대학 합격 여부:"+isPass1);
    		
    		System.out.println();
    		
    		System.out.println(">> B대학 국어점수가 90점이상이고 영어점수도 90점이상이면 합격");
    		boolean isPass2 = (kor>=90) && (eng>=90);
    		System.out.println("\tB대학 합격 여부:"+isPass2);
//    		\t는 t가 문자가 아님을 명시 t만큼 떨어트려라 이스케이핑?? tap의 기능
    		
    		int math=89;
    		boolean isValidMathScore = (math >=0) && (math <=100);
    		System.out.println("수학점수의 유효성여부:"+isValidMathScore);
    		
    		boolean isInvalidMathScore = (math < 0) || (math>100);
    				System.out.println("수학점수의 유효하지않은지여부:"+isInvalidMathScore);
    		
    	    System.out.println("-------배수판별--------");
    	    int number=12;
    	    boolean isMutiple3 = (number % 3) == 0;
    	    System.out.println("3의 배수 여부:"+isMutiple3);
    	    boolean isMutiple4 = (number % 4) == 0;
    	    System.out.println("4의 배수 여부:"+isMutiple4);
    	    System.out.println("3과4의공배수:"+(isMutiple3 && isMutiple4));
    	    
    	    
    	    System.out.println();
    	    /*
    		 * Quiz: 윤년여부판단
    		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
    		        400의배수(400로나누어떨어지는수)가 윤년
    		 */
    		int year = 2023;
    		boolean isLeapYear1 = (year % 4) == 0;
    		boolean isLeapYear2 = ((year % 100) != 0) || ((year % 400) == 0) ;
//    		boolean isLeapYear = (year%4==0 && year % 100) != 0) || year % 400) == 0 ;
    		boolean isLeapYear3 = isLeapYear1 && isLeapYear2;
    		System.out.println(year+ "의 윤년여부:"+isLeapYear3);
    		
    		  System.out.println();
    		
    		
    		/*
    		 * Quiz: 한글여부판단
    		 *  
    		 */
    		char aa ='힣';
    		char ab ='가';
    		char c = '＠';	
    				
    		boolean isHangul = (aa>=c) && (ab<=c);
    		
    		System.out.println("한글여부:"+isHangul);
    		
    		  System.out.println();
    		
    		/*
    		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
    		 */
    		char idFirstLetter = '@';
    		char l1 = 'A';
    		char l2 = 'z';
    		
    	
    		boolean isValidIdFirstLetter = (l2>=idFirstLetter) && (l1<=idFirstLetter);
//    		소문자 대문자 나누어서 다시 해보기
    		System.out.println(idFirstLetter+" 의 적합성여부:"+isValidIdFirstLetter);
    		
    		
	}

}
