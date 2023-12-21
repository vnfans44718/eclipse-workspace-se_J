
public class VariableDeclaire {
public static void main(String[] args) {
	int score1;
	score1=178;
	System.out.println("score1="+score1);
	int score2=90;
	System.out.println("score2="+score2);
	
	int _number=333;
	int $number=444;
	int 번호=555;
//	int 7up=666;//	앞이 숫자기 때문에 변수 적용 x
	
	System.out.println("_number="+_number);
	System.out.println("$_number="+$number);
	System.out.println("번호="+번호);
	
	/*
	 * <<Duplicate local variable kor>>
	 int kor=99; kor 이미 한번 선언했기 때문에 x
	 */
	
	/*
	 * <<history cannot be resolved to a variable>>
	 *history=89; int(변수) 지정 x 
	 */
	/*
	 * int 7up;
	 * int mt-score 
	 * int your score
	 */
	
	int kor,eng,math;
	kor=90;
	eng=89;
	math=99;
	
}
}
