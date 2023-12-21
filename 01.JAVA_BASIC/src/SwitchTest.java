
/*
		switch 문
		
		 - 형식
		 
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	  
		    case 값_2:
		    	  stmt2;
		    	  break; 
		    	   
		    case 값_n:
		      stmt3;
		    	  break;
		     
		    default:
		      stmt4;
		      break;
		   }
		    
		   switch(변수)  변수값은 byte,short,int char,String  값이올수있다.(long 은안됨)
*/

public class SwitchTest {

	public static void main(String[] args) {

		int level = 3; // 게임 레벨 1~5 사이의 정수

		switch (level) {
		case 1:
			/* 명령문 기술 위치 */ // 여러 기술도 가능
			System.out.printf("초보");
			System.out.printf("초보");
			System.out.printf("초보");
			System.out.printf("초보");
			System.out.printf("초보");
			/*
			 * break --> swtich block를 빠져나간다.
			 */
			break;
		case 2:
			System.out.printf("중수");
			break;
		case 3:
			System.out.printf("고수");
			break;
		case 4:
			System.out.printf("고수");
			break;
		case 5:
			System.out.printf("고인물");
			break;

		default:
			 System.out.println("게임레벨 1~5사이의 정수입니다.");
			break;
		}

	}

}
