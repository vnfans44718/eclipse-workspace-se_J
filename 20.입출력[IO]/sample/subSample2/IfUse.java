
public class IfUse {

	public static void main(String[] args) {
		int no1 = 34;
		if (no1 % 2 == 0) {
			System.out.printf("%d 은 짝수입니다.\n", no1);
		} else {
			System.out.printf("%d 는 홀수입니다.\n", no1);
		}

		int no2 = 565;
		if (no2 % 4 == 0) {
			System.out.printf("%d 는 4의배수\n", no2);
		} else {
			System.out.printf("%d 는 4의배수아님\n", no2);
		}
		
		int kor=-34;
		
		if(kor>=0 && kor<=100) {
			System.out.printf("%d는 유효한점수\n",kor);
		}else {
			System.out.printf("%d는 안유효한점수\n",kor);
			
		}
		
		int year=2023;
		String msg="";
		if(year%4==0 && year%100!=0 || year%400==0) {
			msg="윤년";
		}else {
			msg="평년";
		}
		System.out.printf(" %d 년은 %s 입니다.\n",year,msg);
		
		char c='9';
		
		if(c>='A' && c<='Z') {
			System.out.printf("%c 는 알파벳대문자입니다.\n",c);
		}
		if(c>='a' && c<='z') {
			System.out.printf("%c 는 알파벳소문자입니다.\n",c);
		}
		if(c>='0' && c<='9') {
			System.out.printf("%c 는 숫자형태문자입니다.\n",c);
		}
		/*
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter='&';
		
		if((idFirstLetter>='A'&& idFirstLetter<='Z')||(idFirstLetter>='a'&& idFirstLetter<='z')) {
			System.out.printf("%c 유효한아이디 첫문자입니다.\n",idFirstLetter);
		}else {
			System.out.printf("%c 유효 안한아이디 첫문자입니다.\n",idFirstLetter);
			
		}
		
		

	}

}













